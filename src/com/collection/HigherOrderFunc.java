package com.collection;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class HigherOrderFunc {

  public static void main(String[] args) {
    System.out.println("Higer order function");

    Integer[] arrs = new Integer[]{1,2,4,5,6};

    LinkedList<Integer> ls = new LinkedList<>();
    Integer sum = Arrays.stream(arrs).reduce((count, value) -> {
            return count += value;
    }).get();

    Integer maxRes = Arrays.stream(arrs).reduce((max, value) -> {
      if(value > max) max = value;
      return max;
    }).get();

    System.out.println("Sum Of value:" +sum);
    System.out.println("Maximum Of value:" +maxRes);

    Integer[] filter = Arrays.stream(arrs).filter((value -> value >= 5)).collect(Collectors.toList()).toArray(new Integer[0]);
    System.out.println("Filtered value:" +filter);

    int n = 5;
    List<Integer> s = new Stack<Integer>();

    // Appending the new elements
    // at the end of the list
    for (int i = 1; i <= n; i++)
      s.add(i);

    // Printing elements
    System.out.println(s);

    // Remove element at index 3
    s.remove(3);

    // Displaying the list after deletion
    System.out.println(s);

    // Printing elements one by one
    for (int i = 0; i < s.size(); i++)
      System.out.print(s.get(i) + " ");

  }
}
