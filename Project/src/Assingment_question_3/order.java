package Assingment_question_3;

public class order {
	int ordid;
	String ordname; 
	String orddescription; 
	int ordprice;
	order(){
		this.ordid=0;
		this.ordname="";
		this.orddescription="";
		this.ordprice=0;
	}
	order(int ordid, String ordname, String orddescription, int ordprice){
		this.ordid=ordid;
		this.ordname=ordname;
		this.orddescription=orddescription;
		this.ordprice=ordprice;
	}
}

