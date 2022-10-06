package automation;

//5. Object Oriented Programming: Inheritance

class  Login1{
	String name="virat";
	void verifyLogin() {
		
		System.out.println("Login Successful");
		
	}
}
class AddBen1 extends Login1{
	
	void verifyBen() {
		System.out.println("Beneficiary named "+name+" added Successful"); 

	}
}

public class Automation_5_c extends AddBen1{
	void verifyTransfer() {
		System.out.println("Funds successfully transfered to "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation_5_c n=new Automation_5_c();
		n.verifyLogin();
		n.verifyBen();
		n.verifyTransfer();
	}

}
