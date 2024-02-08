package pages.alerts_Frame_Windows;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;

public class TC0014_Modaldialogs_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0014_Modaldialogs_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[3]")
	WebElement clickAlertsFrames;
	
	@FindBy(xpath = " //span[contains(text(),'Modal Dialogs')]")
	WebElement Modal_Dialogs_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Small modal')]")
	WebElement small_modal_xpath;
	
	@FindBy(xpath = "//button[@id='closeSmallModal']")
	WebElement closesmall_modal_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Large modal')]")
	WebElement large_modal_xpath;
	
	@FindBy(xpath = "//button[@id='closeLargeModal']")
	WebElement closelarge_modal_xpath;
	
	
	
	
	
	
	public void click_alerts_frames() throws Exception
	{
		clickJS(clickAlertsFrames);
		Thread.sleep(1000);
		clickJS(Modal_Dialogs_xpath);
		Thread.sleep(1000);
	}
	
	public void small_model() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(small_modal_xpath);
		Thread.sleep(1000);
		clickJS(closesmall_modal_xpath);
		Thread.sleep(1000);
	}
	
	public void large_model() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(large_modal_xpath);
		Thread.sleep(1000);
		clickJS(closelarge_modal_xpath);
		Thread.sleep(1000);
	}
	
	
}
