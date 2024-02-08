package base;

import java.awt.Robot;
import java.io.FileInputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelReader;
import utilities.Paths;
import utilities.Utility;


public class BaseClass {

	public static FileInputStream fis;
	public static Properties pro;
	public static DesiredCapabilities cap;
	public ExcelReader DemoQA = new ExcelReader(Paths.excel);
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static SoftAssert softassert = new SoftAssert();
	
	 protected static 
	    ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	 
	 
	    @Parameters("browser")
	    @BeforeMethod
	    public void Setup(String browser) throws MalformedURLException{
		
		 
	        WebDriver driver = BaseClass.doBrowserSetup(browser);
	        //set driver
	        threadLocalDriver.set(driver);

	        //System.out.println("Before Test Thread ID: "+Thread.currentThread().getId());

	        //get URL
	        //getDriver().get("https://www.linkedin.com/");
	        
	    }

	    //get thread-safe driver
	    public static WebDriver getDriver(){
	        return threadLocalDriver.get();
	    }


	 
	    
	public static WebDriver doBrowserSetup(String browser)  throws MalformedURLException {

    		// String nodeurl_D = "http://192.168.56.101:26961/wd/hub";
    		// String nodeurl_L = "http://192.168.56.1:7770/wd/hub";
    		String nodeurl = "http://192.168.0.111:26598/wd/hub";

    		
    		// log("Opening The Browser "+ grid local and diff machines);
    		if (Utility.ConfigPro("grid_run").equals("y")) {

    			if (browser.equalsIgnoreCase("chrome")) {

    				cap = DesiredCapabilities.chrome();
    				cap.setBrowserName("chrome");
    				cap.setPlatform(Platform.ANY);

    				ChromeOptions options = new ChromeOptions();
    				
    				threadLocalDriver.set(new RemoteWebDriver(new URL(nodeurl), options));
    			} else if (browser.equalsIgnoreCase("firefox_win")) {

    				FirefoxOptions options = new FirefoxOptions();
    				options.setCapability("browserName", "firefox");
    				options.addArguments("---headless");
    				options.addArguments("---disable-gpu");
    				options.addArguments("---disable-extensions");
    				options.addArguments("---no-sandbox");
    				options.addArguments("---allow-insecure-localhost");
    				options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

    				WebDriverManager.chromedriver().setup();
    				threadLocalDriver.set(new RemoteWebDriver(new URL(nodeurl), options));
    				//driver = new RemoteWebDriver(new URL(nodeurl), options);

    			} else if (browser.equalsIgnoreCase("firefox_linux")) {

    				FirefoxOptions options = new FirefoxOptions();
    				options.setCapability("browserName", "firefox");
    				options.addArguments("---headless");
    				options.addArguments("---disable-gpu");
    				options.addArguments("---disable-extensions");
    				options.addArguments("---no-sandbox");
    				options.addArguments("---allow-insecure-localhost");

    				threadLocalDriver.set(new RemoteWebDriver(new URL(nodeurl), options));
    				//driver = new RemoteWebDriver(new URL(nodeurl), options);

    			} else if (browser.equalsIgnoreCase("internet explorer")) {

    				cap = DesiredCapabilities.internetExplorer();
    				cap.setBrowserName("internet explorer");
    				cap.setPlatform(Platform.ANY);

    				InternetExplorerOptions options = new InternetExplorerOptions();
    				//driver = new RemoteWebDriver(new URL(nodeurl), options);
    				threadLocalDriver.set(new RemoteWebDriver(new URL(nodeurl), options));

    			} else if (browser.equalsIgnoreCase("edge")) {

    				cap = DesiredCapabilities.edge();
    				cap.setBrowserName("edge");
    				cap.setPlatform(Platform.ANY);

    				EdgeOptions options = new EdgeOptions();
    				// options.merge(cap);
    				//driver = new RemoteWebDriver(new URL(nodeurl), options);
    				threadLocalDriver.set(new RemoteWebDriver(new URL(nodeurl), options));

    			}
    			
    			getDriver().manage().window().maximize();
    			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    		} else { // local machine

    			if (browser.equals("chrome")) {
    				WebDriverManager.chromedriver().setup();

    				Map<String, Object> prefs = new HashMap<String, Object>();
    				prefs.put("profile.default_content_setting_values.notifications", 2);
    				prefs.put("credentials_enable_service", false);
    				prefs.put("profile.password_manager_enabled", false);
    				ChromeOptions options = new ChromeOptions();
    				options.setExperimentalOption("prefs", prefs);
    				options.addArguments("--disable-extensions");
    				options.addArguments("--disable-infobars");
    				options.addArguments("--remote-allow-origins=*");

//    			DesiredCapabilities cp = new DesiredCapabilities();
//    			cp.setCapability(ChromeOptions.CAPABILITY, options);
//    			options.merge(cp);
    				threadLocalDriver.set(new ChromeDriver(options));
    				//getDriver() = new ChromeDriver(options);

    			} else if (browser.equals("firefox_win")) {
    				WebDriverManager.firefoxdriver().setup();
    				threadLocalDriver.set(new FirefoxDriver());

    			} else if (browser.equals("ie")) {
    				WebDriverManager.iedriver().setup();
    				threadLocalDriver.set(new InternetExplorerDriver());

    			} else if (browser.equals("edge")) {
    				WebDriverManager.edgedriver().setup();
    				threadLocalDriver.set(new EdgeDriver());
    			}

    			getDriver().manage().window().maximize();
    			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    		}
    		
   return getDriver();
}
	
	
	
	
	public JavascriptExecutor js() {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		return js;
	}

