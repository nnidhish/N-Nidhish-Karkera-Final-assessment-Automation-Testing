
package automation;
//3. Alert- b)	Prompt alert
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation_3_c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		 
		  driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

		  Alert alert=driver.switchTo().alert();
		  String actualResult=alert.getText();
		  Thread.sleep(1000);
		  alert.dismiss();
		  
		
		  System.out.println(actualResult);
		  String expectedResult="Press a Button !";
		  Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");

	
		  System.out.println("After assertion");
	}

}