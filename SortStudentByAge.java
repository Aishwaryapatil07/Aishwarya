package com;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>{
	
	

	@Override
	public int compare(Student s1, Student s2) {
	
		return s1.age-s2.age; //return y.age-x.age;
	}
}
