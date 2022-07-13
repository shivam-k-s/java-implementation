package Assingment_question_2;

public class Obj {
	public static void main(String[] args) {
		Employee emp=new Employee("Name Singh",6.7,2022,"XXXXXXXXX");
		System.out.println("Name: "+emp.getPersonName());
		System.out.println("Annual Salary: "+emp.getAnnualSalary());
		System.out.println("Joining year: "+emp.getJoinYear());
		System.out.println("National Insurance Number: "+emp.getNationalInsuranceNo());

	}
}
