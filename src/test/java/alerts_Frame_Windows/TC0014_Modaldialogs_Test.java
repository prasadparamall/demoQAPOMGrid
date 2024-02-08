package alerts_Frame_Windows;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.alerts_Frame_Windows.TC0014_Modaldialogs_Page;
import utilities.Utility;

public class TC0014_Modaldialogs_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Alerts_Frames() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0014_Modaldialogs_Page md = new TC0014_Modaldialogs_Page(getDriver());
		md.click_alerts_frames();
		md.small_model();
		md.large_model();

	}

}
