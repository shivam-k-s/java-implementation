package Assingment_question_2;

public class Employee {
	Person person;
	double annual_salary;
	int join_year;
	String national_insurance_no;
	Employee(){
		this.person=null;
		this.annual_salary=0.0;
		this.join_year=0;
		this.national_insurance_no="";
	}
	Employee(String name, double annual_salary, int join_year, String national_insurance_no){
		this.person=new Person(name);
		this.annual_salary=annual_salary;
		this.join_year=join_year;
		this.national_insurance_no=national_insurance_no;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public String getPersonName() {
		return person.name;
	}
	
	public double getAnnualSalary() {
		return annual_salary;
	}
	
	public int getJoinYear() {
		return join_year;
	}
	
	public String getNationalInsuranceNo() {
		return national_insurance_no;
	}
}
