package automation;
// 3. Alert- b)	Prompt alert
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation_3_b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  driver.findElement(By.linkText("Alert with Textbox")).click();
		 
		  driver.findElement(By.cssSelector("button.btn.btn-info")).click();

		  Alert alert=driver.switchTo().alert();
		  String actualResult=alert.getText();
		  Thread.sleep(1000);
		  alert.sendKeys("Nidhish");
		  alert.accept();
		  
		
		  System.out.println(actualResult);
		  String expectedResult="Please enter your name";
		  Assert.assertEquals(actualResult,expectedResult,"actual result and expected results are not matching");

		  System.out.println("After assertion");
	}

}