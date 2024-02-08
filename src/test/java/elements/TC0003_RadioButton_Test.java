package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0003_RadioButton_Page;
import utilities.Utility;

public class TC0003_RadioButton_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void radioButton_Data(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0003_RadioButton_Page rb = new TC0003_RadioButton_Page(getDriver());

		rb.radio_button_Click();
		rb.radio_button_Select_Options(data.get("yes"), data.get("impressive"), data.get("no"));
	}

}
