package newpack;
interface l{
	public void lw();
}
public class instancemethodreference {
	public void f() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		instancemethodreference i =new instancemethodreference();
	l o=i::f;
	o.lw();
}
}
