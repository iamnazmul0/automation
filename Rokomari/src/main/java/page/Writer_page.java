package page;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;


public class Writer_page extends base_page {
	private By WRITELIST = By.xpath("//a[@id='js--authors']");
	private By WRITENAME = By.xpath("//a[contains(text(),'রবীন্দ্রনাথ ঠাকুর')]");
	private By CATEGORIES = By.xpath("//div[@data-search-key='রবীন্দ্র সংগীত Rabindra Music']");
	private By HOVERPRODUCT = By.xpath("//body/div[@class='browse-page']/div[@class='container-fluid custom-container px-0']/div[@class='d-flex justify-content-start align-items-start']/div[@class='main-browse-content']/section[@class='browse__content']/div[@class='browse__content-books-wrapper']/div[@class='row']/div[1]");
	private By VIEWPRODUCT = By.xpath("//div[@class='d-flex justify-content-start align-items-start']//div[@class='row']//div[1]//div[1]//div[1]//a[1]");

	
	
	public void viewproduct() {
		clickOnElement(VIEWPRODUCT); 
		
	}
	public void hoverwriterlist() {
		Hover(WRITELIST);	
	}
	public void writername() {
		clickOnElement(WRITENAME);
		
	}
	public void bookcategories() {
		clickOnElement(CATEGORIES);
	}
	public void hoverproduct() {
		Hover(HOVERPRODUCT);
	}

	

}
