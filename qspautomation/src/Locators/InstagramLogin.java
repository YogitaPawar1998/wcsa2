package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username']")).sendKeys("Admin");
		driver.findElement(By.name("password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[clsss*='L3NKy']")).click();
	

	}

}
