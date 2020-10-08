package com.web.automation.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.web.automation.base.DriverInstance;
import com.web.automation.pages.HomePagePage;
import com.web.automation.utility.CommonMethods;
import com.web.automation.utility.ConfigReader;

import automation.assertions.Compare;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver=DriverInstance.getDriverInstance();
	HomePagePage homePage = new HomePagePage(driver);
	Compare campare= new Compare();
	CommonMethods comm= new CommonMethods();

	
	@Given("^Open the browser$")
	public void launchBrowser() throws Throwable {
    System.out.println(ConfigReader.readProjectConfiguration("ApplicationUrl"));
    DriverInstance.setDriverInstance();
	}

	@When("^User is navigating google homepage in a browser$")
	public void verifyGooglehomepage() throws Throwable {
		campare.validatePageTitle(driver, "expectedTitle");
	}

	@When("^User will search for ‘Accolite’ text$")
	public void searchAccoliteText() throws Throwable {
		homePage.enterSearchText("searchTxt");
		homePage.clickOnSearchBox();
		comm.clickEnter(driver);		
	}

	@Then("^User will count the number of links ‘Accolite’ returned on the results page$")
	public void verifyAcoliteLinkCount() throws Throwable {
		homePage.verifyResultLinkSearch();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		 DriverInstance.getDriverInstance().close();
	}
	
	@Then("^User will return the number of links ‘Accolite’ returned on the results page$")
	public void verifyAcoliteReturnLinkCount() throws Throwable {
		homePage.clickOnSearchText("searchTxt");
		homePage.pageLinkTextCount(driver, "searchTxt");
	}
	
	@Then("^User will print the linktext of the 5th link displayed related to Accolite  Search$")
	public void verify5tNlink() throws Throwable {
		homePage.clickOnSearchText("searchTxt");
		homePage.clickOn5thLink();
	}
}
