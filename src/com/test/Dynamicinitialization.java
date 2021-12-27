package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dynamicinitialization {

	public static void main(String[] args)throws NumberFormatException,IOException {
InputStreamReader isr=new InputStreamReader(System.in);
 
    BufferedReader ob=new  BufferedReader(isr);
		
		
	//BufferedReader	ob=new BufferedReader(new InputStreamReader(System.in));

long a,b;
String name;
char x;

 System.out.println("Enter Your Name: ");
 name=ob.readLine();
 
 System.out.println("Enter the value of a");
 a=Long.parseLong(ob.readLine());

 System.out.println("Enter the value of b");
 b=Long.parseLong(ob.readLine());

 System.out.println("sum="+(a+b)); 

 System.out.println("Enter any Character value: ");
 x=(char) ob.read();
 
 System.out.println(name);
 System.out.println(x);
 
 
 

	}

}
