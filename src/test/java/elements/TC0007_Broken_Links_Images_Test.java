package elements;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0007_BrokenLinks_Page;
import utilities.Utility;

public class TC0007_Broken_Links_Images_Test extends BaseClass {

	@Test(groups = { "smoke","regression" }, dataProviderClass = Utility.class, dataProvider = "DemoQAdata")
	public void brokenLinks_Click_Links(Hashtable<String, String> data) throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0007_BrokenLinks_Page bn = new TC0007_BrokenLinks_Page(getDriver());

		bn.brokenlinks_Button_Click();
		bn.brokenlinks_All();
		bn.brokenlinks_images();
		//bn.brokenlinks_getText_Links();
		bn.brokenlinks_click_Links(data.get("link1"), data.get("link2"));
	}

}
