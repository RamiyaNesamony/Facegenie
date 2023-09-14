package facegenie.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Facegenie_Test
{
	 static WebDriver browser;

	  @BeforeTest
	   public static void setup() {

	    //WebDriverManager..setup();

	    ChromeOptions options = new ChromeOptions();
	   
	    options.addArguments("start-maximized"); // open Browser in maximized mode
	    options.addArguments("disable-infobars"); // disabling infobars
	    options.addArguments("--disable-extensions"); // disabling extensions
	    options.addArguments("--disable-gpu"); // applicable to Windows os only
	    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	   options.addArguments("--no-sandbox"); // Bypass OS security model
	    options.addArguments("--disable-in-process-stack-traces");
	    options.addArguments("--disable-logging");
	    options.addArguments("--log-level=3");
	    options.addArguments("--remote-allow-origins=*");

	    browser = new ChromeDriver(options);
	    //browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }

	  @Test
	  
	   void testTitle() 
	  {
//	    browser.get("https://google.com/");
//	    Assert.assertEquals("Google", browser.getTitle());
	    browser.get("https://facegenie-ams-school.web.app/");
	    browser.findElement(By.name("email")).sendKeys("testbams@gmail.com");
	    browser.findElement(By.id("password")).sendKeys("facegenie");
	    browser.findElement(By.xpath("//button[text()='Log In']")).click();
	    String actualUrl="https://facegenie-ams-school.web.app/";
	    String expectedUrl= browser.getCurrentUrl();
	    Assert.assertEquals(expectedUrl,actualUrl);
	    browser.findElement(By.xpath("//span[text()='Dashboard']")).click();
	    
	    
	  }
	 
	  @Test
	  void adding_NewStudent() throws InterruptedException
	  {
			Thread.sleep(2000);
			browser.findElement(By.xpath("//span[text()='Attendance Logs']")).click();
			// browser.findElement(By.xpath("//p[text()='Add student using
			// Form']")).click();
			String actualTitle = "https://facegenie-ams-school.web.app/dashboard/AttendanceLogs";
			String expectedTitle = browser.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			browser.findElement(By.name("admissionNo")).sendKeys("12356");
			browser.findElement(By.name("firstName")).sendKeys("Ramiya");
			browser.findElement(By.name("lastName")).sendKeys("Francis");
			browser.findElement(By.name("fathersName")).sendKeys("Francis");
			WebElement findSelectClass = browser.findElement(By.id("demo-simple-select-helper"));
			Select dropdown = new Select(findSelectClass);
			dropdown.selectByValue("CLASS 2");
	    
	  }
	}


