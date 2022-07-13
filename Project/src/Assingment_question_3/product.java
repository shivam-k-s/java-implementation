package Assingment_question_3;

public class product {
	int pid;
	String pfname; 
	String pdescription; 
	int pprice;
	product(){
		this.pid=0;
		this.pfname="";
		this.pdescription="";
		this.pprice=0;
	}
	product(int pid, String pfname, String pdescription, int pprice){
		this.pid=pid;
		this.pfname=pfname;
		this.pdescription=pdescription;
		this.pprice=pprice;
	}
}
