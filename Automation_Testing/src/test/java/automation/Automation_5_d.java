package automation;
//5. Object Oriented Programming: Abstract


abstract class Superclass2{
	abstract void m1();
	
}
abstract class Subclass extends Superclass2{
	abstract void m2();
	
}
public class Automation_5_d extends Subclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation_5_d obj=new Automation_5_d();
		obj.m1();
		obj.m2();
	}
	void m1() {
		System.out.println("M1 code");
		
	}
	void m2() {
		System.out.println("M2 code");
		
	}

}
