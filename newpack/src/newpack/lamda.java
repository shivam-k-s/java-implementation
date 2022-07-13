package newpack;
//static method reference//
import java.util.ArrayList;

interface j{
	public String vlf();
	
}
public class lamda {
	public static String  l() {
		return "kl";
	}
 public static void main(String[] args) {
	 j obj=lamda::l;
	 System.out.println(obj.vlf());
	ArrayList<String> al= new ArrayList<String>();
	al.add("Hello");
	
	al.forEach((str)->{System.out.println(str);});
}
	
	
 
}
