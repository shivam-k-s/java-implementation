package newpack;
interface lq{
	public void lw();
}
public class constructorrefernce {
	constructorrefernce(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		lq o=constructorrefernce::new;
		o.lw();
	}
}
