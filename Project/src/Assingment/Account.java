package Assingment;

class Account {
	protected double bal;
	protected int acc;
	Account(){
		bal=0;
		acc=0;
	}
	Account(double b, int a){
		this.bal=b;
		this.acc=a;
	}
	
	public void deposit(double sum) {
		bal+=sum;
	}
	public void withdraw(double sum) {
		if(bal>=sum) 
		{
		bal-=sum;
		}
		else {
			System.out.println("This account don't have the given amount to debit");
		}
		
		
	}
	public double getBal() {
		return bal;
	}
	public int getAcc() {
		return acc;
	}
	public void accinfo() {
		System.out.println("Account no. "+acc+" Balance "+bal);
	}
	public void update_overdraft(int overdraft) {}
	public void addInterest(double in) {}
	
}
