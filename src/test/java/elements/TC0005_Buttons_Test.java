package elements;



import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0005_Buttons_Page;
import utilities.Utility;

public class TC0005_Buttons_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void buttons_Button_Click() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0005_Buttons_Page bt = new TC0005_Buttons_Page(getDriver());

		bt.buttons_button_Click();
		bt.bouttons_double_Click();
		bt.buttons_right_Click();
		bt.buttons_Click_Me();
	}

}
