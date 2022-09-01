package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TagNameLocatorToday {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-rb3froof/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		
		

}
}