package Assingment;

public class questionOne {
	public static void main(String args[]) {
		System.out.println("Printing first 10 fibonacci series");
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		int c=0,n=0;
		
		while(n<8) {
			c=b;
			b=a+b;
			a=c;
			System.out.print(b+" ");
			n++;
		}
	}
	

}
