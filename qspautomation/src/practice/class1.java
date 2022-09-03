package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    driver.findElement(By.name("q")).sendKeys("mobile");
		    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		         JavascriptExecutor jse = (JavascriptExecutor)driver;
		         jse.executeScript("window.scrollBy(0,1000)");
		         
		       WebElement target = driver.findElement(By.xpath("//span[.='Men']"));
		      Actions act = new  Actions(driver);
	             act.moveToElement(target).perform();
		 	        
		         
	}
		
}

