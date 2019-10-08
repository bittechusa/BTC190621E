package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	public boolean veryfyProfile() {
		return driver.findElement(By.xpath("xpathvalue")).isDisplayed();
		
		
	}

}
