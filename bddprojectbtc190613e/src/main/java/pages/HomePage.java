package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.Shared;

public class HomePage {
	WebDriver driver;
	@FindBy(id="email")WebElement useridtextbox;
	@FindBy(id="pass")WebElement passwordtextbox;
	@FindBy(id="u_0_2")WebElement loginbutton;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		
	}

	public void typeUserId(String text) {
		Shared.type(useridtextbox, text);
		
	}
	public void typePassWord(String text) {
		Shared.type(useridtextbox, text);
		
	}
	public ProfilePage clickOnLogin() {
		Shared.click(loginbutton);
		
		return new ProfilePage(driver);
		
	}
	
}
