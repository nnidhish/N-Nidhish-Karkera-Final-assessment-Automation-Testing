//2. Mouse actions - Hover.


package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation_2_b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
		   
		   Thread.sleep(2000);
		   Actions mouse=new Actions(driver);
		  
		   mouse.moveToElement(driver.findElement(By.linkText("Demos"))).build().perform(); //cursor is placed on the demos option.
		   Thread.sleep(2000);

		  
}

}