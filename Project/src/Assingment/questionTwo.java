package Assingment;
import java.util.*;
public class questionTwo {
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number: ");
		a=sc.nextInt();
		System.out.println("Input the second number: ");
		b=sc.nextInt();
		System.out.println("Input the third number: ");
		c=sc.nextInt();
		System.out.println("The average value is "+((float)(a+b+c)/3));
		sc.close();
	}
}
