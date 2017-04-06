package com.esko;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class FileRead {

	/**
	 * @param args
	 */
	
	public static LinkedList<Bus> removeDupicate(LinkedList<Bus> list) {
		LinkedList<Bus> removeList = new LinkedList<>();
		Iterator<Bus> it = list.iterator();
		
		for (int i=0; i<list.size();i++) {
			Bus bus = list.get(i);
			//if (bus.getArrivalDate().compareTo(bus2.getArrivalDate())) {
			long diff = Math.abs(bus.getArrivalDate().getTime() - bus.getDepartureDate().getTime());
			long diffDays = diff / (24 * 60 * 1000);
			if (diffDays <= 1) {
				for (int j=i+1;j<list.size();j++) {
					Bus bus2 = list.get(j);
					if(bus.getArrivalDate().compareTo(bus2.getArrivalDate()) == 0) {
						if (bus.getDepartureDate().compareTo(bus2.getDepartureDate()) == 1) {
							removeList.add(bus);
						}
						else if (bus.getDepartureDate().compareTo(bus2.getDepartureDate()) == 0) {
							removeList.add(bus2);
						} 
					}
				}
			}
			else {
				removeList.add(bus);
			}
		}
		
		list.removeAll(removeList);
		return list;
		
	}
	private static final String FILENAME = "c:\\esko\\bustimetableoutput1.txt";
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		File file = new File("c:/esko/bustimetable.txt");
		FileInputStream fis = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		Bus bus = null;
		
		LinkedList<Bus> jailist = new LinkedList<Bus>();
		LinkedList<Bus> verlist = new LinkedList<Bus>();
		//HashSet<Bus> linkset = new HashSet<>();

		try {
			//File Read block
			fis = new FileInputStream(file);
			br =  new BufferedReader(new FileReader("c:/esko/bustimetable.txt"));
			
			//file wirte block
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);		

	       //One way of reading the file
		   System.out.println("Reading the file using readLine() method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
			   
		      String[] spiltArray = contentLine.split(" ");
		      
		      if (spiltArray.length > 1 ) {
		    	  bus = new Bus();
		    	  
		    	  bus.setName(spiltArray[1]);
		    	  String[] arrdatstr = spiltArray[2].split(":");
		    	  		    	  
		    	  Calendar cal = Calendar.getInstance();
		    	  cal.set(Calendar.HOUR_OF_DAY,Integer.parseInt(arrdatstr[0]));
		    	  cal.set(Calendar.MINUTE,Integer.parseInt(arrdatstr[1]));
		    	  cal.set(Calendar.SECOND,0);
		    	  cal.set(Calendar.MILLISECOND,0);

		    	  Date d = cal.getTime();
		    	  bus.setArrivalDate(d);
		    	  
		    	  String[] depdatstr = spiltArray[3].split(":");
		    	 		    	  
		    	  Calendar decal = Calendar.getInstance();
		    	  decal.set(Calendar.HOUR_OF_DAY,Integer.parseInt(depdatstr[0]));
		    	  decal.set(Calendar.MINUTE,Integer.parseInt(depdatstr[1]));
		    	  decal.set(Calendar.SECOND,0);
		    	  decal.set(Calendar.MILLISECOND,0);

		    	  Date depd = decal.getTime();
		    	  bus.setDepartureDate(depd);
		    	  
		    	  if (bus.getName().equals("Jai")) {
		    		  jailist.add(bus);  
		    	  }
		    	  else {
		    		  verlist.add(bus);
		    	  }
		    	  
		      }
		     contentLine = br.readLine();
		   }

		   HashSet<Bus> jaset = new HashSet<>();
		   jaset.addAll(jailist);
		   jailist = new LinkedList<Bus>();
		   jailist.addAll(jaset);
		   
		   HashSet<Bus> veerset = new HashSet<>();
		   veerset.addAll(verlist);
		   verlist = new LinkedList<Bus>();
		   verlist.addAll(veerset);
		   
		   
		   LinkedList<Bus> noDupicate = FileRead.removeDupicate(jailist);
		   LinkedList<Bus> noDupicate2 = FileRead.removeDupicate(verlist);
		   
		   
		   Collections.sort(jailist);
		   Collections.sort(verlist);
		   Iterator<Bus> ite = jailist.iterator();
		   
		   /*while(ite.hasNext()) {
			   Bus b1 = (Bus)ite.next();
			   System.out.println(" Name :"+b1.getName() + " Arr Date :" + b1.getArrivalDate() + " Dep date :"+ b1.getDepartureDate());
		   }*/
		   
		   /*Iterator<Bus> ite2 = verlist.iterator();
		   
		   while(ite2.hasNext()) {
			   Bus b2 = (Bus)ite2.next();
			   System.out.println(" Name :"+b2.getName() + " Arr Date :" + b2.getArrivalDate() + " Dep date :"+ b2.getDepartureDate());
		   }*/
		   /*System.out.println("=====Jai Bus Entries===");
		   while(ite.hasNext()) {
			   Bus b1 = (Bus)ite.next();
			   System.out.println(" Name :"+b1.getName() + " Arr Date :" + b1.getArrivalDate() + " Dep date :"+ b1.getDepartureDate());
		   }
		   
		   */
		   
		   
		   int[] remoidx = null;
		   LinkedList<Bus> removejbus = new LinkedList<>();
		   LinkedList<Bus> removevbus = new LinkedList<>();
		   for (int i=0;i<jailist.size();i++) {
			   Bus jbus = jailist.get(i);
			   for (int j=0;j<verlist.size();j++) {
				   Bus vbus = verlist.get(j);
				   
				   if (jbus.getArrivalDate().compareTo(vbus.getArrivalDate()) == 0 && 
						   jbus.getDepartureDate().compareTo(vbus.getDepartureDate()) == 0) {
					   removevbus.add(vbus);
				   }
				   else if (jbus.getArrivalDate().compareTo(vbus.getArrivalDate()) == 0) {
					   if (jbus.getDepartureDate().compareTo(vbus.getDepartureDate()) == 1) {
						//remove jbus entries
						   removejbus.add(jbus);
					   }
					   else {
						   removevbus.add(vbus);
					   }
				   }
				   else if (jbus.getArrivalDate().compareTo(vbus.getArrivalDate()) == 1 &&
						   jbus.getDepartureDate().compareTo(vbus.getDepartureDate()) == 0) {
					   removevbus.add(vbus);
				   }
			   }
		   }
		   
		   jailist.removeAll(removejbus);
		   verlist.removeAll(removevbus);
		   
           Iterator<Bus> ite1 = jailist.iterator();
		   
		   while(ite1.hasNext()) {
			   Bus b1 = (Bus)ite1.next();
			   int hour = b1.getArrivalDate().getHours();
			   int time = b1.getArrivalDate().getMinutes();
			   String arrStr = hour+":"+time;
			   int hour2 = b1.getDepartureDate().getHours();
			   int time2 = b1.getDepartureDate().getMinutes();
			   String depStr = hour2+":"+time2;
			   String content = "<service> Jai "+arrStr+ " "+depStr;
			   bw.write(content+"\n");
		   }
		   bw.write("               \n");
		   
		   
		   Iterator<Bus> ite2 = verlist.iterator();
		   
		   while(ite2.hasNext()) {
			   Bus b2 = (Bus)ite2.next();
			   int hour = b2.getArrivalDate().getHours();
			   int time = b2.getArrivalDate().getMinutes();
			   String arrStr = hour+":"+time;
			   int hour2 = b2.getDepartureDate().getHours();
			   int time2 = b2.getDepartureDate().getMinutes();
			   String depStr = hour2+":"+time2;
			   String content = "<service> Veer "+arrStr+ " "+depStr;
			   bw.write(content+"\n");
		   } 
		   
		   bw.write("end-of-file\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
