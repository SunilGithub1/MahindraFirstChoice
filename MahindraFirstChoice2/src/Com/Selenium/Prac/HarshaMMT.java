package Com.Selenium.Prac;
// NOT ABLE TO CLICK ON SEARCHH BUTTON IN THE WEBSITE AS THE MMT IS GIVING RESTRICTION FOR AUTOMATED BROWSERS 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HarshaMMT {
	
	WebDriver driver;
	
	@Test
	public void mmt() throws InterruptedException {
		
		int i;
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Clicked on flight booking link");
		
		  driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]//label")).click();
		  
		  System.out.println("clicked on from city dropdown");
		  
		  Thread.sleep(2000);
		  
		  WebElement cityfrom = driver.findElement(By.xpath("//input[@placeholder='From']"));
		  
		Actions action = new Actions(driver);
		
		action.moveToElement(cityfrom).moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0"))).click().build().perform();
		
		System.out.println("selected city from option in dropdown");
		
		Thread.sleep(3000);
		
		WebElement cityto = driver.findElement(By.xpath("//input[@placeholder='To']"));
		  
		Actions action1 = new Actions(driver);
		
		action1.moveToElement(cityto).moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-1"))).click().build().perform();
			
		System.out.println("selected city to option in dropdown");
		
		Thread.sleep(2000);
		
		// CLICKING NEXT ARROW BUTTON TILL 6-FEB-2019
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		
		for (i = 2019; i<2020; i++)
		{
			
		}
		

		/*	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(3000);*/
		
	
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[2]//div[5]//div[1]//p[1]")).click();
		Thread.sleep(2000);
		
		System.out.println("clicked  on NEXT arrow button till my required date");
		
		driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")).click();
		Thread.sleep(2000);
		
		System.out.println("clicked on search button");
		
		driver.findElement(By.xpath("//div[@id='fli_list_item0']//div//button[@class='fli_primary_btn text-uppercase'][contains(text(),'Book Now')]")).click();
		Thread.sleep(2000);
	}
	
		
	}

		
		
	


