package lamdatTraining;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithoutLamdaExpression {

	public static void main(String[] args) {
		List<Person> list=Arrays.asList(
				new Person("znas","hammed"),
				new Person("Anas","ammed"),
				new Person("cabu","Thendi"),
				new Person("pabu","Thendaai"),
				new Person("BaBu","Thendaaai"));
		
	
		System.out.println("Before sorting");	
	System.out.println("______________________");
	printAll(list);
	System.out.println("______________________");
	
	System.out.println("lastname statr with A or a");	
	System.out.println("______________________");
	printLastNameBeginWitha(list);
	System.out.println("______________________");
	
		
			
Collections.sort(list, new Comparator<Person>() {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getFirstName().compareTo(p2.getFirstName());
	}
});
System.out.println("After sorting");
System.out.println("______________________");
printAll(list);
System.out.println("______________________");
	
	
	}

	public static void printLastNameBeginWitha(List<Person> list) {
		for(Person p:list) {
			String s=null;
			s=p.getFirstName();
			s=s.toLowerCase();
			if(s.startsWith("a")) {
				System.out.println(p);
		
	}}}

	public static void printAll(List<Person> list) {
	for(Person p:list) {
		System.out.println(p);
	}}}
	
		
		
		
		
		
		
		
	

