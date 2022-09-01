package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com");
	     
	      driver.findElement(By.xpath("//button[.='✕']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("laptop");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='Operating System'  and @class='_2gmUFU _3V8rao']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//div[.='Windows 10' and @class='_3879cV']")).click();
	      Thread.sleep(2000);
	     String priceOfFirstSuggestion = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
           System.out.println("price of first suggestion " +priceOfFirstSuggestion);
           
  
	}

}
