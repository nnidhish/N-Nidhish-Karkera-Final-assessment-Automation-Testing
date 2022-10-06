//2. Mouse actions - Drag and drop.


package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation_2_c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   driver.findElement(By.linkText("Draggable")).click();
		   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		   
		   Thread.sleep(2000);
		   Actions mouse=new Actions(driver);
		  
		   Thread.sleep(2000);

		   mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();
		   Thread.sleep(7000);
		  // driver.close();
		   

}

}