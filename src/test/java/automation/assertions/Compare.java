package automation.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.automation.utility.ConfigReader;

public class Compare 
{
   public boolean validatePageURL(WebDriver driver, String expectedURL)
   {
	   boolean result = false;
	 if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
	 {
		 result = true; 	
	 }
	 return result;
   }
   
   public boolean validateElementExistByXpath(WebDriver driver, String xpath)
   {
	   boolean result = false;
	   try 
	   {
		   driver.findElement(By.xpath(xpath));		 
		   result = true;
	   }
	   catch(Exception e)
	   {
		   
	   }
	   return result;
	   
   }
   
   public boolean validatePageTitle(WebDriver driver, String expectedTitle)
   {
	   boolean result = false;
	 if(driver.getTitle().equalsIgnoreCase(ConfigReader.readLocators(expectedTitle)));
	 {
		 result = true; 	
	 }
	 return result;
   }
}

