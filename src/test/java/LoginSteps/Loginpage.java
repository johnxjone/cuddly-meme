package LoginSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	 @FindBy(xpath = "//*[@id=\"user-name\"]") WebElement loginuser;
	 @FindBy(xpath = "//*[@id=\"password\"]") WebElement loginpass;
	 @FindBy(xpath = "//*[@id=\"login-button\"]") WebElement click;
	 
	 public void login_with_User_and_Pass(String JJ, String J) {
		 
		loginuser.sendKeys(JJ);
		loginpass.sendKeys(J);
	}
	 
	 public void Click_To_Submmit() {
		 click.click();
		
	}
	 
	 //https://testautomationpractice.blogspot.com/
	}
	


