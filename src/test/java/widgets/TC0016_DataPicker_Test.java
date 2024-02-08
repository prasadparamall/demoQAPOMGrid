package widgets;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.widgets.TC0016_DataPicker_Page;
import utilities.Utility;

public class TC0016_DataPicker_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Widgets() throws Exception {
		
		getDriver().get(Utility.ConfigPro("url"));

		TC0016_DataPicker_Page dp = new TC0016_DataPicker_Page(getDriver());

		dp.click_Widgets();
		dp.click_datapicker1("September 2026", "Choose Saturday, September 5th, 2026");
		dp.click_datapicker2("September 2026", "Choose Saturday, September 5th, 2026", "10:15");

	}
}