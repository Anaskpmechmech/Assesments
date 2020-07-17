package lamdatTraining;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithLambda {

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>(Arrays.asList(
				new Person("Anas ","abu"),
				new Person("monu ","muth"),
				new Person("sanu ","thanu"),
				new Person("clanu ","ponnu"),
				new Person("xan ","then")));
		int a[]= {1,2,3,4,5,6};
		for(Integer i:a) {
			if(i<3) {
				System.out.println(i);
				System.out.println(Math.PI);
				
		}}
	Collections.sort(list,(person1,person2)->person1.getLastName().compareTo(person2.getLastName()));

	int b=12;
	double result=Math.abs(-29);
	System.out.println(result);
	
	}}
		