	public void clickJS(WebElement locator) {
		js().executeScript("arguments[0].click();", locator);
	}

	public void clickJSValue(WebElement value) {
		js().executeScript("arguments[0].click();", value);
	}

	public String print_Single_GetText(WebElement locatorkey) {
		String tx = locatorkey.getText();
		System.out.println(tx);
		return tx;
	}

	static List<WebElement> li;

	public List<WebElement> print_All_GetText(List<WebElement> comm_gettext_xpath) {
		li = comm_gettext_xpath;

		Iterator<WebElement> lii = li.iterator();

		while (lii.hasNext()) {
			String lis = lii.next().getText();
			System.out.println(lis);
		}
		return li;
	}

	static List<WebElement> li2;

	public List<WebElement> print_Attribute_GetText(List<WebElement> locator, String attri) {
		li2 = locator;

		Iterator<WebElement> lii2 = li2.iterator();

		while (lii2.hasNext()) {
			String lis2 = lii2.next().getAttribute(attri);
			System.out.println(lis2);
		}
		return li2;
	}

	public void printTable(List<WebElement> locators, String c1, String c2) {

		List<WebElement> tablerows = locators;
		String columf = c1;
		String colums = c2;
		String column;
		List<WebElement> tablecolumns;

		for (int i = 1; i < tablerows.size(); i++) {
			column = columf + i + colums;

			tablecolumns = getDriver().findElements(By.xpath(column));

			for (int j = 0; j < tablecolumns.size(); j++) {
				System.out.print(tablecolumns.get(j).getText() + "  ,  ");
			}
			System.out.println();
		}
	}

	public Actions actions() {
		Actions actions = new Actions(getDriver());
		return actions;
	}

	public void doubleClick(WebElement locatorkey) {

		actions().doubleClick(locatorkey).build().perform();
	}

	public void rightClick(WebElement locatorkey) {

		actions().contextClick(locatorkey).build().perform();
	}

	public WebDriverWait webDriverWait() {

		WebDriverWait wait1 = new WebDriverWait(getDriver(), 30);
		return wait1;

	}

	public void visibilityOfElementLocated(By visible_xpath) {
		webDriverWait().until(ExpectedConditions.visibilityOfElementLocated(visible_xpath));
	}

	public void elementToBeClickable(By locatorkey) {
		webDriverWait().until(ExpectedConditions.elementToBeClickable(locatorkey));
	}

	public static Robot robot() throws Exception {
		Robot robot1 = new Robot();
		return robot1;
	}

	public static void verifyLinks(String linkUrl) {

		// final String redd ="\u001b[31m";

		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " is a broken link" + "\n");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}

	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}

	

	public void dataPicker(String month, String exp_date, WebElement take_show_data_and_year_xpath,
			WebElement take_next_xpath, List<WebElement> take_all_dates_xpath) throws Exception {
		while (true) {
			// (double side comm Jan 24 xpath take
			String text = take_show_data_and_year_xpath.getText();
			// System.out.println(text); // here)

			if (text.equals(month)) {
				break;
			} else {
				clickJS(take_next_xpath); // ( --> this xpath take here)
			}
		}

		List<WebElement> allDates = take_all_dates_xpath; // tr/td[contains(text(),'day')]

		for (WebElement ele : allDates) {
			// String date_text = ele.getText();
			String date_text = ele.getAttribute("aria-label");
			// System.out.println(date_text);
			// String date[] = date_text.split("\n");

			if (date_text.equals(exp_date)) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
	}

//	public By getLocator(By locatorkey) {
//		By by = null;
//
//		if (locatorkey.id("_id"))
//			by = By.id(locatorkey);
//		else if (locatorkey.endsWith("_xpath"))
//			by = By.xpath(pro.getProperty(locatorkey));
//		else if (locatorkey.endsWith("_css"))
//			by = By.cssSelector(pro.getProperty(locatorkey));
//		else if (locatorkey.endsWith("_name"))
//			by = By.name(pro.getProperty(locatorkey));
//		else if (locatorkey.endsWith("_tagname"))
//			by = By.tagName(pro.getProperty(locatorkey));
//
//		return by;
//	}
	
	
	   @AfterMethod
	    public void tearDown(){
	        getDriver().quit();

	        System.out.println("After Test Thread ID: "+Thread.currentThread().getId());

	        threadLocalDriver.remove();
	    }
	
}
