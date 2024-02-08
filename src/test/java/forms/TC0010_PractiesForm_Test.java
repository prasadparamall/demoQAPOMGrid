package forms;

import java.util.Hashtable;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.forms.TC0010_PractiesForm_Page;
import utilities.Utility;

public class TC0010_PractiesForm_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void dynamic_Properties_EnterForm(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0010_PractiesForm_Page pr = new TC0010_PractiesForm_Page(getDriver());

		pr.dynamic_Properties_button_Click();
		pr.dynamic_properties_EnterForm(data.get("fname"), data.get("lname"), data.get("email"), data.get("male"),
				data.get("female"), data.get("other")

				, data.get("mnumber"), data.get("date"), data.get("month"), data.get("year"), data.get("sub"),
				data.get("sports"), data.get("reading"), data.get("music"), data.get("caddress"), data.get("state"),
				data.get("city"), data.get("path"));

	}

}
