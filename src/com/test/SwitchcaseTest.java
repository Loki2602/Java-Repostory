package com.test;

import java.util.Scanner;

public class SwitchcaseTest {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int x;
		System.out.println("Enter any number between 1 to 7");
		x=ob.nextInt();
		
		switch(x) // control variable
		{
		case 1: System.out.println("Its Sunday");
                break;
		case 2: System.out.println("Its Monday");
        break;        
		case 3: System.out.println("Its Tuesday");
        break;
		case 4: System.out.println("Its Wednesday");
        break;
		case 5: System.out.println("Its Thursday");
        break;
		case 6: System.out.println("Its Friday");
        break;
		case 7: System.out.println("Its Saturday");
        break;
        default:System.out.println("Wrong Input !!");
        
		}
		
		
		
		
		

	}

}
