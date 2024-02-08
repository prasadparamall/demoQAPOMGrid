package alerts_Frame_Windows;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.alerts_Frame_Windows.TC0013_Frames_Page;
import utilities.Utility;

public class TC0013_Frames_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Alerts_Frames() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0013_Frames_Page fm = new TC0013_Frames_Page(getDriver());

		fm.click_alerts_frames();
		fm.frame_1_gettext();

	}

}
