package Assingment_question_3;

public class employee {
	int empid;
	String empfname; 
	String emplname; 
	String empcity;
	String empstate;
	employee(){
		this.empid=0;
		this.empfname="";
		this.emplname="";
		this.empcity="";
		this.empstate="";
	}
	employee(int empid, String empfname, String emplname, String empcity, String empstate){
		this.empid=empid;
		this.empfname=empfname;
		this.emplname=emplname;
		this.empcity=empcity;
		this.empstate=empstate;
	}
}
