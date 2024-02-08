package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0002_CheckBox_Page;
import utilities.Utility;

public class TC0002_CheckBox_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void checkBox_Select_Items(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0002_CheckBox_Page cb = new TC0002_CheckBox_Page(getDriver());

		cb.checkbox_Link_Click();
		cb.checkbox_Home_Dropdown_Click();
		cb.checkbox_Select_Items(data.get("desktop"), data.get("docu"), data.get("down"), data.get("worksp"),
				data.get("office"), data.get("notes"), data.get("commands"), data.get("react"), data.get("angular"),
				data.get("veu"), data.get("publi"), data.get("privat"), data.get("classified"), data.get("general"),
				data.get("wordfile"), data.get("excelfile"));
		cb.checkbox_GetText();

	}
}