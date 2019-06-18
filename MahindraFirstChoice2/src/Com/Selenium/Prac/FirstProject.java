package Com.Selenium.Prac;
/*PROGRAM TO VERIFY THE SELL PAGE OF MAHINDRAFIRSTCHOICE.COM/SELL PAGE*/




import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import common.TestBase;

public class FirstProject extends TestBase 
{
	@Test

	public void Firstcase() throws InterruptedException, WebDriverException, IOException {
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//a[@class='btn btn_dark popular_locations'][contains(text(),'Bangalore')]")).click(); 
	
	 // to select benifits of mfcw cars under "OUR ADVANTAGE"	
		
		WebElement element = driver.findElement(By.linkText("OUR ADVANTAGE"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav[2]/div/ul/li[2]/div/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
	//to select warranty products under "OUR ADVANTAGE"
		
       WebElement element1 = driver.findElement(By.linkText("OUR ADVANTAGE"));
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav[2]/div/ul/li[2]/div/a[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	
		
		//to select finance under "VALUE ADDED PRODUCTS"*/
		
		WebElement element2 = driver.findElement(By.linkText("VALUE ADDED PRODUCTS"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav[2]/div/ul/li[3]/div/a[1]")).click();
	    Thread.sleep(3000);
	  
	    //to select the mahindra first choice link inside the page
	   
	    driver.navigate().to("https://www.mahindrafirstchoice.com/");
	    Thread.sleep(3000);
	    
	    
	    
	    //to select the eligibility criteria(read more) link
	    
	   driver.navigate().to("https://www.mahindrafirstchoice.com/eligibility-criteria?previouspage=Finance");
	    Thread.sleep(3000);
	    driver.navigate().back();
	   
	    //to select documents required(read more) link
	    
	    driver.navigate().to("https://www.mahindrafirstchoice.com/document-required?previouspage=Finance");
	    Thread.sleep(3000);
	    driver.navigate().back(); 
	    
	    
	    
	    //to select apply online (read more) link
	    
	   driver.navigate().to("https://www.mahindrafirstchoice.com/apply-online?previouspage=Finance");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    
	  driver.findElement(By.xpath("//*[@id=\"select_your_city_modal\"]/div/div/div/ul/li[3]/a")).click();
	    
	    //to select EMI calculator under "VALUE ADDED PRODUCTS"
	    
	   WebElement element3 = driver.findElement(By.linkText("VALUE ADDED PRODUCTS"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(element3).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav[2]/div/ul/li[3]/div/a[2]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("calulated_emi_main")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back(); 
	    
	   
	   
	    
	    
	    //to select konnect first under "VALUE ADDED PRODUCTS"
	    
	   WebElement element4 = driver.findElement(By.linkText("VALUE ADDED PRODUCTS"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(element4).build().perform();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav[2]/div/ul/li[3]/div/a[3]")).click();
	    Thread.sleep(3000);
	    
	    
	    
	    //to click on INTRO inside konnect first
	    
	    driver.findElement(By.xpath("//*[@id=\"choose_by_criteria\"]/li[1]/a")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.mahindrafirstchoice.com/konnectfirst-privacy-policy?previouspage=konnectfirst");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	   
	    
	    //to click on FEATURES inside konnect first
	    
	   driver.findElement(By.xpath("//*[@id=\"choose_by_criteria\"]/li[2]/a")).click();
	    
	    Thread.sleep(2000);
	    
        driver.navigate().to("https://www.mahindrafirstchoice.com/konnectfirst-privacy-policy?previouspage=konnectfirst");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    
	    
	    //to click on FAQ's inside konnect first
	    
	    driver.findElement(By.xpath("//*[@id=\"choose_by_criteria\"]/li[3]/a")).click();
	    
	    Thread.sleep(2000);
	    
	  
	    
        driver.navigate().to("https://www.mahindrafirstchoice.com/konnectfirst-privacy-policy?previouspage=konnectfirst");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	   
	  //to click on WARRANTY ITEMS inside konnect first
	    
	  driver.findElement(By.xpath("//*[@id=\"choose_by_criteria\"]/li[4]/a")).click();
	    
	    Thread.sleep(2000);
	    
        driver.navigate().to("https://www.mahindrafirstchoice.com/konnectfirst-privacy-policy?previouspage=konnectfirst");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	   
	    
	    driver.quit();
	  
	    
	}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
