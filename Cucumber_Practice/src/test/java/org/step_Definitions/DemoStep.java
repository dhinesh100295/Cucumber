package org.step_Definitions;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.Practice.Base_Class;
import com.cucumber.Practice.Pom_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStep extends Base_Class {
	
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		getBrowser("chrome");
		getURL("https://adactinhotelapp.com/index.php");
	    
	}

	@When("^user has to enter the correct login credential for login$")
	public void user_has_to_enter_the_correct_login_credential_for_login() throws Throwable {
		
		waitimplicit(5000);
		
		FileInputStream f = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace-Cucumber\\Cucumber_Practice\\src\\main\\java\\com\\cucumber\\Practice\\input.Properties");
	    Properties p = new Properties();
	    p.load(f);
	    
	    String username = p.getProperty("username");
	    String password = p.getProperty("password");
	    
	    PageFactory.initElements(driver,Pom_Class.class);
	    inputValues(Pom_Class.userName,username);
	    inputValues(Pom_Class.passWord,password);
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		
		click(Pom_Class.login);
	    
	}

}
