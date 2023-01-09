package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.HomePageUI;

public class HomePageObjects extends AbstractPage  
{
	WebDriver driver;
	public HomePageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void clickToButtonProjects() {
		waitToElementClickable(driver, HomePageUI.PROJECTS);
		clickToElement(driver, HomePageUI.PROJECTS);
		sleepInSecond(1);
	}
	public void clickToButtonWhyUTest() {
		waitToElementClickable(driver, HomePageUI.WHY_UTEST);
		clickToElement(driver, HomePageUI.WHY_UTEST);
		sleepInSecond(1);
	}
	public void clickToButtonAboutUs() {
		waitToElementClickable(driver, HomePageUI.ABOUT_US);
		clickToElement(driver, HomePageUI.ABOUT_US);
		sleepInSecond(1);
	}
	public void clickToButtonLogIn() {
		waitToElementClickable(driver, HomePageUI.LOG_IN);
		clickToElement(driver, HomePageUI.LOG_IN);
		sleepInSecond(1);
	}
	public void clickToButtonJoinToday() {
		waitToElementClickable(driver, HomePageUI.JOIN_TODAY);
		clickToElement(driver, HomePageUI.JOIN_TODAY);
		sleepInSecond(1);
	}
	public void clickToButtonBecomeAUtester() {
		waitToElementClickable(driver, HomePageUI.BECOME_A_UTESTER);
		clickToElement(driver, HomePageUI.BECOME_A_UTESTER);
		sleepInSecond(1);
	}
}
