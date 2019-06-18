package stagemfctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellpageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mahindrafirstchoice.com/sell");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"select_your_city_modal\"]/div/div/div/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'SELECT')])[1]")).click();
		 
		driver.findElement(By.xpath("//div[@id=\"ManufacturingYearId_chosen\"]//div[@class=\"chosen-container chosen-container-single chosen-container-active chosen-with-drop\"]/span[contains\'2019\'][1]")).click();

	}

}
