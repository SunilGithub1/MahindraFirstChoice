package Com.Selenium.Prac;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class MultipleWindowHandling {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void windowprog() throws InterruptedException {
		driver.findElement(By.linkText("Click Here")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		java.util.Set<String> s1 =  driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("sunil@gmail.com");
				
				Thread.sleep(3000);
				
				driver.findElement(By.name("btnLogin")).click();
				
				Thread.sleep(3000);
				
				driver.close();
				
				Thread.sleep(3000);
			}
		}
		
		driver.switchTo().window(MainWindow);
	}

}
