package pages.elements;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;



public class TC0001_TextBox_Page extends BaseClass {
	
	WebDriver driver;
	
	public TC0001_TextBox_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	

	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//span[contains(text(),'Text Box')]")
	WebElement textboxbtn_xpath;
	
	@FindBy(xpath = "//input[@id='userName']")
	WebElement fullname_xpath;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email_xpath;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement caddress_xpath;
	
	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement paddress_xpath;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit_xpath;
	
	@FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
	List<WebElement> printoutput_xpath;
	
	
	
	
	public void textbox_Link_Click() throws Exception {
		
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(textboxbtn_xpath);
		Thread.sleep(1000);
	}
	
	
	
	public void textbox_fill_The_Form_And_Print(String fname, String email, String cadd, String padd) throws Exception {
		
		fullname_xpath.clear();
		fullname_xpath.sendKeys(fname);

		email_xpath.clear();
		email_xpath.sendKeys(email);

		caddress_xpath.clear();
		caddress_xpath.sendKeys(cadd);

		paddress_xpath.clear();
		paddress_xpath.sendKeys(padd);
		//Assert.assertFalse(true);
		clickJS(submit_xpath);
		
		Thread.sleep(1000);
		print_All_GetText(printoutput_xpath);
		Thread.sleep(1000);
			
	}
	
	
	
	
	
	
	
	
//	public TestBox_Page(WebDriver driver) {
//	AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
//	PageFactory.initElements(factory, this);
//}


}