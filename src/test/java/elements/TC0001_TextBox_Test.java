package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0001_TextBox_Page;
import utilities.Utility;

public class TC0001_TextBox_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void testBox_Data(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0001_TextBox_Page tb = new TC0001_TextBox_Page(getDriver());

		tb.textbox_Link_Click();
		tb.textbox_fill_The_Form_And_Print(data.get("fname"), data.get("email"), data.get("caddress"),data.get("paddress"));

	}

}