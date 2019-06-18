package MultipleDropDown;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import stagemfc.StagemfcsellPage;

public class DataDrivenTest {
	
	public static Logger log = Logger.getLogger(StagemfcsellPage.class.getName());
	    
	    WebDriver driver;
	    XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
	 
	    @Test()
	 public void initialization()  throws IOException, InterruptedException{
	    	
	    	DOMConfigurator.configure("log4j.xml");
	    	
	     // To set the path of the Chrome driver.
	 System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 
	     //TO LAUNCH WEBSITE
	 
	 	driver.get("https://www.stagemfc.com/sell");
	 	
	 	log.info("Website opened");
	 	
	 	
	 	System.out.println("Website opened");
	 	
	 	//TO SELECT CITY
	 	
	 	driver.findElement(By.xpath("//a[@class='btn btn_dark popular_locations'][contains(text(),'Bangalore')]")).click();
	     
	   log.info("Selected City Name as Bangalore");
	     
	     System.out.println("Selected City Name as Bangalore");
	     
	     // TO FETCH EXCEL SHEET
	
	     File src = new File("E:\\software\\DataDriven.xlsx");
	
	     FileInputStream fis = new FileInputStream(src);
	
	  	workbook = new XSSFWorkbook(fis);
	
	  	sheet = workbook.getSheetAt(0);
	  	
	
	  	for(int i = 1; i<=sheet.getLastRowNum(); i++) 
	
	  	{
		//TO SELECT YEAR
	  		
	  	cell = sheet.getRow(i).getCell(0);  //give column no.
		
		cell.setCellType(CellType.STRING);
		
		driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
		
		WebElement year = driver.findElement(By.xpath("//div[@id=\"ManufacturingYearId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"][1]"));
		
		year.sendKeys(cell.getStringCellValue());
		
		year.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		log.info("Year Entered as : " + cell);
		
		
		// TO SELECT MAKE
		
		cell = sheet.getRow(i).getCell(1);
		
		cell.setCellType(CellType.STRING);
		
		driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
		
      WebElement make = driver.findElement(By.xpath("//div[@id=\"MakeId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));

        make.sendKeys(cell.getStringCellValue());
        
        make.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		log.info("Make Entered as : " + cell);
		
		System.out.println("Make Entered as : " + cell);
		
		
		// TO SELECT MODEL
		
		cell = sheet.getRow(i).getCell(2);
				
		cell.setCellType(CellType.STRING);
				
		driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
				
		WebElement model = driver.findElement(By.xpath("//div[@id=\"ModelId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
		
	    model.sendKeys(cell.getStringCellValue());
	
	    model.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		log.info("Model Entered as : " + cell);
		
		System.out.println("Model Entered as : " + cell);
		
		//TO CLICK ON NEXT BUTTON
		
		driver.findElement(By.id("next")).click();
		
		log.info("Clicked on Next Button");
		
		System.out.println("Clicked On Next Button");
		
		//TO CLICK ON VARIANT
		
		cell = sheet.getRow(i).getCell(3);
		
		cell.setCellType(CellType.STRING);
				
		driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
				
		WebElement variant = driver.findElement(By.xpath("//div[@id=\"VariantId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
		
		variant.sendKeys(cell.getStringCellValue());
	
		variant.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		log.info("Variant Entered as : " + cell);
		
		System.out.println("Variant Entered as : " + cell);
		
		
		//TO CLICK ON KILOMETERS
		
			cell = sheet.getRow(i).getCell(4);
				
			cell.setCellType(CellType.STRING);
						
			driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
						
			WebElement KMs = driver.findElement(By.xpath("//div[@id=\"KmsDrivenRangeId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
				
			KMs.sendKeys(cell.getStringCellValue());
			
			KMs.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			
			log.info("Kilometers Entered as : " + cell);
			
			System.out.println("Kilometers Entered as : " + cell);
			
			
			//TO CLICK ON CITY
			
			cell = sheet.getRow(i).getCell(5);
				
			cell.setCellType(CellType.STRING);
						
			driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
						
			WebElement City = driver.findElement(By.xpath("//div[@id=\"CustomerCityId_chosen\"]//div[@class=\"chosen-search\"]/input[@placeholder=\"Search\"]"));
				
			City.sendKeys(cell.getStringCellValue());
			
			City.sendKeys(Keys.ENTER);
				
			Thread.sleep(2000);
			
			log.info("Selected City as : " + cell);
			
			System.out.println("Selected City as : " + cell);
			
			//TO CLICK ON NEXT BUTTON
			
			driver.findElement(By.id("step_2")).click();
			
			log.info("Clicked on Next Button");
			
			System.out.println("Clicked on Next Button");
			
		//TO ENTER MOBILE NO.
			
			cell = sheet.getRow(i).getCell(6);
			
			cell.setCellType(CellType.STRING);
			
			driver.findElement(By.id("Mobile")).sendKeys(cell.getStringCellValue());
			
			Thread.sleep(2000);
			
			log.info("Entered Mobile is : " + cell);
			
			System.out.println("Entered Mobile is : " + cell);
			
			//TO ENTER FULL NAME
			
            cell = sheet.getRow(i).getCell(7);
			
			cell.setCellType(CellType.STRING);
			
			driver.findElement(By.id("Name")).sendKeys(cell.getStringCellValue());
			
			Thread.sleep(2000);
			
			log.info("Entered Full Name as : " + cell);
			
			System.out.println("Entered Full Name as : " + cell);
			
			//TO ENTER EMAIL ID
			
            cell = sheet.getRow(i).getCell(8);
			
			cell.setCellType(CellType.STRING);
			
			driver.findElement(By.id("Email")).sendKeys(cell.getStringCellValue());
			
			Thread.sleep(2000);
			
			log.info("Entered Email ID as : " + cell);
			
			System.out.println("Entered Email ID as : " + cell);
			
			//TO CLICK ON SUBMIT BUTTON
			
			driver.findElement(By.id("step_3")).click();
			
			log.info("Clicked on Submit Button");
			
			System.out.println("Clicked on Submit Button");
			
			//IF WE WANT TO TALE MULTIPLE SCREEN SHOT AS PER LOOP
			
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
	        Date date = new Date();
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String S = "snap";
	        FileUtils.copyFile(scrFile, new File("E:\\software\\screenshot\\snap.png"+S+"-"+dateFormat.format(date)+".png"));
	        
	        log.info("All snapshot's were saved in File Location E:\\software\\screenshot folder");
	        
	        System.out.println("All snapshot's were saved in File Location E:\\software\\screenshot folder");
			
		     
		     // TO VERIFY THE TITLE OF PAGE AND MATCH WITH OUTPUT
		     
		     String expectedTitle = "Sell Used Car - Second Hand Car for Sale - Mahindra First Choice Wheels";
		     String actualTitle = driver.getTitle();
		     
		     if (expectedTitle.equals(actualTitle))
		     {
		    	 
		    	 System.out.println("Verification Successful and got the data");
		     } else {
		    	 
		    	 System.out.println("No data"); 
		     }
		      
		     boolean
		     aftersubmit = driver.findElement(By.xpath("//span[@class= 'w-100 float-left font_22 second_color light text-center mb_10']")).isDisplayed();
		     
		     //TO WRITE RESULT IN EXCEL SHEET
		     
		     FileOutputStream fos=new FileOutputStream(src);
		    
		     // Message to be written in the excel sheet
		         
		       String message = "Test Passed and Screenshot's are captured in E:\\software\\screenshot folder";
		         
		         // Create cell where data needs to be written.
		        
		         sheet.getRow(i).createCell(9).setCellValue(message);
		             
		         // finally write content
		        
		           workbook.write(fos);
		           
		           log.info("Test Result is saved in E:\\software\\DataDriven.xlsx");
			        
			       System.out.println("Test Result is saved in E:\\software\\DataDriven.xlsx");
		    
		      // close the file
		          
		           fos.close();
		           
		           System.out.println("GOING TO NEXT LOOP AND ENTERING THE NEXT DATA GIVEN IN EXCEL SHEET.");
		           
		           log.info("GOING TO NEXT LOOP AND ENTERING THE NEXT DATA GIVEN IN EXCEL SHEET.");
		           
		           driver.get("https://www.stagemfc.com/sell");
		           
		           if(i == sheet.getLastRowNum()) {
		        	   break;
		           }
		          }
		          driver.close();
	}

}






   
    		
  
   
