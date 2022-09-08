//Maven Project 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testworld {
	
	public static String browser="chrome";
	public static WebDriver driver;
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Tarab\\eclipse-workspace\\SeleniumPractise\\SelPro\\Driver\\chromedriver.exe");
		
@BeforeSuite
	public void setup()
		{
	if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}		
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}

		}
@Test
public void logk()
{
driver.get("https://www.way2automation.com/");
String title=driver.getTitle();
System.out.println(title.length());
System.out.println(title);
System.out.println(title.charAt(3));

}
@AfterSuite
public void down()
{
driver.close();//current browser window 
driver.quit();//current browser window + all related tabs of browser   
}

}
