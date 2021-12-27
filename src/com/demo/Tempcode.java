package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tempcode {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double c,f;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter The value of c:");	
		c=Double.parseDouble(ob.readLine());
		
		System.out.println("Enter The value of f:");	
	    f=Double.parseDouble(ob.readLine());
		
		
		f=(9*c/5)+32;
		
		
		System.out.println("Temperature: "+f);
		
	}
}	
		

