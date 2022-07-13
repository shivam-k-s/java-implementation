package weektwo_aasingment;

import java.util.ArrayList;

public class arraylistassingment {
	public static void main(String[] args) {
	ArrayList<String> months= new ArrayList<String>();
	months.add("January");
	months.add("February");
	months.add("March");
	months.add("April");
	ArrayList<String> months2= new ArrayList<String>();
	months.add("May");
	months.add("June");
	months.add("July");
	months.add("August");
	
	months.addAll(months2);
	System.out.println(months);
	
	//copying months to months2
	ArrayList<String> new_months= new ArrayList<String>(months);
	
	System.out.println(new_months);
	
	//removing arraylist elements
	new_months.removeAll(new_months);
	System.out.println(new_months);
	if(new_months.isEmpty()==true) {
		System.out.println("ArrayList is Empty");}
	else {
			System.out.println("ArrayList is Empty");
	}
	
	//Time the size of array
	months.trimToSize();
	
	//replace an element
	int index=months.indexOf("February");
	months.set(index,"December");
	System.out.println(months);
	
	//
	months.ensureCapacity(200);
	  
    System.out.println("ArrayList can store 200 elements.");
}
	
	}

