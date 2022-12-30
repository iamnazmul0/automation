package page;

import org.openqa.selenium.By;

public class Login_page extends base_page {
	
	private By USERNAME = By.xpath("//input[@id='j_username']");
	private By PASSWORD = By.xpath("//input[@id='j_password']");
	private By LOGINBUTTON = By.xpath("//button[normalize-space()='Sign In']");
	
	public void enterusername(String username) {
		SendTexts(USERNAME,username);
	}
	public void enterpassword(String password) {
		SendTexts(PASSWORD,password);
	}

	public void ClickLoginbutton() { 
		clickOnElement(LOGINBUTTON);
	}
	
//	public void doLogin() {
//		SendTexts(USERNAME,"7hnazmul@gmail.com");
//		SendTexts(PASSWORD,"mnop890abc");
//		clickOnElement(LOGINBUTTON);
//	}
	 

}
