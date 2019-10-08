package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
public void open () {
	driver=new ChromeDriver();
}

public HomePage gotourl() {
	driver.get("http://www.facebook.com");
	return new HomePage(driver); 
}
public void openBrowser(String browser) {
	if (browser.equals("chrome")) {
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("firefox")) {
		driver= new FirefoxDriver();
	}
}
}
