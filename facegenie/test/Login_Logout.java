package facegenie.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Logout
{
	@Test
	public void check_Login()
	{
		//WebDriverManager.chromedriver().setup();

//		EdgeOptions option = new EdgeOptions();
//		option.addArguments("--disable-notifications");
//
//		EdgeDriver driver = new EdgeDriver(option);
//
//		driver.get("https://facegenie-ams-school.web.app/");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(DurationOfSeconds(30));
//		
//		driver.findElement(By.name("email")).sendKeys("testbams@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("facegenie");
//		driver.findElement(By.name("Log In")).click();
		
			//System.setProperty("webdriver.chrome.driver", "C:\Users\DELL\Downloads\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facegenie-ams-school.web.app/");
			driver.findElement(By.name("email")).sendKeys("testbams@gmail.com");
			driver.findElement(By.id("password")).sendKeys("facegenie");
			driver.findElement(By.name("Log In")).click();
			String actualUrl="https://facegenie-ams-school.web.app/";
			String expectedUrl= driver.getCurrentUrl();
			//Assert.assertEquals(expectedUrl,actualUrl);
		
	}

}
