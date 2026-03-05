package PracticeScenarios.FromEclipse_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public FbLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void usernametextbox(String un) {
		usernametb.sendKeys(un);
	}
	
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}

}
