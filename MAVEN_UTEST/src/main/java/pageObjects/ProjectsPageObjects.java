package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUIs.ProjectsPageUI;

public class ProjectsPageObjects extends AbstractPage
{
	WebDriver driver;

	public ProjectsPageObjects(WebDriver driver)
{
	this.driver = driver;
}
	public void SelectDropdownOS()
{
	waitToElementClickable(driver, ProjectsPageUI.DROPDOWN_OS);
	clickToElement(driver, ProjectsPageUI.DROPDOWN_OS);
	sleepInSecond(1);
}

	public void SelectDropdownCountry()
{
	waitToElementClickable(driver, ProjectsPageUI.DROPDOWN_COUNTRY);
	clickToElement(driver, ProjectsPageUI.DROPDOWN_COUNTRY);
	sleepInSecond(1);
}

	public void sendkeyToTextboxOS(String OS)
{
	waitToElementVisuble(driver, "//input[@placeholder='OS']");
	clickToElement(driver, "//input[@placeholder='OS']");
	sendkeyToElement(driver, "//input[@placeholder='OS']", OS);
}

	public void sendkeyToTextboxCountry(String country)
{
	waitToElementVisuble(driver, "//input[@placeholder='Country']");
	clickToElement(driver, "//input[@placeholder='Country']");
	sendkeyToElement(driver, "//input[@placeholder='Country']", country);
}

	public String getProjectTitle(String projectname)
{
	return getElementText(driver, "//*[contains(@class,'project_title')]");

}

	public void selectItemOSDropdown (String OSType)
{
	waitToElementVisuble(driver, ProjectsPageUI.ITEM_DROPDOWN_OS, OSType);
	clickToElement(driver, ProjectsPageUI.ITEM_DROPDOWN_OS, OSType);
	sleepInSecond(1);
}
	public void selectItemCountryDropdown (String countryName)
{
	waitToElementVisuble(driver, ProjectsPageUI.ITEM_DROPDOWN_COUNTRY, countryName);
	clickToElement(driver, ProjectsPageUI.ITEM_DROPDOWN_COUNTRY, countryName);
	sleepInSecond(1);
}

}


	

