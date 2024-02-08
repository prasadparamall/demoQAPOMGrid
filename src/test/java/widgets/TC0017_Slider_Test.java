package widgets;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.widgets.TC0017_Slider_Page;
import utilities.Utility;

public class TC0017_Slider_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Widgets() throws Exception {
		
		getDriver().get(Utility.ConfigPro("url"));

		TC0017_Slider_Page sl = new TC0017_Slider_Page(getDriver());

		sl.click_Widgets();
		sl.click_slider();

	}

}
