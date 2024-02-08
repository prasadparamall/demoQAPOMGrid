package pages.elements;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;
import utilities.Paths;


public class TC0008_UploadAndDownload_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0008_UploadAndDownload_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = " //div[@class='element-list collapse show']/ul/li[8]")
	WebElement uploadAndDownload_xpath;
	
	@FindBy(xpath = " //input[@id='uploadFile']")
	WebElement choosefile_xpath;
	
	@FindBy(xpath = "//a[@id='downloadButton']")
	WebElement down_xpath;
	
	

	
	
	
	public void upload_And_Download_button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(uploadAndDownload_xpath);
		Thread.sleep(1000);
	}
	
	public void upload_And_Download_upload_File() throws Exception {
		
		//clickJS(Config.uploadAndDownload("choosefile_XPATH"));
		
		Actions act = new Actions(driver);
		act.moveToElement(choosefile_xpath).click().perform();

		Robot rb= new Robot();
		rb.delay(1000);

		StringSelection ss = new StringSelection(Paths.pic);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

	}
	
	public void upload_And_Download_download_File() throws Exception {
		clickJS(down_xpath);
		Thread.sleep(1000);
	}
	
	
	
}
