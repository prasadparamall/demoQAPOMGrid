package pages.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;


public class TC0002_CheckBox_Page extends BaseClass {
	
WebDriver driver;
	
	public TC0002_CheckBox_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//span[contains(text(),'Check Box')]")
	WebElement checkboxbtn_xpath;
	
	@FindBy(xpath = "//div[@id='tree-node']/ol/li/span/button")
	WebElement clickhomedropdown_xpath;
	
	@FindBy(xpath = "//div[@id='tree-node']/ol/li/ol/li/span/button")
	List<WebElement> clickddddropdownCommon_xpath;
	
	@FindBy(xpath = "//div[@id='tree-node']/ol/li/ol/li/ol/li/span/button")
	List<WebElement> docudatacomcli_xpath;
	
	@FindBy(xpath = "//li[@class='rct-node rct-node-leaf']/span/label")
	List<WebElement> allsubdatacomm_xpath;
	
	@FindBy(xpath = "//div[@class='check-box-tree-wrapper']/div[2]/span")
	List<WebElement> comm_gettext_xpath;
	
	
	
	
	public void checkbox_Link_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(checkboxbtn_xpath);
		//log.info("click checkbox button");
		Thread.sleep(1000);
	}
	
	public void checkbox_Home_Dropdown_Click() throws Exception {
		clickJS(clickhomedropdown_xpath);
		//log.info("click home dropdown button");
		Thread.sleep(1000);
	}
	
	
	public void checkbox_Select_Items(String desktop, String documents,String downloads,
			String workspace, String office, String notes, String commands,
			String react, String angular, String veu , String Private,
			String Public, String Classified, String General,
			String Word_File_doc, String Excel_File_doc) throws Exception {
		
		
		Thread.sleep(1000);

		List<WebElement> dd2 = clickddddropdownCommon_xpath;

		switch (desktop) {
		case "true":
			for (int j = 0; j <= dd2.size(); j++) {
				dd2.get(0).click();
				//log.info("click desktop");
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (documents) {
		case "true":
			for (int k = 0; k <= dd2.size(); k++) {
				dd2.get(1).click();
			//	log.info("click documents");
				break;
			}

			break;
		case "false":
			System.out.println("");
			break;
		default:
			break;
		}

		switch (downloads) {
		case "true":
			for (int l = 0; l <= dd2.size(); l++) {
				dd2.get(2).click();
			//	log.info("click downloads");
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

		List<WebElement> dd4 = docudatacomcli_xpath;

		switch (workspace) {
		case "true":
			for (int m = 0; m <= dd4.size(); m++) {
				dd4.get(0).click();
				//log.info("click workspace");
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

		switch (office) {
		case "true":
			for (int n = 0; n <= dd4.size(); n++) {
				WebElement gg = dd4.get(1);
				clickJSValue(gg);
				//log.info("click office");
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

		List<WebElement> dd5 = allsubdatacomm_xpath;

		switch (notes) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(0);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (commands) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(1);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (react) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(2);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (angular) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(3);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (veu) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(4);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (Public) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(5);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (Private) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(6);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (Classified) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(7);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (General) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(8);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (Word_File_doc) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(9);
				clickJSValue(gg);
				//log.info("click workspace");
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

		switch (Excel_File_doc) {
		case "true":
			for (int n = 0; n <= dd5.size(); n++) {
				WebElement gg = dd5.get(10);
				clickJSValue(gg);
				//log.info("click workspace");
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

	}

	
	
	public void checkbox_GetText() {
		print_All_GetText(comm_gettext_xpath);
		//log.info("print checkbox detatils");
		
	}

}
