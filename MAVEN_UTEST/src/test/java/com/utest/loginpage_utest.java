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
import pageObjects.LogInPageObjects;
import pageObjects.PageGeneratorManager;
import pageUIs.HomePageUI;
import pageUIs.LogInPageUI;
import commons.AbstractTest;

public class loginpage_utest extends AbstractTest
{
	private static final String String = null;
	WebDriver driver;
	HomePageObjects homepage;
	LogInPageObjects loginpage;
	@Parameters({ "browser"})
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		driver.get("https://www.utest.com/");
	}
@Test
public void TC_01_Check_Enter_LogInPage()
{
	homepage = PageGeneratorManager.getHomePage(driver);
	log.info("TC_01_Login - Step 01: Click to Log In button from Home page");
	homepage.clickToButtonLogIn();
	
	loginpage = PageGeneratorManager.getLogInPage(driver);
	log.info("TC_01_Login - Step 02: Enter email");
	loginpage.sendKeyToEmail("ngocleedng@gmail.com");
	
	log.info("TC_01_Login - Step 03: Enter password");
	loginpage.sendKeyToPassword("Eb$co2023@");
	
	log.info("TC_01_Login - Step 04: Check Remember me");
	loginpage.checkToRememberMe();
	
	log.info("TC_01_Login - Step 05: Click button Sign in");
	loginpage.clickToButtonSignIn();
	
	log.info("TC_01_Login - Checkpoint: Check message 'Invalid username or password.'");
	verifyTrue(loginpage.getInvalidUsernameOrPasswordMessage().contains("Invalid username or password."));
}
}
