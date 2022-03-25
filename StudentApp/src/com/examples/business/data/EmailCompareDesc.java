package com.examples.business.data;

import java.util.Comparator;

public class EmailCompareDesc implements Comparator<Student> 
	{
	public int compare(Student s1, Student s2)
	{
		return s1.getEmail().compareTo(s2.getEmail());
	}
		
}