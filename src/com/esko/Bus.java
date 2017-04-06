package com.esko;
import java.util.Date;


public class Bus implements Comparable<Bus>{
	
	String name;
	Date arrivalDate;
	Date departureDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	@Override
	public int compareTo(Bus bus) {
		// TODO Auto-generated method stub
		
		return bus.arrivalDate.compareTo(this.arrivalDate);
	}
	
	@Override
	public boolean equals(Object obj) {
	    // TODO Auto-generated method stub
	    if(obj instanceof Bus)
	    {
	        Bus temp = (Bus) obj;
	        if(this.name == temp.name && (this.arrivalDate.compareTo(temp.arrivalDate)==0) && (this.departureDate.compareTo(temp.departureDate))==0)
	            return true;
	    }
	    return false;

	}
	
	@Override
	public int hashCode() {
	    // TODO Auto-generated method stub

	    return (this.name.hashCode() + this.arrivalDate.hashCode() + this.departureDate.hashCode());        
	}

}
