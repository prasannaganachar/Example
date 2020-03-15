package com.algorithm;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Solution {

	
/*	public int calculateTimeTaken(int a[], int speed, int numberOffile) {
		
		Arrays.sort(a);
		 
		int numberOfsencond = 0;
		 
		for(int i=0;i<a.length;i++) {
		 
			double timeTaken = speed/(numberOffile-i);		
			numberOfsencond += Math.ceil(a[i]/timeTaken);
			
			if (a[i] == 0) {
				continue;
			}
			for(int j=i+1;j<a.length;j++) {
				a[j] = a[j]-a[i];
			}
		}

		return numberOfsencond;
	}
	
	public int getData() throws IOException {
		
          String url = "https://jsonmock.hackerrank.com/api/movies";
		
		URL obj = new URL(url);
		//private final String USER_AGENT = "Mozilla/5.0";
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", "Mozilla/5.0");

		int responseCode = con.getResponseCode();
		return 0;
	}*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Solution d = new Solution();
		
		System.out.println("prasanna");
		
		//d.getData();
		
		int a[] = {84, 53, 96, 101, 53, 87, 89,42};
		
		int b[] = {79,64,23,53,47,103,100,109,68};
		
		int c[] = {30,24,26,25,100,98,78};
		
		//System.out.println("A array value : " +d.calculateTimeTaken(a, 23, 8));
		
		//System.out.println("B array value : " +d.calculateTimeTaken(b, 17, 9));
		
		//System.out.println("C array value : " +d.calculateTimeTaken(c, 15, 7));
	}

}
