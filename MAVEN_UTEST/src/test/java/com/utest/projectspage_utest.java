package com.utest;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.HomePageObjects;
import pageObjects.PageGeneratorManager;
import pageObjects.ProjectsPageObjects;
import pageUIs.ProjectsPageUI;
import commons.AbstractTest;

public class projectspage_utest extends AbstractTest
{
	private static final String String = null;
	WebDriver driver;
	HomePageObjects homepage;
	ProjectsPageObjects projectspage;
	@Parameters({ "browser"})
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.get("https://www.utest.com/");
	}
	String OSType;
	String countryName;
	
@Test
public void TC_01_Check_Filter()
{
	homepage = PageGeneratorManager.getHomePage(driver);
	log.info("TC_01_Filter - Step 01: Click to Projects button");
	homepage.clickToButtonProjects();
	
	projectspage = PageGeneratorManager.getProjectsPage(driver);
	log.info("TC_01_Filter - Step 02: Select dropwn OS filter");
	projectspage.SelectDropdownOS();
	
	log.info("TC_01_Filter - Step 03: Input into textbox OS filter");
	projectspage.selectItemOSDropdown("iOS");
	
	log.info("TC_01_Filter - Step 04: Select dropwn Country filter");
	projectspage.SelectDropdownCountry();
	
	log.info("TC_01_Filter - Step 05: Input into textbox Country filter");
	projectspage.selectItemCountryDropdown("Slovakia");
	
}

}



