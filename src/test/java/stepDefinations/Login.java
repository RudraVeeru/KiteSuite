package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Login {
	
	WebDriver webDriver = new ChromeDriver();
	
	@Given("User is on kite app")
	public void user_is_on_kite_app() {
		
		webDriver.get("https://app.kitesuite.com/users/login");
	
	}
	
	@When("User login into application")
	public void user_login_into_application() {
	WebElement Email_ID = webDriver.findElement(By.name("username"));
	Email_ID.clear();
	Email_ID.click();
	Email_ID.sendKeys("sunny@rudrainnovative.com");
	
	WebElement PWD = webDriver.findElement(By.name("password"));
	PWD.clear();
	PWD.click();
	PWD.sendKeys("Test@123");
		
	WebElement button = webDriver.findElement(By.id("kt_login_signin_submit"));
	button.click();
	
	}
	
	@Then("Workspace name list is dispalyed")
	public void prject_is_open_if_they_have_any() {
		
		
	   
	
	}
	
	public static void main(String[] args) {

	}

}
