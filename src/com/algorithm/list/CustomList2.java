package com.algorithm.list;

import javax.naming.NameNotFoundException;

public class CustomList2 {

  Node2 root;
  class Node2 {
    int data;
    Node2 next;
    Node2(){}
    Node2(int a) {
      this.data = a;
    }

    @Override
    public String toString() {
      return "Data:" +this.data + "Node:"+this.next;
    }
  }

  public void insert(int a) {
    Node2 node = new Node2(a);
    if (root == null) {
      root = node;
      return;
    }
    Node2 head = root;

    while(head.next != null) {
      head = head.next;
    }
    head.next=node;
    return;
  }

  public void insertAtBegining(int a) {
    Node2 node = new Node2(a);
    if(root == null) {
      root = node;
      return;
    }
    node.next = root;
    root = node;
    return;
  }

  public void delete(int a) {
    if(root == null) {
      System.out.println("There is no data!");
      return;
    }
    Node2 head = root;
    while (head != null) {
      if(head.equals(root) && head.data == a) {
        root = head.next;
        return;
      }
      else if(head.next.data == a){
        head.next = head.next.next;
        head = head.next;
        return;
      }
    }
  }

  public void display() {
    Node2 head = root;

    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }
    System.out.println("***********Display END***********");
  }

  public static void main(String[] arg) {
    CustomList2 customList2 = new CustomList2();
   customList2.insert(2);
    customList2.insert(3);
    customList2.delete(3);
    customList2.display();
    customList2.insert(7);
    customList2.insert(9);
    customList2.insert(1);
   // customList2.delete(3);
    customList2.display();

    CustomList2 customList = new CustomList2();
    customList.insertAtBegining(2);
    customList.insertAtBegining(3);
    customList.insertAtBegining(7);
    customList.insertAtBegining(9);
    customList.insertAtBegining(1);
    customList.display();

  }


}
