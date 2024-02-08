package widgets;

import org.testng.annotations.Test;
import base.BaseClass;
import pages.widgets.TC0015_AutoComplete_Page;
import utilities.Utility;

public class TC0015_AutoComplete_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Widgets() throws Exception {
		getDriver().get(Utility.ConfigPro("url"));

		TC0015_AutoComplete_Page ac = new TC0015_AutoComplete_Page(getDriver());

		ac.click_Widgets();
		ac.click_multiple_color();
		ac.click_single_ecolor();

	}

}
