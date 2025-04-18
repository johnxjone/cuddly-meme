package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginSteps.Hooks;
import LoginSteps.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	
	Loginpage LoginpageObj;
	public Stepdef() {
		
		
		this.driver = Hooks.getDriver();
		
		LoginpageObj = PageFactory.initElements(driver, Loginpage.class);
		
		
	}
	
	@Given("login the url of Swag lab\"https:\\/\\/www.saucedemo.com\\/\"")
	public void login_the_url_of_swag_lab_https_www_saucedemo_com() {
	
		driver.get("https://www.saucedemo.com/");
	}

	@Given("user name of\"standard_user\"and Password\"secret_sauce\"")
	public void user_name_of_standard_user_and_password_secret_sauce() {
		
		LoginpageObj.login_with_User_and_Pass("standard_user", "secret_sauce");

	}

	@When("Click submmit buttom")
	public void click_submmit_buttom() {
		LoginpageObj.Click_To_Submmit();

	}


}
