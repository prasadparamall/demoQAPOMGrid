package pages.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class TC0005_Buttons_Page extends BaseClass{
	

WebDriver driver;
	
	public TC0005_Buttons_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[5]")
	WebElement buttons_xpath;
	
	By doubleclick1_xpath = By.xpath("//*[contains(text(),'Double Click Me')]");
	
	
	@FindBy(xpath = "//*[contains(text(),'Double Click Me')]")
	WebElement doubleclick_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'You have done a double click')]")
	WebElement doubleclickText_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Right Click Me')]")
	WebElement rightclick_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'You have done a right click')]")
	WebElement rightclickText_xpath;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/div[3]/button")
	WebElement clickMe_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'You have done a dynamic click')]")
	WebElement clickMeText_xpath;
	
	
	
	
	
	public void buttons_button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(buttons_xpath);
		Thread.sleep(1000);
		
	}
	
	public void bouttons_double_Click() throws Exception {
		elementToBeClickable(doubleclick1_xpath);
		doubleClick(doubleclick_xpath);
		
		print_Single_GetText(doubleclickText_xpath);
		Thread.sleep(1000);
	}
	
	public void buttons_right_Click() throws Exception {
		rightClick(rightclick_xpath);
		
		print_Single_GetText(rightclickText_xpath);
		Thread.sleep(1000);
	}
	
	public void buttons_Click_Me() throws Exception {
		clickJS(clickMe_xpath);
		
		print_Single_GetText(clickMeText_xpath);
		Thread.sleep(1000);
	}

	
		

}
