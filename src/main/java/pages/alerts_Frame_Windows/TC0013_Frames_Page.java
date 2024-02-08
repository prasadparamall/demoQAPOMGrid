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

public class TC0013_Frames_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0013_Frames_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[3]")
	WebElement clickAlertsFrames;
	
	@FindBy(xpath = " //span[normalize-space()='Frames']")
	WebElement click_frames_xpath;
	
	@FindBy(xpath = "//*[@id='frame1']")
	WebElement movetoframe1;
	
	@FindBy(xpath = "//iframe[@id='frame2']")
	WebElement movetoframe2;
	
	@FindBy(xpath = "//*[@id='sampleHeading']")
	List<WebElement> gettext1_comm;
	
	
	
	
	public void click_alerts_frames() throws Exception
	{
		clickJS(clickAlertsFrames);
		Thread.sleep(1000);
		clickJS(click_frames_xpath);
		Thread.sleep(1000);
	}
	
	public void frame_1_gettext() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		
		for(int i=0;i<gettext1_comm.size();i++)
		{
			String dd = gettext1_comm.get(i).getText();
			System.out.println(dd);
			//break;
		}
		//print_Single_GetText(gettext1_comm);
		Thread.sleep(1000);
		
		
		
//		driver.switchTo().frame("frame2");
//		Thread.sleep(1000);
//		for(int i=0;i<gettext1_comm.size();i++)
//		{
//			String dd = gettext1_comm.get(2).getText();
//			System.out.println(dd);
//			break;
//		}
//		//print_Single_GetText(gettext1_comm);
//		Thread.sleep(1000);
	}
	
	public void frame_2_gettext() throws Exception
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//JS().executeScript("window.scrollBy(0,400)");
		
		
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		//print_Single_GetText(gettext1_comm);
		Thread.sleep(1000);
	}
	
	
}
