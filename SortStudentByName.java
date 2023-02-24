package com;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.name.compareTo(s2.name);//return s2.name.compareTo(s1.name);
	}

}
//x object to be insert
// y already existing object
//to compare string object , we are using compreTo() of String class-> line 10