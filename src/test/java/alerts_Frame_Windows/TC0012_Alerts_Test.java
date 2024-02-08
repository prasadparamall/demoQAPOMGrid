package alerts_Frame_Windows;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.alerts_Frame_Windows.TC0012_Alerts_Page;
import utilities.Utility;

public class TC0012_Alerts_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Alerts_Frames() throws Exception {
		getDriver().get(Utility.ConfigPro("url"));

		TC0012_Alerts_Page al = new TC0012_Alerts_Page(getDriver());

		al.click_alerts_frames();
		al.click_me1();
		al.click_me2();
		al.click_me3();
		al.click_me4();

	}

}
