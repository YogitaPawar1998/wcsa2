package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//path
		ChromeDriver driver = new ChromeDriver();//to open chrome browser
		Thread.sleep(4000);//stop
		driver.close();
		
	}

}
