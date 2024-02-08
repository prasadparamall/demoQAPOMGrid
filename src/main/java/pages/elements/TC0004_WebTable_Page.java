package pages.elements;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.BaseClass;
import utilities.Paths;


public class TC0004_WebTable_Page extends BaseClass{
	

WebDriver driver;
	
	public TC0004_WebTable_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;

	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[4]")
	WebElement webtable_xpath;
	
	@FindBy(xpath = " //button[contains(text(),'Add')]")
	WebElement add_Button_xpath;
	
	@FindBy(xpath = "//div[@class='rt-table']/div[1]/div/div/div[1]")
	WebElement table_firstrow_xpath;
	
	@FindBy(xpath = "//div[@class='rt-table']/div[2]/div/div/div")
	WebElement table_secondrow_xpath;
	
	@FindBy(xpath = "//div[@class='rt-table']/div[2]/div/div")
	WebElement tablerows_xpath;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement first_name_xpath;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement last_name_xpath;
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement useremail_xpath;
	
	@FindBy(xpath = "//input[@id='age']")
	WebElement age_xpath;
	
	@FindBy(xpath = "//input[@id='salary']")
	WebElement salary_xpath;
	

	@FindBy(xpath = "//input[@id='department']")
	WebElement depertment_xpath;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit_xpath;
	
	@FindBy(xpath = "//input[@id='searchBox']")
	WebElement serch_xpath;
	
	
	
	@FindBy(xpath = "//div[@class='web-tables-wrapper']/div[3]/div/div[2]/div/div[1]/div [7]/div/span[1]")
	WebElement edit_xpath;
	
	@FindBy(xpath = "//div[@class='web-tables-wrapper']/div[3]/div/div[2]/div/div[1]/div [7]/div/span[2]")
	WebElement delete_xpath;
	
	@FindBy(xpath = "//div[@class='rt-table']/div[2]/div")
	List<WebElement> mtable_xpath;
	
	
	
	
	
	
	
	public void webtable_Button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(webtable_xpath);
		
		Thread.sleep(1000);
		System.out.println("---------Before Adding Values ----------"+ "\n");
		printTable(mtable_xpath, Paths.table5, Paths.table6);
		Thread.sleep(2000);
	}
	
	public void webtable_click_Add_Button() {
		
		try {
			clickJS(add_Button_xpath);
			
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("");
		}
	}

	
	public void webtable_Enter_Values(String fname1, String lastname1, String email1, String age1, String sal1, String dep1) throws Exception {
		
		try {
			clickJS(add_Button_xpath);
			
			Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println("");
		}
		
		first_name_xpath.clear();
		first_name_xpath.sendKeys(fname1);
		
		
		last_name_xpath.clear();
		last_name_xpath.sendKeys(lastname1);
		
		
		useremail_xpath.clear();
		useremail_xpath.sendKeys(email1);
		
		
		age_xpath.clear();
		age_xpath.sendKeys(age1);
		
		
		salary_xpath.clear();
		salary_xpath.sendKeys(sal1);
		
		
		depertment_xpath.clear();
		depertment_xpath.sendKeys(dep1);
		
		
		Thread.sleep(1000);
		clickJS(submit_xpath);
		
		Thread.sleep(1000);
	}
	
	public void webtable_Print_After_Adding_Values() throws Exception {
		
		System.out.println("---------After Adding Values ----------"+ "\n");
		printTable(mtable_xpath, Paths.table5, Paths.table6);
		Thread.sleep(1000);
	}
	
	public void webtable_Serching(String name, String fname, String lastname, String email, String smfname) throws Exception {
		
			serch_xpath.clear();
			serch_xpath.sendKeys(name);
			
			Thread.sleep(1000);
	
			clickJS(edit_xpath);
			
			Thread.sleep(1000);
			
			first_name_xpath.clear();
			first_name_xpath.sendKeys(fname);
			
			Thread.sleep(1000);
			
			last_name_xpath.clear();
			last_name_xpath.sendKeys(lastname);
			
			Thread.sleep(1000);
			
			useremail_xpath.clear();
			useremail_xpath.sendKeys(email);
			
			Thread.sleep(1000);
			
			clickJS(submit_xpath);
			
			Thread.sleep(1000);
			
			serch_xpath.clear();
			serch_xpath.sendKeys(smfname);
			
			Thread.sleep(1000);
				
		    clickJS(delete_xpath);
		   
		    Thread.sleep(1000);
		    
		    serch_xpath.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
		    Thread.sleep(1000);
		
	}
	
	public void webtable_Print_After_Deleted_Table() throws Exception {
		
		System.out.println("---------After deleted Values ----------"+ "\n");
		printTable(mtable_xpath, Paths.table5, Paths.table6);
		Thread.sleep(1000);
	}
	

}
