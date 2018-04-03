package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingInputFromConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter name:");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" please enter age :");
		
		try {
			System.out.println("Name : " +bufferedReader.readLine());
			System.out.println("age is :" +scanner.nextInt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
