package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class CoraCollectionMain {

	/**
	 * @param args
	 */
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static int a=10;
		//-------HASH MAP-------
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		hashMap.put(1, 2);
		hashMap.put(2, 3);
		hashMap.put(4, 5);
		hashMap.put(3, 8);
		hashMap.put(1, 4);
		
		hashMap.put(null, 5);
		
		System.out.println("===================Has Map=============");
		Iterator<Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry = it.next();
			System.out.println(" key :"+entry.getKey() + " Value :"+entry.getValue());
		}
		
		System.out.println("===================Tree Map=============");
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
		treeMap.put(3, 2);
		treeMap.put(1, 1);
		treeMap.put(2, 4);
		
		//treeMap.put(1, 7);
		treeMap.put(4, null);
		//treeMap.put(null, 9); // NULL KEY IS NOT SUPPORTED FOR TREE MAP
		Iterator<Entry<Integer, Integer>> tit = treeMap.entrySet().iterator();
		
		while(tit.hasNext()) {
			Entry entry = tit.next();
			System.out.println(" key :"+entry.getKey() + "Value :"+entry.getValue());
		}
		
		
		
		System.out.println("==================LINKED HASH MAP=====");
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		//lhm.putAll(treeMap);
		lhm.put(1, 2);
		lhm.put(2, 2);
		lhm.put(4, 5);
		lhm.put(null, 3);
		lhm.put(3, 4);
		
		lhm.put(null, 9);
		
		//Iterator<Integer> it2 = lhm.keySet().iterator();
		Iterator<Entry<Integer, Integer>> lit = lhm.entrySet().iterator();
		while(lit.hasNext()) {
			Entry entry = lit.next();
			System.out.println(" key :"+entry.getKey() + " Value :"+entry.getValue());
		}
		
		ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(10);
		
		ConcurrentHashMap<Integer, String> cmp = new ConcurrentHashMap<Integer, String>();
		blockingQueue.add("prasanna");
		blockingQueue.add("prasanna");
		blockingQueue.offer("prasanna");
	}

}
