package Pack;

class student {
	private int sid;
	private String  sfname;
	private String  slname;
	private int sclass;
	student(int sid, String  sfname, String  slname, int sclass){
		this.sid=sid;
		this.sfname=sfname;
		this.slname=slname;
		this.sclass=sclass;
	}

	public String toString() {
		return "Student id: "+sid+" Student Name: "+sfname+" "+slname+" Student class: "+sclass;
	}
}
