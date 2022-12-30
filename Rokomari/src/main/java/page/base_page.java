 package page;

import java.awt.geom.Area;
import java.io.ByteArrayInputStream;
import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import static Rokomari.com.DriverSetup.getDriver;
public class base_page {
	
	
	public WebElement getElemnt(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(40));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void clickOnElement(By locator) {
		getElemnt(locator).click();
	} 
	
	public String getElementText(By locator) { 
		return getElemnt(locator).getText();
	}
	
	public void SendTexts(By locator,String text) {
		getElemnt(locator).sendKeys(text);
	}
	public void Hover(By locator) {
		//getElemnt(locator).click();
		Actions action = new Actions(getDriver());
		action.clickAndHold(getDriver().findElement(locator)).build().perform();

	}
	public String getAlertText() { 
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert.getText();
	}
	
	public String Select(By locator,String type) { 
		
		if(type=="city"){
Select select = new Select(getDriver().findElement(locator));
			
			select.selectByValue("2");
		}
		else if (type == "country" ) {
Select select = new Select(getDriver().findElement(locator));
			
			select.selectByValue("1");
		} 

		else {
Select select = new Select(getDriver().findElement(locator));
			
			select.selectByValue("4");
		}
			
	
		return null;
	}
	public void takeSreenshot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	


}

