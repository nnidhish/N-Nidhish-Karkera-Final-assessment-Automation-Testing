package automation;
//5. Object Oriented Programming: Overriding



class animal2 {		
	
	 void fourlegs() {
	System.out.println("Super class animal");}
}

public class Automation_5_a extends animal2 {
	
	void fourlegs() {
		super.fourlegs();		//super keyword is used to to call super class object
		
		System.out.println("Sub class cat");
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation_5_a obj= new Automation_5_a();
		obj.fourlegs();
		
	}

}
