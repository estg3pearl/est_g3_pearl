package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
	
	public static HomePageObjects getHomePage(WebDriver driver) {
		return new HomePageObjects(driver);
	}
	
	public static ProjectsPageObjects getProjectsPage(WebDriver driver) {
		return new ProjectsPageObjects(driver);
	}

}
