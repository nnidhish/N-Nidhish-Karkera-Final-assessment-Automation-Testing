package automation;
//5. Object Oriented Programming: Interface



interface inter1{
	void m1();//
	int a=20;
}
interface inter2 {
	void m2();//
}

public class Automation_5_e implements inter2,inter1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation_5_e obj=new Automation_5_e();
		obj.m1();
		obj.m2();
		
	}
	public void m1() {			// two methods must be defined because this class implements interface
		System.out.println("M1 code: "+a);
	}
	public void m2() {
		System.out.println("M2 code");
	}
}
