package pageObjects;
import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUIs.LogInPageUI;

	public class LogInPageObjects extends AbstractPage  
	{
		WebDriver driver;
		public LogInPageObjects(WebDriver driver) 
		{
			this.driver = driver;
		}	
	
		public void sendKeyToEmail(String email)
		{
			waitToElementClickable(driver, LogInPageUI.USERNAME);
			clickToElement(driver, LogInPageUI.USERNAME);
			sendkeyToElement(driver, LogInPageUI.USERNAME, email);
		}
		public void sendKeyToPassword(String passWord)
		{
			waitToElementClickable(driver, LogInPageUI.PASSWORD);
			clickToElement(driver, LogInPageUI.PASSWORD);
			sendkeyToElement(driver, LogInPageUI.PASSWORD, passWord);
		}
		public void checkToRememberMe()
		{
			waitToElementClickable(driver, LogInPageUI.REMEMBER_ME_CHECKBOX );
			clickToElement(driver, LogInPageUI.REMEMBER_ME_CHECKBOX);
			sleepInSecond(1);
		}
		public void selectForgotPassword()
		{
			waitToElementClickable(driver, LogInPageUI.FORGOT_PASSWORD );
			clickToElement(driver, LogInPageUI.FORGOT_PASSWORD);
			sleepInSecond(1);
		}
		public void clickToButtonSignIn()
		{
			waitToElementClickable(driver, LogInPageUI.SIGN_IN_BUTTON );
			clickToElement(driver, LogInPageUI.SIGN_IN_BUTTON);
		}
		public String getInvalidUsernameOrPasswordMessage() 
		{
			waitToElementVisuble(driver, LogInPageUI.INVALID_USERNAME_PASSWORD_MESSAGE);
			return getElementText(driver, LogInPageUI.INVALID_USERNAME_PASSWORD_MESSAGE);
		}
}
