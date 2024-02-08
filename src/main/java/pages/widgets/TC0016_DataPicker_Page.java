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

public class TC0016_DataPicker_Page extends BaseClass{
	
	
	
WebDriver driver;
	
	public TC0016_DataPicker_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

	
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[4]")
	WebElement widgets_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Date Picker')]")
	WebElement datepickere_click_xpath;
	
	@FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
	WebElement click_date_mon_year_xpath;
	
	@FindBy(xpath = "//div[@class='react-datepicker']/div[2]/div[1]/div[1]")
	WebElement date_year_xpath;
	
	@FindBy(xpath = "//div[@class='react-datepicker']/button[2]")
	WebElement next_button_xpath;
	
	@FindBy(xpath = "//div[@class='react-datepicker__month-container']/div[2]/div/div")
	List<WebElement> dates_xpath;
	
	@FindBy(xpath = "//input[@id='dateAndTimePickerInput']")
	WebElement date_time_click_xpath;
	
	@FindBy(xpath = "//ul[@class='react-datepicker__time-list']/li")
	List<WebElement> time_xpath;
	
	
	public void click_Widgets() throws Exception
	{
		clickJS(widgets_xpath);
		Thread.sleep(1000);
		clickJS(datepickere_click_xpath);
		Thread.sleep(1000);
	}
	
	public void click_datapicker1(String month, String date) throws Exception
	{
		clickJS(click_date_mon_year_xpath);
		Thread.sleep(1000);
		
		dataPicker(month,date, date_year_xpath, next_button_xpath, dates_xpath);
		Thread.sleep(1000);
	
	
	}
	
	public void click_datapicker2(String month, String date, String time1) throws Exception
	{
		clickJS(date_time_click_xpath);
		Thread.sleep(1000);
		
		dataPicker(month,date, date_year_xpath, next_button_xpath, dates_xpath);
		
		//print_All_GetText(time_xpath);

		List<WebElement> t = time_xpath; // tr/td[contains(text(),'day')]

		for (WebElement ele : t) 
		{
			 String date_text = ele.getText();
			//String date_text = ele.getAttribute("aria-label");
			// System.out.println(date_text);
			// String date[] = date_text.split("\n");

			if (date_text.equals(time1)) 
			{
				ele.click();
				break;
			}
		}
		
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	

}
