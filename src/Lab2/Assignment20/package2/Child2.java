package Lab2.Assignment20.package2;
import Lab2.Assignment20.package1.Base;

public class Child2 extends Base {
	public void getValues() {
		Base base=new Child2();
		System.out.println(variable3);
		System.out.println(base.getVariable1());
		System.out.println(base.getVariable2());
		System.out.println(variable4);
	}
	public static void main(String args[]) {
		Child2 c= new Child2();
		c.getValues();
	}
}
