package pages.alerts_Frame_Windows;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.BaseClass;

public class TC0011_Browser_Windows_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0011_Browser_Windows_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[3]")
	WebElement clickAlertsFrames;
	
	@FindBy(xpath = "//span[contains(text(),'Browser Windows')]")
	WebElement browserwindows_link_xpath;
	
	@FindBy(xpath = "//div[@id='browserWindows']/div[1]/button")
	WebElement click_newTab_xpath;
	
	@FindBy(xpath = "//div[@id='browserWindows']/div[2]/button")
	WebElement click_newwindows_xpath;
	
	@FindBy(xpath = "//div[@id='browserWindows']/div[3]/button")
	WebElement click_newwindowsmsg_xpath;
	
	@FindBy(xpath = "//h1[@id='sampleHeading']")
	WebElement newtab_gettext_xpath;
	
	@FindBy(xpath = "//body")
	WebElement click_newwindowsmsg1_xpath;
	//div[@id='browserWindows']/div[1]/button
	//body
	
	public void click_alerts_frames_link_And_BrowserWindows() throws Exception
	{
		clickJS(clickAlertsFrames);
		Thread.sleep(1000);
		clickJS(browserwindows_link_xpath);
		Thread.sleep(1000);
	}
	
	public void click_newTab() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_newTab_xpath);
		Thread.sleep(1000);
		
		String main = driver.getWindowHandle();
		Set<String> ch = driver.getWindowHandles();
		
		Iterator<String> kk = ch.iterator();
		while(kk.hasNext()) 
		{
			String child = kk.next();
			
			if(! main.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
				
				print_Single_GetText(newtab_gettext_xpath);
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(main);
		Thread.sleep(1000);
		
	}
	
	public void click_NewWindows() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_newwindows_xpath);
		Thread.sleep(1000);
		
		String main = driver.getWindowHandle();
		Set<String> ch = driver.getWindowHandles();
		
		Iterator<String> kk = ch.iterator();
		while(kk.hasNext()) 
		{
			String child = kk.next();
			
			if(! main.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
				
				print_Single_GetText(newtab_gettext_xpath);
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(main);
		Thread.sleep(1000);
		
	}
	
	public void click_NewWindowsMsg() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		clickJS(click_newwindowsmsg_xpath);
		Thread.sleep(1000);
		
		String main = driver.getWindowHandle();
		Set<String> ch = driver.getWindowHandles();
		
		Iterator<String> kk = ch.iterator();
		while(kk.hasNext()) 
		{
			String child = kk.next();
			
			if(! main.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
				
				//print_Single_GetText(click_newwindowsmsg1_xpath);
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(main);
		Thread.sleep(1000);
		
	}

	
	
	
}
