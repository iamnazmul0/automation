package page;

import org.openqa.selenium.By;

public class AddToCart extends base_page {
	private By ADDTOCART = By.xpath("//body/div[6]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[2]");
	private By GOTOCART = By.xpath("//div[@id='js--details-btn-area']//a[@class='btn details-cart-btn js--goto-cart-btn']");
	private By PLACEORDER = By.xpath("//a[@id='js-continue-to-shipping']");
	
	
	public void addtpcart()  {
		clickOnElement(ADDTOCART);
		
		
	}
	public void gotocart() {
		clickOnElement(GOTOCART);
		
	}
	public void placeorder() {
		clickOnElement(PLACEORDER);
		
	}
}
