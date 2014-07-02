package test.trihonda;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;

public class RequestQuote {
	
	Sheet s;

	private StringBuffer verificationErrors = new StringBuffer();
	
	private static WebDriver driver;
	  public static final String USERNAME = "earlwillis1";
	  public String browser_type;
	  public String fail,error;
	  public String Dealer;
	  public String name;
	  public String baseUrl = "http://dev.trihonda.pubmodev.com";
		public static final String AUTOMATE_KEY = "XsPyFTirN4mH8aCLMB9A";
		static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		
		String local=(new java.io.File("").getAbsolutePath());
		String data="" + local + "/" + "infoqa.xls";	
		String myTitle;
	    String safe = "http://10.10.10.34:8080/job/TESTNG3/ws/PageLoads";
	  @Test(groups = {"request"})
		@Parameters({"browser"})
	  @BeforeClass
	  public void beforeClass(String browser) throws IOException, InterruptedException
	  {	   
		  
		  
		  if (browser.equals("firefox")) {
			  driver=browserFirefox();
			}
		  

		  else if (browser.equals("chrome")) {
			  driver=browserChrome();
			}
		  
		  else if (browser.equals("safari")) {
			  driver=browserSafari();
			}
		  
		  else if (browser.equals("ie9")) {
			  driver=browserIE9();
			}
		  

		  else if (browser.equals("iPad")) {
			  driver=browserIpad();
			}
		  
		  else if (browser.equals("Android")) {
			  driver=browserAndroid();
			}
		  
		  String name=""+ browser+"/RequestQuote/" + timeStamp+ "" + "";
		 
			  System.out.println("Let me see which one get tested " +browser);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail=""+ browser+"/Failed/" + timeStamp + "_" + "contact_us.png";
			 
			
		  driver.get(baseUrl);
		  driver.get(baseUrl + "/honda-dealer-results?zip=10466&all=1");
		  
		  for(int row=1; row <=s.getRows();row++) {
				
			   // String baseurl="http://www.google.com";
			   // driver.get(baseurl);

				String urlname = s.getCell(0, row).getContents();
				driver.get(urlname);
				Thread.sleep(1000);
				takeScreen(name);
				
				//((Rotatable) driver).rotate(ScreenOrientation.PORTRAIT);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Thread.sleep(3000);

				
				
				
				   //driver.findElement(By.cssSelector("a.request-button.blue-button > span")).click();
				   
				   driver.findElement(By.cssSelector("div.no-offer-callout-details > a.request-button.blue-button > span")).click();
				    driver.findElement(By.id("fname")).clear();
				    driver.findElement(By.id("fname")).sendKeys("TestFirst");
				    driver.findElement(By.id("lname")).clear();
				    driver.findElement(By.id("lname")).sendKeys("TestLast");
				    driver.findElement(By.id("email")).clear();
				    driver.findElement(By.id("email")).sendKeys("donotreply@pkt.com");
				    driver.findElement(By.id("zipcode")).clear();
				    driver.findElement(By.id("zipcode")).sendKeys("11413");
				    driver.findElement(By.id("phone")).clear();
				    driver.findElement(By.id("phone")).sendKeys("2122222222");
				    driver.findElement(By.cssSelector("div.button > button.blue-button")).click();
					Thread.sleep(1000);
				//System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle() + " - landscape");

				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			    File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile2, new File("Y://Screenshots/" +   "/" + row +  "-" + timeStamp + "-" + "success.png"));
				


				//System.out.println(driver.getCurrentUrl() + " - " + driver.getTitle() + " - portrait");

				
			   // File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//FileUtils.copyFile(scrFile2, new File("Y://Screenshots/" +  browserName + browserVersion + "/" + row +   "-portrait.png"));
				//((Rotatable) driver).rotate(ScreenOrientation.LANDSCAPE);
				
				}
				}

	  
	  public WebDriver browserFirefox() throws MalformedURLException  
		 {  
		  
			 System.out.println("Let me run Firefox");
			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = DesiredCapabilities.firefox();
			  caps.setCapability("browser", "FireFox");
			  caps.setCapability("browser_version", "22.0");
			  caps.setCapability("os", "Windows");
			  caps.setCapability("os_version", "7");
			  caps.setCapability("browserstack.debug", "true");

			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run Firefox");
		      browser_type="firefox";
		      System.out.println("Let me see which one get tested" +browser_type);
		      System.out.println("Let me see which one get tested" +driver);
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      return driver;
		   
		    
		 }  

		 public WebDriver browserChrome() throws MalformedURLException  
		 {  
		  
			 browser_type="chrome";
			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = DesiredCapabilities.firefox();
			 caps.setCapability("browser", "Chrome");
			 caps.setCapability("browser_version", "32.0");
			 caps.setCapability("os", "Windows");
			 caps.setCapability("os_version", "7");
			 caps.setCapability("resolution", "1024x768");

			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run Chrome");
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      
		      return driver;
		 }
		 public WebDriver browserSafari() throws MalformedURLException  
		 {  
		  
			 browser_type="safari";
			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability("browser", "Safari");
			 caps.setCapability("browser_version", "6.0");
			 caps.setCapability("os", "OS X");
			 caps.setCapability("os_version", "Lion");
			 caps.setCapability("resolution", "1024x768");
			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run Safari");
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      
		      return driver;
		   
		    
		 }
		    

		 
		 public WebDriver browserIE9() throws MalformedURLException  
		 {  
		  
			
			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability("browser", "IE");
			 caps.setCapability("browser_version", "9.0");
			 caps.setCapability("os", "Windows");
			 caps.setCapability("os_version", "7");
			 caps.setCapability("resolution", "1024x768");
			 caps.setCapability("browserstack.debug", "true");

			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run IE9");
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      
		      return driver;
		   
		    
		 }
		 
		 public WebDriver browserIpad() throws MalformedURLException  
		 {  
		  

			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability("browserName", "iPad");
			 caps.setCapability("platform", "MAC");
			 caps.setCapability("device", "iPad 3rd (7.0)");

			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run Ipad");
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      
		      return driver;
		   
		    
		 }
		 
		 public WebDriver browserAndroid() throws MalformedURLException  
		 {  
		  
			
			 String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability("browserName", "android");
			 caps.setCapability("platform", "ANDROID");
			 caps.setCapability("device", "Samsung Galaxy Note 10.1");

			    driver = new RemoteWebDriver(new URL(URL), caps);
		      System.out.println("Let me run Android");
		      driver.get("http://stage.coffee-mate.com/Registration/Create-Account.aspx?email=" + timeStamp +"%40yahoo.com&stt=True");
		      
		      return driver;
		   
		    
		 }
		 public WebDriver takeScreen(String name) throws IOException
		 {
			 WebDriver augmentedDriver = new Augmenter().augment(driver);
		     System.out.println("Let me take a screenshot of the page " +name);
			  
			    	
			    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
			    myTitle = driver.getTitle();
			   
			    FileUtils.copyFile(screenshot, new File(name));
			    
			    return driver;
		 }
		 @AfterMethod(alwaysRun = true, description = "take screenshot on  fail") 
		 public void afterMethod_takeScreenshot(ITestResult result) throws Exception { 
		 if (!result.isSuccess()) { 
			 

			 WebDriver augmentedDriver = new Augmenter().augment(driver);
		     System.out.println("I found a bug placed a screen shot @ Map Dealer Folder");
			  
			    	
			    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

			   
			    FileUtils.copyFile(screenshot, new File(fail));
		
		 } 
		 }

}
