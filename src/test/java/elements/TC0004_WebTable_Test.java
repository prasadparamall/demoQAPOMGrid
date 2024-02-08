package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0004_WebTable_Page;
import utilities.Utility;

public class TC0004_WebTable_Test extends BaseClass {

	@Test(groups = { "smoke","regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void webTable_Enter_Values(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0004_WebTable_Page wb = new TC0004_WebTable_Page(getDriver());

		wb.webtable_Button_Click();
		wb.webtable_Enter_Values(data.get("fname"), data.get("lname"), data.get("email"), data.get("age"),
				data.get("salary"), data.get("depertment"));
		wb.webtable_Print_After_Adding_Values();
		wb.webtable_Serching(data.get("fname"), data.get("mfname"), data.get("mlname"), data.get("memail"),
				data.get("smfname"));
		wb.webtable_Print_After_Deleted_Table();

	}

}