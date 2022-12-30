package page;

import org.openqa.selenium.By;

public class Address extends base_page {
//	private By HOMEOROFFICE = By.xpath("//label[@class='focus'][normalize-space()='Home']");
	private By NAME = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
	private By PHONENUMBER = By.xpath("//fieldset[@class='group']//input[@id='phone']");
	private By COUNTRY = By.xpath("//select[@id='js--country']");
	private By CITY = By.xpath("//select[@id='js--city']");
	private By AREA = By.xpath("//select[@id='js--area']");
	private By FULLADDRESS = By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]");

	
	private String cityType = "city";
	private String countryType = "country";
	private String areatype = "area";
	
//	public void home() {
//		clickOnElement(HOMEOROFFICE);	
//	}
	public void name(String username) {
		clickOnElement(NAME);
		SendTexts(NAME,username);	
	}
	public void phone(String usernumber) {
		SendTexts(PHONENUMBER,usernumber);	
	}
	public void country() {
		clickOnElement(COUNTRY);
		Select(COUNTRY,countryType);			
	}
	
	public void city() {
		clickOnElement(CITY);
		Select(CITY,cityType);		
	}
	
	public void area() {
		clickOnElement(AREA);
		Select(AREA,areatype);		
	}
	
	public void fulladdress(String homeaddress) {
		SendTexts(FULLADDRESS,homeaddress);	
	}

}
