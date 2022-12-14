package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-rb3froof/login.do");
		 String LoginPageTitle = driver.getTitle();
		 if(LoginPageTitle.equals("actiTIME - Login"))
			{
				System.out.println("Login page title is verified | test case is passed");
			}
			
			else
			{
				System.out.println("Login page title is not verified | test case is failed");

			}
			
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.titleContains("Surajs"));
		
	
		System.out.println("Home page title is verified | test case is passed");
		
		
		
	}

}
