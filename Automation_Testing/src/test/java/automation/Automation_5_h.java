package automation;


class PrivateAccess2
{
	public int a=10;
	private void method1()
	{
		System.out.println("inside private method2");
	}
	
	protected void method2()
	{
		System.out.println("inside protected method");
	}
	public void method3()
	{
		System.out.println("inside public method");
	}
	void method4() {
		System.out.println("inside default method");

	}
}
public class Automation_5_h extends PrivateAccess2
{

public static void main(String args[])
{
	Automation_5_h obj=new Automation_5_h();
	//obj.method1();    Not accessible since method 2 is private outside the class
	obj.method2();//   CaN BE ACCessed since method 1 is protected
	obj.method3();// 
	obj.method4();
	
}
}