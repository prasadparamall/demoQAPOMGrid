package elements;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0009_DynamicProperties_Page;
import utilities.Utility;

public class TC0009_dynamicProperties_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void dynamic_Properties_Button_Click() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0009_DynamicProperties_Page dy = new TC0009_DynamicProperties_Page(getDriver());

		dy.dynamic_Properties_button_Click();
		dy.dynamic_Properties_visibleText();
	}

}
