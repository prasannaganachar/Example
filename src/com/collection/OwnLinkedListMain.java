package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;

public class OwnLinkedListMain {

	private static final int String = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LinkedHashSet<Node> nodeSet = new LinkedHashSet<>();
		
		nodeSet.add(new Node(10));
		nodeSet.add(new Node(10));
		
		
		Iterator<Node> itSet = nodeSet.iterator();
		
		//System.out.println(" List Size" +((HashSet<Node1>) itSet).size());
		while(itSet.hasNext()) {
			
			Node node = (Node)itSet.next();
			System.out.println(" list vale :"+node.getData());
		}*/
		
		OwnLinkedList list = new OwnLinkedList();
		list.add("10");
		list.add("20");
		//System.out.println("list value"+list.get(1));
		
		//ArrayList<Integer> llist = new ArrayList<>();
		
		LinkedList<Integer> llist1 = new LinkedList<>();
		
		LinkedHashSet<Integer> llist = new LinkedHashSet<>();
		
				
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(10);
		
		Iterator<Integer> ilist = llist.iterator();
		
		System.out.println(" List Size" +llist.size());
		while(ilist.hasNext()) {
			System.out.println(" list vale :"+ilist.next());
			//ilist.remove();
			//llist.remove(ilist.next());
		}
		
		System.out.println(" List Size" +llist.size());
		
		while(ilist.hasNext()) {
			System.out.println(" list vale :"+ilist.next());
		//	ilist.remove();
		}
		//LinkedHashSet<String> sset = new HashSet<>();
		
		//ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>(3);
		
		LinkedHashMap<Integer, String> chm = new LinkedHashMap<>(3);
		
		chm.put(10, "test1");
		chm.put(20, "test2");
		chm.put(30, "test3");
		
		chm.put(40, "test4");
		
		System.out.println("size :"+chm.size());
		
		
		Set<Map.Entry<Integer, String>> set = chm.entrySet();
		
		Iterator<Entry<Integer, java.lang.String>> x = chm.entrySet().iterator();

		System.out.println(" Size chm :"+chm.size());
		while (x.hasNext()) {
			Map.Entry<Integer, String> entry = x.next();
			System.out.println(" Key "+entry.getKey() + "  "+ "Val :" + entry.getValue());
			//x.remove();
			chm.remove(entry.getKey());
			
		}
		
		System.out.println(" Size chm :"+chm.size());
		/*
		LinkedHashMap<Integer, String>  hm = new LinkedHashMap<>(3);
		
		hm.put(10, "test1");
		hm.put(20, "test2");
		hm.put(30, "test3");
		
		hm.put(40, "test4");
		
		System.out.println("size :"+hm.size() + hm.get(40));
		
		
		ArrayList<Integer> al = new ArrayList<>(3);
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		ListIterator<Integer> it = al.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//al.remove(it.next());
		}
		
		ConcurrentHashMap<Integer, Integer> chm1 = new ConcurrentHashMap<Integer, Integer>(5, 10, 20);
		
*/		
	}

}
