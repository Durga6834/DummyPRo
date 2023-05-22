package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality 
{
	WebDriver driver;
	@Given("login into users page with url")
	public void login_into_users_page_with_url() {
		System.setProperty("Webdriver.chrome.driver","./Drivers\\Chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	

	@When("provide username and password")
	public void provide_username_and_password() {
	    
	}

	@And("click on login")
	public void click_on_login() {
	  
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    
	}



}
