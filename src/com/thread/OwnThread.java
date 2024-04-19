package com.thread;

public class OwnThread {

    static Object obj = new Object();
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Own Thread");

        oddThread t1 = new oddThread();

        Thread t2 = new Thread(new evenThread());
        t2.start();
        t2.join(1000);
        t1.start();
    }

    static class  oddThread extends  Thread {
        public void run() {
            System.out.println("oddThread run method");
            synchronized (obj) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 1) {
                        try {
                            System.out.println(i);
                            // obj.notify();
                            // obj.wait();
                        }/* catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }*/ finally {

                        }

                    }
                }
            }
        }
    }

    static class evenThread implements Runnable {

        @Override
        public void run() {
           System.out.println("even Thread run method");
            synchronized (obj) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        try {
                            System.out.println(i);
                            // obj.wait();
                            // obj.notify();
                        } /*catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }*/ finally {

                        }

                    }
                }
            }
        }
    }
}
