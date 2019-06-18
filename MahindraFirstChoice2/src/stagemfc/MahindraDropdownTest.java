// Program for URL https://www.mahindrafirstchoice.com/Sell and clicking on dropdown



package stagemfc;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import common.TestBase;


public class MahindraDropdownTest extends TestBase
{
	@Test
	public void Secondcase() throws InterruptedException, Exception 
	{
		
		driver.findElement(By.xpath("//a[@class='btn btn_dark popular_locations'][contains(text(),'Bangalore')]")).click();
		
		log.info("Selected City Name as Bangalore");
	  
		driver.findElement(By.xpath("//div[@id='ManufacturingYearId_chosen']/a")).click();
	
	   driver.findElement(By.xpath("//li[text()='2017']")).click();
		
	    Thread.sleep(2000);
	    
	    log.info("Entered year as 2017");
	    
	    driver.findElement(By.xpath("//div[@id='MakeId_chosen']/a")).click();
	    
	    driver.findElement(By.xpath("//li[text()='AUDI']")).click();
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Make as AUDI");
	    
	    driver.findElement(By.xpath("//div[@id='ModelId_chosen']/a")).click();
	    
	    driver.findElement(By.xpath("//li[text()='A4']")).click();
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Model as A4");
	   
	    driver.findElement(By.id("next")).click();
	    
	    driver.findElement(By.xpath("//div[@id='VariantId_chosen']/a")).click();
	    
	    driver.findElement(By.xpath("//li[text()='30 TSFI PREMIUM PLUS']")).click();
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Variant as 30 TSFI PREMIUM PLUS");
	    
	    driver.findElement(By.xpath("//div[@id='KmsDrivenRangeId_chosen']/a")).click();
	    
	    driver.findElement(By.xpath("//li[text()='30,001-50,000']")).click();
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Kilometers as 30,001-50,000");
	    
	    driver.findElement(By.xpath("//div[@id='CustomerCityId_chosen']/a")).click();
	    
	    driver.findElement(By.xpath("//li[text()='CHENNAI']")).click();
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered City as CHENNAI");
	    
	    driver.findElement(By.id("step_2")).click();
	    
	    driver.findElement(By.id("Mobile")).sendKeys("9742721634");
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Mobile no. as 9742721634");
	    
	    driver.findElement(By.id("Name")).sendKeys("sunil");
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered Name as Sunil");
	    
	    driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    log.info("Entered email ID as test@gmail.com");
	    
	  //if we want to click on back button
	    
	/*    driver.findElement(By.id("back_2")).click();
	    
	    Thread.sleep(2000);
	    
	   driver.findElement(By.id("back")).click();
	   
	   Thread.sleep(2000);
	    
	    driver.findElement(By.id("next")).click();
	    
	    Thread.sleep(2000);
	    
	   driver.findElement(By.id("step_2")).click();
	   
	   Thread.sleep(2000);
	   */
	    
	    driver.findElement(By.id("step_3")).click();
	    
	    Thread.sleep(2000);
	    
//if we want to take screen shot
	    
	    TakesScreenshot ts=(TakesScreenshot)driver;
	     FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("E:\\software\\screenshot\\snap.png"));
	     
	     log.info("Screenshot taken and captured in E:\\software\\screenshot\\snap.png");
	 
	    
// Entered data details
	    System.out.println("Entered Year:" + " " + 2017);
	    
	    
	    System.out.println("Entered Make:" + " " + "AUDI");
	    
	    System.out.println("Entered Model:" + " " + "A4");
	    
	    System.out.println("Entered Variant:" + " " + "30 TSFI PREMIUM PLUS");
	    
	    System.out.println("Entered Kilometers driven:" + " " + "30,001-50,000");
	    
	    System.out.println("Entered City:" + " " + "CHENNAI");
	    
	    System.out.println("Entered mobile no:" + " " + "9742721634");
	    
	    System.out.println("Entered full name:" + " " + "sunil");
	    
	    System.out.println("Entered email ID:" + " " + "test@gmail.com");
	    
	    
	    
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
	  
	  System.out.println("Required screen shot is saved in E:\\software\\screenshot\\snap.png");
	     
	     driver.close();
	
	}

	
}			          

	    
	     
	     
	
	

	

