package pages.elements;


import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;


public class TC0007_BrokenLinks_Page extends BaseClass{
	
WebDriver driver;
	
	public TC0007_BrokenLinks_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath = "//div[@class='category-cards']/div[1]")
	WebElement click_elment_XPATH;
	
	@FindBy(xpath = "//div[@class='element-list collapse show']/ul/li[7]")
	WebElement brokenlinks_xpath;
	
	@FindBy(tagName = "a")
	List<WebElement> tagname_name;
	
	@FindBy(tagName = "img")
	List<WebElement> tagnameimage_name;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/a")
	List<WebElement> getTextxomm_xpath;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/a[1]")
	WebElement f_xpath;
	
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[2]/a[2]")
	WebElement s_xpath;
	
	
	
	
	
	public void brokenlinks_Button_Click() throws Exception {
		clickJS(click_elment_XPATH);
		Thread.sleep(1000);
		clickJS(brokenlinks_xpath);
		Thread.sleep(1000);
	}
	
	public void brokenlinks_All() {
		  //Storing the links in a list and traversing through the links
       // List<WebElement> links = getElements("tagname_name");
        List<WebElement> links = tagname_name;

        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size() +"\n");  
      
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            WebElement E1= links.get(i);
            String url= E1.getAttribute("href");
            verifyLinks(url);
        }
        
       // driver.quit();
    }

	public void brokenlinks_images() {
		 // Storing all elements with img tag in a list of WebElements
       // List<WebElement> images = getElements("tagnameimage_name");
		List<WebElement> images = tagnameimage_name;
        System.out.println("Total number of Images on the Page are " + images.size() +"\n");
        
        
        //checking the links fetched.
        for(int index=0;index<images.size();index++)
        {
            WebElement image= images.get(index);
            String imageURL= image.getAttribute("src");
            System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
            verifyLinks(imageURL);
          
            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK" +"\n");
                }else {
                     System.out.println("DISPLAY - BROKEN" +"\n");
                }
            } 
            catch (Exception e) {
            	System.out.println("Error Occured");
            }
        }

	}
	
	public void brokenlinks_getText_Links() {
		print_All_GetText(getTextxomm_xpath);
		
	}
	
	public void brokenlinks_click_Links(String link11, String link22) throws Exception {
		
		//List<WebElement> links = getTextxomm_xpath;
		
		switch(link11){
		case "true":
			
			clickJS(f_xpath);
			
			break;
		case "false":
			System.out.println("");
			break;
			default:
			break;
		}
		
		
		Thread.sleep(2000);
		String actu = "https://demoqa.com/";
		softassert.assertEquals(actu, driver.getCurrentUrl(), " fffffffff");
		getDriver().navigate().to("https://demoqa.com/broken");
		Thread.sleep(1000);
		
		switch(link22){
		case "true":
     		
			clickJS(s_xpath);
					
			break;
		case "false":
			System.out.println("");
			break;
			default:
				
				break;
		}
		
		
		Thread.sleep(2000);
		getDriver().navigate().back();
		Thread.sleep(2000);
	}

	
}
