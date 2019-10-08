package utility;

import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void type(WebElement element, String text) {
		element.sendKeys(text);
		
		
	}
	public static void click(WebElement element) {
		element.click();
		
		
	
	

}}

