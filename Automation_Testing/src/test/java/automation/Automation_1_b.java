package automation;
//1. Web Elements - A. Elements present on Login page 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\nidhish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		driver.findElement(By.name("username")).sendKeys("Admin");			
		driver.findElement(By.name("password")).sendKeys("admin123");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
		
		// B. Elements present on Dashboards 
		
		
		driver.findElement(By.xpath("//li//a")).click();
		String s=driver.findElement(By.xpath("//li//a")).getText();			//Web element 1
		System.out.println(s);
	
		driver.findElement(By.xpath("//li[3]//a")).click();
		String s2=driver.findElement(By.xpath("//li[3]//a")).getText();	//Web element 2
		System.out.println(s2);

		driver.findElement(By.xpath("//li[4]//a")).click();
		String s3=driver.findElement(By.xpath("//li[4]//a")).getText();	//Web element 3
		System.out.println(s3);

		driver.findElement(By.xpath("//li[5]//a")).click();
		String s4=driver.findElement(By.xpath("//li[5]//a")).getText();	//Web element 4
		System.out.println(s4);

		

	}

}
