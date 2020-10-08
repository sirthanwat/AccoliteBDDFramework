package com.web.automation.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {

	   public void clickEnter(WebDriver driver)
	   {
		   try 
		   {
			   Actions act = new Actions(driver);
			   act.sendKeys(Keys.ENTER);
		   }
		   catch(Exception e)
		   {
			   
		   }
		   
	   }
}
