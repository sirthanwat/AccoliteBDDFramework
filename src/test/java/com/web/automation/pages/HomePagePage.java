package com.web.automation.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.web.automation.utility.ConfigReader;

public class HomePagePage {

	public HomePagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	@CacheLookup
	WebElement googleTextbox;

	@FindBy(xpath = "//ul[@role='listbox']/li")
	@CacheLookup
	List<WebElement> linkTexts;

	@FindBy(xpath = "//a[contains(.,'Accolite')]")
	@CacheLookup
	List<WebElement> text;

	public void enterSearchText(String txt) {
		googleTextbox.sendKeys(ConfigReader.readLocators(txt));
	}

	public void clickOnSearchBox() {
		googleTextbox.click();
	}

	public void verifyResultLinkSearch() {
		List<WebElement> list = linkTexts;
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String linkTxts = list.get(i).getText();
			System.out.println("Link display in result search :" + linkTxts);
		}
	}

	public void clickOnSearchText(String txt) {
		List<WebElement> list = linkTexts;
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String linkTxts = list.get(i).getText();
			System.out.println("Link display in result search :" + linkTxts);
			if (linkTxts.equalsIgnoreCase(ConfigReader.readLocators(txt)))
				list.get(i).click();
		}
	}

	public void pageLinkTextCount(WebDriver driver, String txt) {
		List<WebElement> links = text;
		System.out.println("Total links are " + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String actText = ele.getAttribute("href");
			if (actText.contains(txt))
				System.out.println("number of links ‘Accolite’ returned on the results page :" + i);

		}
	}

	public void clickOn5thLink() {
		List<WebElement> list = linkTexts;
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String linkTxts = list.get(i).getText();
			System.out.println("Link display in result search :" + linkTxts);
			if (i == 4)
				list.get(i).click();
		}
	}

}
