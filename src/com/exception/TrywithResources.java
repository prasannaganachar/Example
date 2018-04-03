package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResources {

	public static void main(String[] args) throws Exception {
		/*try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\journaldev.txt")) || Myresourc Myresourc = new Myresourc()) {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		try (Myresourc Myresourc = new TrywithResources().new Myresourc()) {
			System.out.println("main try block");
			throw new Exception("try block exception");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(" message :" + e.getMessage());
		}
	}
	
	
	public class Myresourc implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println(" close method");
			
		}
	}

}
