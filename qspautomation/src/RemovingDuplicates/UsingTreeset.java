package RemovingDuplicates;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingTreeset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML/singleselect.html");
		Thread.sleep(2000);
		WebElement ssdropdown = driver.findElement(By.id("menu"));
			Select sel = new Select(ssdropdown);
			
		  List<WebElement>ops=sel.getOptions();
		  TreeSet<String>s=new TreeSet<String>();
		  
		  for(int i=0;i<ops.size();i++)
		  {
			  String textToInsert=ops.get(i).getText();
			 s.add(textToInsert);
			    
		  }
		  for(String text:s)
		  {
			  System.out.println(text);
		  }
	}

}
