package elements;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.elements.TC0008_UploadAndDownload_Page;
import utilities.Utility;

public class TC0008_Upload_And_Download_Test extends BaseClass {

	@Test(groups = { "smoke", "regression" })
	public void upload_And_Download_Upload_File() throws Exception {

		getDriver().get(Utility.ConfigPro("url"));

		TC0008_UploadAndDownload_Page up = new TC0008_UploadAndDownload_Page(getDriver());

		up.upload_And_Download_button_Click();
		up.upload_And_Download_upload_File();
		up.upload_And_Download_download_File();
	}

}
