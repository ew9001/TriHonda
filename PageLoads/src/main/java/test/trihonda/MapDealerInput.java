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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MapDealerInput {

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
	  @Test(groups = {"map"})
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
		  
		  String name=""+ browser+"/MapDealer/" + Dealer+ "" + "";
		 
			  System.out.println("Let me see which one get tested " +browser);

			  
		 
		  System.out.println("Let me run get driver "+driver);
		  fail=""+ browser+"/Failed/" + timeStamp + "_" + "contact_us.png";
			 
			
		  driver.get(baseUrl);
		  driver.get(baseUrl + "/honda-dealer-results?zip=10466&all=1");
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("APPLE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Apple-Honda.png";
		    
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("ATLANTIC HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.findElement(By.name("zip")).clear();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Atlantic-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).sendKeys("BABYLON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Babylon-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("BARON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Baron-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("BAY RIDGE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer= "-Bay-Ridge-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("BREWSTER HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer= "-Brewster-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("BRONX HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Bronx-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("CURRY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Curry-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("FRIENDLY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Apple-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HILLSIDE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Hillside-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA CITY");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-City.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA MANHASSET");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-Manhasset.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF KINGSTON");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Honda-of-Kingston.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF MANHATTAN");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-of-Manhattan.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF NANUET");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Honda-of_Nanuet.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF NEW ROCHELLE");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-of-NewRochelle.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();    
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF STATEN ISLAND");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-of-Staten_Island.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HUNTINGTON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Huntington-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MIDDLETOWN HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Middleton-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MILLENNIUM HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Milennium-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MOREHEAD HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Morehead-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MT. KISCO HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Mt-Kisco-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("NARDY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Nardy-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("NORTH SHORE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-North-Shore-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("PARAGON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Parago-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("PLAZA HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer= "-Plaza-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("SOUTH SHORE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-SouthShore-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("TARRYTOWN HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Tarrytown-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("WHITE PLAINS HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Dealer="-White-Plains-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("YONKERS HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Yonkers-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("AUTOSPORT HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-AutoSport-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("CAUSEWAY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Causeway-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("CLINTON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Dealer="-Clinton-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("COAST HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Coast-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("DCH ACADEMY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-DCH-Academy-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("DCH KAY HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-DCH-Kay-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("DCH PARAMUS HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-DCH-Paramus-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("GARDEN STATE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Dealer="-Garden-State-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HACKETTSTOWN HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		    Dealer="-Hackettstown-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF FREEHOLD");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Honda-of-Freehold.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF PRINCETON");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Dealer="-Honda-of-Princeton.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF TENAFLY");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Honda-of-Tenafly.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF TOMS RIVER");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-of-TomsRiver.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA UNIVERSE");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Honda-Universe.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HUDSON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Hudson-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("JOYCE HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile46 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Joyce-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MADISON HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile47 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Madison-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("MAHWAH HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile48 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Mahwah-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("METRO HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile49 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Metro-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("OPEN ROAD HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile50 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Open-Road-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		  
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("PAUL MILLER HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile51 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Paul-Miller-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("PHILLIPSBURG-EASTON");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    File scrFile52 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    Dealer="-Phillipsburg-Easton.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("PLANET HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Planet-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("ROUTE 22 HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="-Route22-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("ROUTE 23 HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="-Route23-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("SUSSEX HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    Dealer="-Sussex-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("V.I.P. HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Dealer="-Garden-State-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("CURTISS RYAN HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="Curtiss-Ryan-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("GREENWICH HONDA");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		    Dealer="Greenwich-Honda.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF DANBURY");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    Dealer="Honda-of=Danbury.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
		    
		    driver.findElement(By.name("zip")).clear();
		    driver.findElement(By.name("zip")).sendKeys("HONDA OF WESTPORT");
		    driver.findElement(By.linkText("GO")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		    Dealer="Honda-of-Westport.png";
		    name=""+browser+"/MapDealer/"+Dealer+"";takeScreen(name);
	    	 driver.quit();   
		
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("Let me run beforeTest");
	  }  
	  @Test
	  public void f()
	  {
	       //your test code here
		  System.out.println("I'm out here print f");
	  }
	 @AfterTest
	 public void afterTest()
	 {
	 }
	 @AfterClass
	 public void afterClass()
	 {
	     driver.quit();
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
	 @AfterMethod(alwaysRun = true, description = "take screenshot on fail") 
	 public void afterMethod_takeScreenshot(ITestResult result) throws Exception { 
	 if (!result.isSuccess()) { 
		 

		 WebDriver augmentedDriver = new Augmenter().augment(driver);
	     System.out.println("I found a bug placed a screen shot @ Map Dealer Folder");
		  
		    	
		    File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

		   
		    FileUtils.copyFile(screenshot, new File(fail));
	
	 } 
	 }

	}  
