package com.seleniumpractice.first;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.seleniumpractice.first.SetTestName;
public class SelePract
{
	//@SetTestName(idx=0)
	 @Test(dataProvider="rawDP")
	public void demoPrint(String search) throws InterruptedException
    {
		System.out.println("Welcome to selenium first project");
		WebDriver driver= new ChromeDriver();
		System.out.println("Chrome initialized");
		driver.get("https://www.google.com");
	
		//driver.findElement(By.xpath("//input[@id='q']")).sendKeys(search);
		Thread.sleep(1000);
		System.out.println("search string "+search);
		driver.close();
		
	}
    @DataProvider(name="rawDP")
    public Object[][] sampleDataProvider()
    {
     Object[][] rawData = {
       
       {"SCENARIO_1"},
       {"SCENARIO_2"},
       {"SCENARIO_3"}
     };
      
     return rawData;
    }
    
}
