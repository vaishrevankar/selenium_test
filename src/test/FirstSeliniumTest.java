
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;


 

public class FirstSeliniumTest {
	
	
public static String browser;
public static WebDriver driver;

	public static void main(String[] args) {
		
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}
		
		//String projectlocation = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectlocation+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		//driver.get("http://seleniumhq.org/");
		//driver.quit();
	
	
	public static void setBrowser()
	{
	//browser = "Chrome"	;
	}
	public static void setBrowserConfig()
	{
		String projectlocation = System.getProperty("user.dir");
		if (browser.contains("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", projectlocation+"/drivers/chromedriver/chromedriver.exe");
	     driver = new ChromeDriver();
		}
		
	}
	
	public static void runTest()
	{
	driver.get("http://seleniumhq.org/");
	driver.manage().window().maximize();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//driver.quit();
	//driver.findElement(By.id("searchInput")).sendKeys("SeleniumHQ Browser Automation");
	driver.findElement(By.className("nav-item")).click();

	String h= driver.getTitle();
	System.out.println(h);
	String e= "SeleniumHQ Browser Automation";
	driver.close();
	//driver.quit();

	if(h.equalsIgnoreCase(e)){
	System.out.println("pass");
	}
	else{
	System.out.println("fail");
	}

//driver.findElements(((WebElement) By.id("searchInput")).sendKeys("wipro");
//driver.findElement(By.className("pure-button")).click();

	}
	
	}



//set browser 
//set browser config
//runTest
