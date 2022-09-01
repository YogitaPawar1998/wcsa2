package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	     	WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK ')]"));
	    	WebElement trg = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::ol[@class='field14 ui-droppable ui-sortable']"));
	    	Actions act=new Actions(driver);
	    	act.dragAndDrop(src, trg).perform();
	    	
	     	

	}

}
