package pages.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class TC0009_DynamicProperties_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0009_DynamicProperties_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[9]")
	WebElement dynamicproperties_xpath;
	

	By visible1_xpath = By.xpath("//button[@id='visibleAfter']");

	@FindBy(xpath = "//button[@id='visibleAfter']")
	WebElement visible_xpath;
	
	
	
	
	public void dynamic_Properties_button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(dynamicproperties_xpath);
		Thread.sleep(3000);
	}
	
	public void dynamic_Properties_visibleText() throws Exception {
		//visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']"));
		visibilityOfElementLocated(visible1_xpath);
		print_Single_GetText(visible_xpath);
	}
	
	

	
}
