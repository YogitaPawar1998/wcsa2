package xpathLocator;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
                 driver.manage().window().maximize();
                 driver.get("https://www.calculator.net/");
                 Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(1)']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(0)']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(0)']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='sciop' and  .='+']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(2)']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(0)']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='scinm' and @onClick='r(0)']")).click();
            Thread.sleep(1000);
           String result = driver.findElement(By.id("sciOutPut")).getText();
           System.out.println(result);
           driver.navigate().refresh();
           
            
           
           
   
	}

}
