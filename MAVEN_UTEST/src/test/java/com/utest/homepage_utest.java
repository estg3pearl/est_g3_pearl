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
import pageUIs.HomePageUI;
import commons.AbstractTest;

public class homepage_utest extends AbstractTest
{
	private static final String String = null;
	WebDriver driver;
	HomePageObjects homepage;
	
	@Parameters({ "browser"})
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.get("https://www.utest.com/");
	}
@Test
public void TC_01_Check_Enter_ProjectsPage()
{
	homepage = PageGeneratorManager.getHomePage(driver);
	log.info("TC_01_HomePage - Step 01: Click to Projects");
	homepage.clickToButtonProjects();
}

}
