package com.java.constructoroverloading;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product id ");
		long id=s.nextLong();
		s.nextLine();
		System.out.println("Enter the product name ");
		String name=s.nextLine();
		System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no ");
		String ans=s.nextLine();
		ans=ans.toLowerCase();
		System.out.println(ans);
		if(ans.equals("yes")) {
			Product p=new Product(id,name);
			p.display();
		}
		else {System.out.println("Enter the supplier name ");
		String sup=s.nextLine();
		Product p=new Product(id,name,sup);
		p.display();
		}
		
	}

}
