package pages.widgets;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.BaseClass;

public class TC0017_Slider_Page extends BaseClass{
	
	
WebDriver driver;
	
	public TC0017_Slider_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[4]")
	WebElement widgets_xpath;
	
	@FindBy(xpath = "//span[contains(text(),'Slider')]")
	WebElement slider_click_xpath;
	
	@FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
	WebElement slider1_xpath;
	
	
	
	
	public void click_Widgets() throws Exception
	{
		clickJS(widgets_xpath);
		Thread.sleep(1000);
		clickJS(slider_click_xpath);
		Thread.sleep(1000);
	}
	
	public void click_slider() throws Exception
	{
//		actions().moveToElement(slider1_xpath,705, 345).perform();
//		slider1_xpath.click();
		
		System.out.println(slider1_xpath.getLocation());   // (377, 326)
		
		System.out.println(slider1_xpath.getSize());   // (493, 38)
		
		actions().dragAndDropBy(slider1_xpath, 100, 0).perform();
		Thread.sleep(1000);
		
        System.out.println(slider1_xpath.getLocation());   // (377, 326)
 		
		System.out.println(slider1_xpath.getSize());   // (493, 38)
	}
	
	
	
	
	
	
	
	
	

}
