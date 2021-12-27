package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simpleinterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	double p,r,t,i;
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader ob=new BufferedReader(in);
	
	System.out.println("Enter The Principle Amount:");	
	p=Double.parseDouble(ob.readLine());
	
	System.out.println("Enter The Rate Of Interest:");	
	r=Double.parseDouble(ob.readLine());
	
	System.out.println("Enter The Time Amount:");	
	t=Double.parseDouble(ob.readLine());
	
	i=(p*t*r)/100;
	
	System.out.println("Interest amount : "+i);
	
	
	
	
		
		
		

	}

}
