package pages.elements;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.BaseClass;

public class TC0003_RadioButton_Page extends BaseClass {
	
	
WebDriver driver;
	
	public TC0003_RadioButton_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[3]")
	WebElement radio_button_xpath;
	
	@FindBy(xpath = "//input[@id='yesRadio']")
	WebElement yes_xpath;
	
	@FindBy(xpath = "//input[@id='impressiveRadio']")
	WebElement impr_xpath;
	
	@FindBy(xpath = "//input[@id='noRadio']")
	WebElement no_xpath;
	
	@FindBy(xpath = "//span[@class='text-success']")
	WebElement gettext_xpath;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p")
	WebElement gettext2_xpath;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]")
	List<WebElement> yes2_xpath;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/input")
	List<WebElement> yes3_xpath;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/div/input")
	List<WebElement> comm_xpath;
	

	public void radio_button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(radio_button_xpath);
		//log.info("click radiobutton");
		Thread.sleep(2000);
	}

	public void radio_button_Select_Options(String yes, String impre, String no) throws Exception {


		switch (yes) {
		case "true":

			if (!yes_xpath.isSelected()) {

				clickJS(yes_xpath);
				//log.info("click yes radio button");
				Thread.sleep(1000);
				WebElement tx = gettext2_xpath;
				System.out.println(tx.getText());
				break;

			} else {
				System.out.println("It is Selected");
			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (impre) {
		case "true":

			if (!impr_xpath.isSelected()) {

				clickJS(impr_xpath);
				//log.info("click impre radio button");
				Thread.sleep(1000);
				WebElement tx = gettext2_xpath;
				System.out.println(tx.getText());
				break;

			} else {
				System.out.println("It is Selected");
			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (no) {
		case "true":

			if (!no_xpath.isEnabled()) {
				System.out.println("It is not Enabled");
			} else {
				
				clickJS(no_xpath);
				//log.info("click no radio button");
				Thread.sleep(1000);
				WebElement tx = gettext2_xpath;
				System.out.println(tx.getText());
				break;

			}

		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

	}

}
