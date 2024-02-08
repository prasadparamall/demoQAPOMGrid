package pages.alerts_Frame_Windows;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;

public class TC0012_Alerts_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0012_Alerts_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[3]")
	WebElement clickAlertsFrames;
	
	@FindBy(xpath = " //span[contains(text(),'Alerts')]")
	WebElement click_alerts_xpath;
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[1]/div[2]/button")
	WebElement click_me1_xpath;
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[2]/div[2]/button")
	WebElement click_me2_xpath;
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[3]/div[2]/button")
	WebElement click_me3_xpath;
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[3]/div/span[2]")
	WebElement getText_xpath;
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[4]/div[2]/button")
	WebElement click_me4_xpath;
	
	
	@FindBy(xpath = "//div[@id='javascriptAlertsWrapper']/div[4]/div/span[2]")
	WebElement getText2_xpath;
	
	
	
	
	public void click_alerts_frames() throws Exception
	{
		clickJS(clickAlertsFrames);
		Thread.sleep(1000);
		clickJS(click_alerts_xpath);
		Thread.sleep(1000);
	}
	
	public void click_me1() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_me1_xpath);
		Thread.sleep(1000);
		
		webDriverWait().until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	public void click_me2() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_me2_xpath);
		Thread.sleep(1000);
		
		
		webDriverWait().until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	public void click_me3() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_me3_xpath);
		Thread.sleep(1000);
		
		
		webDriverWait().until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		print_Single_GetText(getText_xpath);
		Thread.sleep(1000);
	}
	
	public void click_me4() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_me4_xpath);
		Thread.sleep(1000);
		
		
		webDriverWait().until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("prasad");
		driver.switchTo().alert().accept();
		print_Single_GetText(getText2_xpath);
		Thread.sleep(1000);
	}
		
	
}
