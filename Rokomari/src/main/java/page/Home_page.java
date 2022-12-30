package page;

import org.openqa.selenium.By;

public class Home_page extends base_page{
	private By SIGNUPLOGINBUTTON = By.xpath("//a[normalize-space()='Sign in']");

	
	
	public void clickOnLoginButton() { 
		clickOnElement(SIGNUPLOGINBUTTON);
	}
	
}
