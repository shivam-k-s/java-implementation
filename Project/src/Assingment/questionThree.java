package Assingment;

import java.util.Scanner;

public class questionThree {
	public static void main(String args[]) {
		float a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the float number: ");
		a=sc.nextFloat();
		if(a==0.0) {
			System.out.println("Zero");
		}
		else if(a>0.0) {
			System.out.println("Positive ");
			if(a<1.0) {
				System.out.println("Small");
			}
			else if(a==1000000.0) {
				System.out.println("Large");
			}
		}
		else  {
			System.out.println("Negative");
		}
		
	    sc.close();
	}
}
