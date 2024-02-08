package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0006_Links_Page;
import utilities.Utility;

public class TC0006_Links_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void links_Click_Home_Links(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0006_Links_Page ln = new TC0006_Links_Page(getDriver());

		ln.links_button_Click();
		ln.links_getTextAll_Links();

		ln.links_click_Home_Links(data.get("home"), data.get("home2"));
		ln.links_Click_HomeSWXEC_Links(data.get("created"), data.get("nocontent"), data.get("moved"),
				data.get("badrequest"), data.get("unautorized"), data.get("forbidden"), data.get("not_found"));
	}

}
