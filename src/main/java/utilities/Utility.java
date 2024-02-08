package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import base.BaseClass;

public class Utility extends BaseClass{
	
	public static String screenshotPath;
	public static String screenshotName;

//	public static void captureScreenshot() throws IOException {
//
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//		Date d = new Date();
//		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//
//		FileUtils.copyFile(scrFile,
//				new File(System.getProperty("user.dir") + "\\target\\extentreports\\" + screenshotName));
//
//	}
	
		
	@DataProvider(name="DemoQAdata")
	public Object[][] checkBox(Method m) throws Exception {

		String sheetName = m.getName();
		int rows = DemoQA.getRowCount(sheetName);
		int cols = DemoQA.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			table = new Hashtable<String,String>();
			
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				table.put(DemoQA.getCellData(sheetName, colNum, 1), DemoQA.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}

	
	 public static String ConfigPro(String property) {
		 String value = null;
		    
		 try {
			fis = new FileInputStream(Paths.config);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 pro = new Properties();
		 try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 value =  pro.getProperty(property);
		 
	     return value;
	    }

}
