package com.comparable;

import java.util.Comparator;

public abstract class ComparatorClass implements Comparator<SortComparable>{

	@Override
	public int compare(SortComparable o1, SortComparable o2) {
		// TODO Auto-generated method stub
		
		return ((SortComparable) o1).getName().compareTo(((SortComparable) o2).getName());
	}
}
