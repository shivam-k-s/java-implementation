package Assingment;

class savingsaccount extends Account{
	
	double interest=0.0;
	savingsaccount(double bal,int acc,double in){
		super(bal,acc);
		this.interest=in;
	}
	public void addInterest(double in) {
		interest+=in;
	}
	public void accinfo() {
		System.out.println("Savings account =>\n Account no. "+super.acc+"\n Balance "+super.bal+"\n Interest "+interest+"\n");
	}
	
}

class currentaccount extends Account{
	
	int overdraft_limit=0;
	currentaccount(double bal,int acc,int overdraft){
		super(bal,acc);
		this.overdraft_limit=overdraft;
	}
	public void update_overdraft(int overdraft) {
		this.overdraft_limit=overdraft;
	}
	public void accinfo() {
		System.out.println("Current Account =>\n Account no. "+super.acc+"\n Balance "+super.bal+"\n Overdraft Limit "+overdraft_limit+"\n");
	}
}

class Bank {
	Account arr[]=new Account[2];
	int i=0;
	
	public void opensavingsaccount(double bal,int acc, double in) {
			arr[i]=new savingsaccount(bal,acc,in);
			i++;
	}		
		
	public void opencurrentaccount(double bal,int acc, int overdraft) {
		arr[i]=new currentaccount(bal,acc,overdraft);
		i++;
	}
	public void closeaccount(int acc) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q]=null;
				break;
			}
			q++;
		}
		}
	public void depositamount(int acc, double sum) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q].deposit(sum);
				break;
			}
			q++;
		}
		}
	public void withdrawmount(int acc, double sum) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q].withdraw(sum);
				break;
			}
			q++;
		}
		}
	public void update(int acc, double interest) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q].addInterest(interest);
				break;
			}
			q++;
		}
	}
	public void update(int acc, int overdraft) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q].update_overdraft(overdraft);
				break;
			}
			q++;
		}
	}
	public void displayaccount(int acc) {
		int q=0;
		while(q<10) {
			if(acc==arr[q].acc) {
				arr[q].accinfo();
				break;
			}
			q++;
		}
		}
	}

public class questionFour{
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.opensavingsaccount(00.00,000001,9.0);
		bank.opencurrentaccount(50, 000002, 500000);
		
		bank.depositamount(000001, 10000.00);
		bank.depositamount(000002, 500.00);
		
		bank.update(000001,4.0);
		bank.update(000002,100000);
		
		bank.displayaccount(000001);
		bank.displayaccount(000002);
	}
	
}


	
	
