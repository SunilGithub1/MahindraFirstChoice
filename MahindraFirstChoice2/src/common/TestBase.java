package common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import stagemfc.StagemfcsellPage;

public class TestBase {
	public static Logger log = Logger.getLogger(StagemfcsellPage.class.getName());
	public static WebDriver driver;
	
	@BeforeClass
    public void setUp() throws Exception {
        StaticSetup();
    }
	public static void StaticSetup() throws InterruptedException
    {
        
            DOMConfigurator.configure("log4j.xml");
            System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
    		 driver=new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    		driver.get("https://www.mahindrafirstchoice.com/sell");
    		log.info("navigated to URL");
    		
    		driver.findElement(By.xpath("//div[@class='modal show']/div/div/div/ul/li[3]/a")).click();
            }
	@AfterClass
    public void tearDown() throws InterruptedException{
 driver.quit();
 Thread.sleep(3000);
    }
	
}
