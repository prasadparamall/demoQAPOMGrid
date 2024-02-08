package pages.widgets;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.BaseClass;

public class TC0015_AutoComplete_Page extends BaseClass{
	
	
	
WebDriver driver;
	
	public TC0015_AutoComplete_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[4]")
	WebElement widgets_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Auto Complete')]")
	WebElement autocomplete_click_xpath;
	
	@FindBy(xpath = "//div[@id='autoCompleteMultipleContainer']/div/div/div[2]/div/input")
	WebElement multiplecolor_xpath;
	
	@FindBy(xpath = "//input[@id='autoCompleteSingleInput']")
	WebElement singlecolor_xpath;
	
	
	
	
	public void click_Widgets() throws Exception
	{
		clickJS(widgets_xpath);
		Thread.sleep(1000);
		clickJS(autocomplete_click_xpath);
		Thread.sleep(1000);
	}
	
	public void click_multiple_color() throws Exception
	{
		multiplecolor_xpath.sendKeys("red");	
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		multiplecolor_xpath.sendKeys("y");
		robot().keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
	public void click_single_ecolor() throws Exception
	{
		singlecolor_xpath.sendKeys("wh");	
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	

}
