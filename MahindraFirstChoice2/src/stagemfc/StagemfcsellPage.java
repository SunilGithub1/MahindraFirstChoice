// Program for URL https://www.mahindrafirstchoice.com/Sell and sending value in the search bar


package stagemfc;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import common.TestBase;


public class StagemfcsellPage extends TestBase
{
	@Test
	public void Secondcase() throws InterruptedException, Exception 
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='btn btn_dark popular_locations'][contains(text(),'Bangalore')]")).click();
	
		
	driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement year = driver.findElement(By.xpath("//div[@id=\"ManufacturingYearId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"][1]"));
	year.sendKeys("2018");
	year.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered year as 2018");
	
	driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement make = driver.findElement(By.xpath("//div[@id=\"MakeId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
	make.sendKeys("ASTON MARTIN");
	make.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered Make as ASTON MARTIN");
	
	driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement model = driver.findElement(By.xpath("//div[@id=\"ModelId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
	model.sendKeys("RAPIDE");
	model.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered Model as RAPIDE");
	
	driver.findElement(By.id("next")).click();
	
	Thread.sleep(3000);
	
	//driver.findElement(By.id("back")).click();
	
    driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement variant = driver.findElement(By.xpath("//div[@id=\"VariantId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
	variant.sendKeys("SV12");
	variant.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered Variant as SV12");
	
    driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement kilometers = driver.findElement(By.xpath("//div[@id=\"KmsDrivenRangeId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
	kilometers.sendKeys("LESS THAN 10,000");
	kilometers.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered Kilometers as LESS THAN 10,000");
	
    driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
	
	WebElement city = driver.findElement(By.xpath("//div[@id=\"CustomerCityId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
	city.sendKeys("BANGALORE");
	city.sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	log.info("Entered City as BANGALORE");
	
     driver.findElement(By.id("step_2")).click();
	
	Thread.sleep(3000);
	
	//driver.findElement(By.id("back_2")).click();
	
	driver.findElement(By.id("Mobile")).sendKeys("9742721634");
	
	Thread.sleep(2000);
	
	log.info("Entered Mobile no. as 9742721634");
	
	driver.findElement(By.id("Name")).sendKeys("sunil");
	
	Thread.sleep(2000);
	
	log.info("Entered Name as Sunil");
	
	driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	
	Thread.sleep(2000);
	
	log.info("Entered email ID as abc@gmail.com");
	
	driver.findElement(By.id("step_3")).click();
	
	Thread.sleep(2000);
	
	System.out.println("Entered Year:" + " " + 2018);
    
    
    System.out.println("Entered Make:" + " " + "ASTON MARTIN");
    
    System.out.println("Entered Model:" + " " + "RAPIDE");
    
    System.out.println("Entered Variant:" + " " + "SV12");
    
    System.out.println("Entered Kilometers driven:" + " " + "LESS THAN 10,000");
    
    System.out.println("Entered City:" + " " + "BANGALORE");
    
    System.out.println("Entered mobile no:" + " " + "9742721634");
    
    System.out.println("Entered full name:" + " " + "sunil");
    
    System.out.println("Entered email ID:" + " " + "test@gmail.com");
    
    System.out.println("Required screen shot is saved in package explorer of eclipse inside screenshot folder \\snap.png");
    
 // to fetch data of output
    
    WebElement output = driver.findElement(By.xpath("//span[@class= 'w-100 float-left font_22 second_color light text-center mb_10']"));
	  
	  output.getText();
	  
	  String exresult = "Recommended car value";
	  String actresult = "Recommended car value";
	  
	  if(exresult.contains(actresult)) {
		  System.out.println("The value of car as per given data is : " + "20.79 Lakhs to 23.09 Lakhs");
	  }
	  else {
		  System.out.println("value is not matching");
	  }
	
	//TO TAKE SCREEN SHOT
	 
	  TakesScreenshot ts=(TakesScreenshot)driver;
	     FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(".\\screenshot\\snap.png"));
	     
	     log.info("Screenshot taken and captured in Eclispe package explorer \\screenshot\\snap.png");
	    
	     driver.close();

	}
}
	
	



