package alerts_Frame_Windows;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.alerts_Frame_Windows.TC0011_Browser_Windows_Page;
import utilities.Utility;

public class TC0011_Browser_Windows_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void click_Alerts_Frames_Link_BrowserWindows() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0011_Browser_Windows_Page bw = new TC0011_Browser_Windows_Page(getDriver());

		bw.click_alerts_frames_link_And_BrowserWindows();
		bw.click_newTab();
		bw.click_NewWindows();
		bw.click_NewWindowsMsg();

	}

}
