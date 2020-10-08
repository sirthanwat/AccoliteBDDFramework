package com.web.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.utility.ConfigReader;

public class DriverInstance {

	public static WebDriver driver = null;

	public static void setDriverInstance() {
		if (ConfigReader.readProjectConfiguration("Browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
			driver = new ChromeDriver();
		} else if (ConfigReader.readProjectConfiguration("Browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
			driver = new ChromeDriver();
		} else if (ConfigReader.readProjectConfiguration("Browser").equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver", "driver/iedriver");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(ConfigReader.readProjectConfiguration("ApplicationUrl"));
	}

	public static WebDriver getDriverInstance() {
		if (driver != null)
			return driver;
		else {
			setDriverInstance();
			return driver;
		}
	}

	public static void setDriverInstanceToNull() {
		driver = null;
	}
}
