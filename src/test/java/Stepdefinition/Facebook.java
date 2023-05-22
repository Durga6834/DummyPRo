package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook {
	WebDriver driver;

	@Given("facebook URL")
	public void facebook_url() 
	{
		driver.get("https://www.facebook.com");
	}

	@When("credentials for login")
	public void credentials_for_login() 
	{
driver.findElement(By.id("email")).sendKeys("kdurgarao13@gmail.com");
driver.findElement(By.id("pass")).sendKeys("9642861085");

	}

	@Then("vallidate the login functionality")
	public void vallidate_the_login_functionality()
	{
driver.findElement(By.name("login")).click();
	}
}
