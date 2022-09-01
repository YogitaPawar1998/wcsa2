package WindowBasePopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			//to login
				
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//b[.='PIM']")).click();
				driver.findElement(By.id("menu_pim_addEmployee")).click();
				WebElement target = driver.findElement(By.xpath("//input[@name='photofile']"));
				Actions act=new Actions(driver);
				act.doubleClick(target).perform();
				
				
				String fileabsolutepath="C:\\Users\\admin\\Pictures\\Screenshots\\Screenshot (3).png";
				StringSelection clipboardpath = new StringSelection(fileabsolutepath);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipboardpath, null);
				
				Thread.sleep(5000);
				    Robot robot = new Robot();
				    
				   robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					
					 
				    robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_V);
				
					Thread.sleep(3000);
					
					  robot.keyPress(KeyEvent.VK_ENTER);
					   robot.keyRelease(KeyEvent.VK_ENTER);
						
					
	}

}
