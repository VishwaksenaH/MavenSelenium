package verifygoogletest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifygoogleTest {
	WebDriver driver;
	//@Test(description= "Test case to open app")
	@BeforeMethod
	public void startapp()
	{
		//System.out.println("start");
		System.setProperty("webdriver.chrome.driver","C:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "google");
	}
	@Test(priority =1)
	public void checklogo()
	{
		boolean view=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(view);
		
	}
	@AfterMethod
		public void closebrowser()
		{
			driver.quit();
		}
}

/*import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class VerifygoogleTest {
	//Annotation sequence
    @BeforeSuite
    public void setproperty()
    {
        System.out.println("set the system property");
    }
    
    @BeforeClass
    public void enterurl()
    {
        System.out.println("Open url");
    }
    
    @BeforeTest
    public void launchbrowser()
    {
        System.out.println("Open the browser");
    }
    @BeforeMethod
    public void getURL()
    {
        System.out.println("display URL");
    }
    
    @Test
    public void checktitle()
    {
        System.out.println("check title of page");
    }
    
    @AfterClass
    public void closebrowser()
    {
        System.out.println("close browser");
    }
    
    @AfterMethod
    public void logout()
    {
        System.out.println("Logout");
    }
    
    @AfterTest
    public void checkresults()
    {
        System.out.println("result displayed");
    }

	
	
}*/