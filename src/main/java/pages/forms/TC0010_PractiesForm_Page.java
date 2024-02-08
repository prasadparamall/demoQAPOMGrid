package pages.forms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;
import utilities.Paths;

public class TC0010_PractiesForm_Page extends BaseClass {

	
	
WebDriver driver;
	
	public TC0010_PractiesForm_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[2]")
	WebElement click_forms_XPATH;
	
	@FindBy(xpath = "//div[@class='accordion']/div[2]")
	WebElement clickForms_xpath;
	
	@FindBy(xpath = "//span[contains(text(),'Practice Form')]")
	WebElement clickpractiesForm_xpath;
	
	@FindBy(xpath = "//*[@id='firstName']")
	WebElement fname_xpath;
	
	@FindBy(xpath = "//*[@id='lastName']")
	WebElement lname_xpath;
	
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement email_xpath;
	
	@FindBy(xpath = "//*[@id='genterWrapper']/div[2]/div")
	List<WebElement> gender_comm2_xpath;
	
	@FindBy(xpath = "//*[@id='userNumber']")
	WebElement mobileno_xpath;
	
	@FindBy(xpath = "//*[@id='dateOfBirthInput']")
	WebElement dateofbirthClick_xpath;
	
	By calender_xpath = By.xpath("//*[@class='react-datepicker']");
	
	@FindBy(xpath = "//div[@id='subjectsContainer']/div/div/div/div/input")
	WebElement sub_xpath;
	
	@FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div/div/input")
	List<WebElement> hobbiescomm_xpath;
	

	@FindBy(xpath = "//input[@id='uploadPicture']")
	WebElement chosefile_xpath;
	
	@FindBy(xpath = "//*[@id=\"currentAddress\"]")
	WebElement currentadd_xpath;
	
	@FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[2]/div/div/div[2]/div")
	WebElement selectstate_xpath;
	
	@FindBy(xpath = "//*[@id=\"stateCity-wrapper\"]/div[3]/div/div/div[2]/div")
	WebElement selectcity_xpath;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit_xpath;
	
	@FindBy(xpath = "//div[@class='table-responsive']/table/thead/tr/th")
	List<WebElement> fprinttabledetails_xpath;
	
	@FindBy(xpath = "//table[@class='table table-dark table-striped table-bordered table-hover']//tr")
	List<WebElement> tableprint_xpath;
	
	@FindBy(xpath = "//button[@id='closeLargeModal']")
	WebElement close_xpath;
	
	@FindBy(xpath = "//*[@class='react-datepicker']/div[2]/div[1]/div[1]")
	WebElement getTitleText_xpath;
	
	@FindBy(xpath = "//*[contains(text(),'Next Month')]")
	WebElement nextmonthbutton_xpath;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement subm_xpath;
	
	
	
	
	public void dynamic_Properties_button_Click() throws Exception {
		clickJS(click_forms_XPATH);
		Thread.sleep(1000);
		
		clickJS(clickForms_xpath);
		clickJS(clickpractiesForm_xpath);
	}

	public void dynamic_properties_EnterForm(String fname, String lname, String email, String male, String female, String others,
			String mnumber, String date, String month, String year, String sub, String sports, String reading,
			String music, String caddress, String state1, String city, String path) throws Exception {

		fname_xpath.sendKeys(fname);
		lname_xpath.sendKeys(lname);
		email_xpath.sendKeys(email);

		List<WebElement> dd2 = gender_comm2_xpath;
		switch (male) {
		case "true":
			for (int j = 0; j <= dd2.size(); j++) {
				dd2.get(0).click();
				break;
			}
			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (female) {
		case "true":
			for (int k = 0; k <= dd2.size(); k++) {
				dd2.get(1).click();
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (others) {
		case "true":
			for (int l = 0; l <= dd2.size(); l++) {
				dd2.get(2).click();
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		mobileno_xpath.sendKeys(mnumber);

		clickJS(dateofbirthClick_xpath);

		Thread.sleep(1000);
		visibilityOfElementLocated(calender_xpath);
		selectDate(date, month, year);

		Thread.sleep(2000);

		sub_xpath.sendKeys(sub);
		sub_xpath.sendKeys(Keys.ENTER);

		List<WebElement> dd3 = hobbiescomm_xpath;
		switch (sports) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(0);
				clickJSValue(ss);
				break;
			}
			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (reading) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(1);
				clickJSValue(ss);
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (music) {
		case "true":
			for (int j = 0; j <= dd3.size(); j++) {
				WebElement ss = dd3.get(2);
				clickJSValue(ss);
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		Thread.sleep(1000);
		
		clickJS(chosefile_xpath);
		Thread.sleep(4000);
		chosefile_xpath.sendKeys("C:\\Users\\kanna\\eclipse-workspace\\DemoQAPOM\\src\\main\\java\\testdata\\abc.jpg");
//		StringSelection ss = new StringSelection(path);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//		robot().keyPress(KeyEvent.VK_CONTROL);
//		robot().keyPress(KeyEvent.VK_V);
//
//		robot().keyRelease(KeyEvent.VK_CONTROL);
//		robot().keyRelease(KeyEvent.VK_V);
//
//		robot().keyPress(KeyEvent.VK_ENTER);
//		robot().keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		Thread.sleep(4000);

		currentadd_xpath.sendKeys(caddress);
		Thread.sleep(1000);

		selectstate_xpath.sendKeys(state1);
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		selectcity_xpath.sendKeys(city);
		Thread.sleep(1000);
		robot().keyPress(KeyEvent.VK_ENTER);
		robot().keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		clickJS(subm_xpath);
		Thread.sleep(2000);
		
		print_All_GetText(fprinttabledetails_xpath);
		Thread.sleep(1000);
		printTable(tableprint_xpath,Paths.table3 ,Paths.table4 );
		Thread.sleep(2000);
		
		//getElement("//button[@id='closeLargeModal']").click();
		
		clickJS(close_xpath);
		Thread.sleep(1000);
	}

	public void selectDate(String day, String month, String year) throws Exception {

		// String s=Integer.toString(day);

//		 String s="200";  
//		//Converting String into int using Integer.parseInt()  
//		int i=Integer.parseInt(s);  
//		
//		int i=200;  
//		String s=Integer.toString(i);

		if (month.equals("February") && Integer.parseInt(day) > 29) {
			System.out.println("wrong date: " + month + " : " + (day));
			return;
		}

		if (Integer.parseInt(day) > 31) {
			System.out.println("wrong date: " + month + " : " + day);
			return;
		}

		String monthYearVal = getTitleText_xpath.getText(); // title
		System.out.println(monthYearVal);

		while (!(getMonthYear(monthYearVal)[0].equals(month) && getMonthYear(monthYearVal)[1].equals(year))) {
			clickJS(nextmonthbutton_xpath); // next click path
			monthYearVal = getTitleText_xpath.getText();
		}
		try {

			driver.findElement(By.xpath("//div[text()='" + day + "']")).click();
		} catch (Exception e) {
			System.out.println("wrong date: " + month + " : " + day);
		}
		// locator(Config.practiesform("")).click(); //date
	}

	public void testdemo() {

		driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div/div/div/input")).sendKeys("c");

	}

}
