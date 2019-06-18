package Com.Selenium.Prac;

import org.apache.poi.ss.formula.functions.T;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; */

//IMPLEMENTATION OF RE-ASSIGNING OF VALUES IN JAVA

/*
public class Test
{
	 int a=10;
	static int b=20;
	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(b);
		t.a=999;//re
		t.b=888;//re
		System.out.println(t.a);
		System.out.println(t.b);
		Test t1=new Test();
		System.out.println(t1.a);
		System.out.println(t1.b);
		t1.a=500;
		t1.b=777;
		Test t2=new Test();
		System.out.println(t2.a);
		System.out.println(t2.b);
	}
	
}
*/



		
		/*int a = 10;
		int b =20;
		c=8;
		System.out.println(c);
		//System.out.println(a);
		a = 15;
		a=16;
		a=17;
		a=18;
		System.out.println(a);
		
		CrunchifyObjectOverriding cb=new CrunchifyObjectOverriding();
		System.out.println(cb.a);;
		System.out.println(CrunchifyObjectOverriding.b);
		cb.a=65;
		cb.b=45;
		System.out.println(cb.a);
		System.out.println(cb.b);
		CrunchifyObjectOverriding cb1=new CrunchifyObjectOverriding();
		cb1.a=33;
		cb1.b=99;
		System.out.println(cb1.a);
		System.out.println(cb1.b);
		
	
	
}
}
*/	

	    /*System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/ajax.html");
	    java.util.List<WebElement> elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());

	    for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
	    }
	  }*/

// EXAMPLE OF LIST OR IMPLEMENTATION OF COLLECTION IN SELENIUM

		/*System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://in.yahoo.com/");
	    java.util.List<WebElement> list=driver.findElements(By.xpath("//a"));
	
	    
	    System.out.println(list.size());
	    for(int i=0;i<list.size();i++)
	    {
	    	String str=list.get(i).getText();
	    	System.out.println(str );
	    }
	    
	    
	}
	}*/

//EXAMPLE OF METHOD OVERRIDING IN SELENIUM

/*public class CrunchifyObjectOverriding {
	 
	public static void main(String args[]) {
		Company a = new Company(); // Company reference and object
		Company b = new eBay(); // Company reference but eBay object
 
		a.address();// runs the method in Company class
		b.address();// Runs the method in eBay class
	}
}
 
class Company {
 
	public void address() {
		System.out.println("This is Address of Crunchify Company...");
	}
}
 
class eBay extends Company {
 
	public void address() {
		System.out.println("This is eBay's Address...");
	}
}
	

// TO GET INFORMATION ON LOG4J REPORT FORMAT

// WEBSITE REFERNCE --- https://www.toolsqa.com/selenium-webdriver/log4j-logging/

package MultipleDropDown;



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

*/

// EXCEPTION WEBSITES

// https://dzone.com/articles/selenium-webdriver-exceptions
	