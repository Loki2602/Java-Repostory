package com.demo;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		float X,Y;
		boolean s;
		String name;
		
		
		System.out.println("Enter Your Name:");
		name=ob.next();
		
		System.out.println("Please enter Boolean Value");
		s=ob.nextBoolean();
		
		System.out.println(name);
		System.out.println(s);
		
		
		System.out.println("Enter the value of X:");
		X=ob.nextFloat();
		
		System.out.println("Enter the value of Y:");
		Y=ob.nextFloat();
		
		System.out.println("Addition="+(X+Y));
		ob.close();
		
	}

}
