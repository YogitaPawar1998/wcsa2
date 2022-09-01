package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
	//	Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
	//	Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
	//	Thread.sleep(2000);
        driver.findElement(By.xpath("//div[.='Log In']")).click();
	}

}
