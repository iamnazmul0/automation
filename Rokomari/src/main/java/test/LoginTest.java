package test;

import static org.testng.Assert.assertEquals;

import java.io.Writer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Rokomari.com.DriverSetup;
import page.AddToCart;
import page.Address;
import page.Home_page;
import page.Login_page;
import page.Writer_page;

@Test
public class LoginTest extends DriverSetup {
	
	Home_page home_page = new Home_page();
	Login_page login_page = new Login_page();
	Writer_page writer_page = new Writer_page();
	AddToCart addtocart = new AddToCart();
	Address address = new Address();
	

	public void logintest () {
		getDriver().get("https://www.rokomari.com/book");
		home_page.clickOnLoginButton();
		login_page.enterusername("7hnazmul@gmail.com");
		login_page.enterpassword("mnop890abc");
		login_page.ClickLoginbutton();
		login_page.takeSreenshot("homepage");
	    //assertEquals(getDriver().getTitle(),"Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com" );
	
	    writer_page.hoverwriterlist();
		writer_page.writername();
		writer_page.bookcategories();
		writer_page.hoverproduct();
		writer_page.viewproduct();
		writer_page.takeSreenshot("writerpage");

		addtocart.addtpcart();
		addtocart.gotocart();
		addtocart.placeorder();
		addtocart.takeSreenshot("addtocart");
		//address.home();
		address.name("ROhim");
		address.phone("01770989281");
		address .country();
		address.city();
		address.area();
		address.fulladdress("nikunja");
		
	}

}

