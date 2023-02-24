package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		Student s1= new Student(21, "Aishwarya Patil");
		Student s2= new Student(22, "Sunny Patil");
		Student s3= new Student(23, "Aditya Patil");

		Map<Integer, Student> map= new LinkedHashMap<Integer, Student>();

		map.put(202,s1);//map.put(202, new Student(21,"Aishwarya Patil");
		map.put(231,s2);//map.put(231, new Student(22,"Sunny Patil");
		map.put(253,s3);//map.put(253, new Student(23,"Aditya Patil");

		//converting map into set of keys using kaySet()
		Set<Integer> keys= map.keySet();//202, 231,253


		//creating instance of arraylist and storing into list reference variable
		List <Student>list= new ArrayList<Student>();
		

		//traversing the keys
		for(int key: keys)
		{
			Student std=map.get(key);//getting the value(student object)
			list.add(std); // adding the value(student object) into arraylist
			System.out.println(std); // printing the values(student object)

		}
		System.out.println("---------------");
		System.out.println("1.Sort based on Age\n2.Sort based on Name\n3.Exit\nEnter The Choice");
		int chioce= ip.nextInt();
		switch(chioce)
		{
		case 1:
			  Collections.sort(list,new SortStudentByAge());
			  for(Student s:list)
			  {
				  System.out.println(s);
			  }
			  break;
		case 2:
			  Collections.sort(list,new SortStudentByName());
			  for(Student s:list)
			  {
				  System.out.println(s);
			  }
			  break;
		default:
			  System.out.println("Invalid Choice");
			  break;	  
		}
	}

}
