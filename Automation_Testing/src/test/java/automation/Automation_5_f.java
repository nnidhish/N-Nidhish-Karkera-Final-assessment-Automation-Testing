package automation;
//5. Object Oriented Programming: Exception handling

public class Automation_5_f {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("unused")
			int a=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		finally
		{
			System.out.println("End of the Program");}
	}

}
