package OperationalMethodsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions_Method_for_each {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML/singleselect.html");
		WebElement multiselect = driver.findElement(By.id("menu"));
	    Select sel = new Select(multiselect);
	    

	    List<WebElement> allselectedOps=sel.getOptions();
	    
	    for(WebElement op:allselectedOps)
	    {
	    	String text=op.getText();
	    	System.out.println(text);
	    	Thread.sleep(2000);

	}
	}
}
