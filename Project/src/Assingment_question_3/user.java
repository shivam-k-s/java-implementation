package Assingment_question_3;

public class user {
	int userid;
	String userfname; 
	String userlname; 
	String usercity;
	user(){
		this.userid=0;
		this.userfname="";
		this.userlname="";
		this.usercity="";
	}
	user(int userid, String userfname, String userlname, String usercity){
		this.userid=userid;
		this.userfname=userfname;
		this.userlname=userlname;
		this.usercity=usercity;
	}
}
