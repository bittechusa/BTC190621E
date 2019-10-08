package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BaseTest;
import pages.HomePage;
import pages.ProfilePage;

public class Stepdefination {
	BaseTest b;
	HomePage h;
	ProfilePage p;
	
				

	
@Before 
public void open() {
	System.out.println("Before every single scenerio");
}
@After 
public void close() {
	System.out.println("After every single scenerio");
}
@Before ("@Smoke")
public void open1() {
	System.out.println("Before every single scenerio");
}
@After ("@Smoke") 
public void close1() {
	System.out.println("After every single scenerio");
}


@Given("^open browser$")
public void open_browser(DataTable arg1) throws Throwable {
List<List<String>> browsers= arg1.raw();
String browser=browsers.get(1).get(0);
b.openBrowser(browser);
}	
	
@Given("^open chrome browser$")
public void open_chrome_browser() throws Throwable {
b=new BaseTest();
b.open();
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("^navigate to the facebook\\.com$")
public void navigate_to_the_facebook_com() throws Throwable {
	h=b.gotourl();
	
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^user type userid in email text box$")
public void user_type_userid_in_email_text_box() throws Throwable {
	h.typeUserId("myuserid");
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^user type password in password type box$")
public void user_type_password_in_password_type_box() throws Throwable {
	h.typePassWord("mypass");
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^user click in login button$")
public void user_click_in_login_button() throws Throwable {
p=h.clickOnLogin();

    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^user should be in his/her profile page$")
public void user_should_be_in_his_her_profile_page() throws Throwable {
	System.out.println("verified");
    // Write code here that turns the phrase above into concrete actions
    
}
@When("^user type \"([^\"]*)\" in email text box$")
public void user_type_in_email_text_box(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	h.typeUserId(arg1);
}

@When("^user type \"([^\"]*)\" in password type box$")
public void user_type_in_password_type_box(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	h.typePassWord(arg1);

}

@Then("^user should not be in his/her profile page$")
public void user_should_not_be_in_his_her_profile_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
if(p.veryfyProfile()) {
	
	System.out.println("iminmyprofilepage");
}
else 
	System.out.println("imnotinprofilepage");


  
}


}
