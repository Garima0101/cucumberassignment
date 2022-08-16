package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ("//*[@id=\"username\"]"))
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = ("//*[@id=\"password\"]"))
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = ("//div[3]/button"))
	WebElement CLICK_SUBMIT_BUTTON;
	@FindBy(how = How.XPATH, using = ("//*[@id=\"page-wrapper\"]/div[2]/div/h2"))
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = ("//title[text()='Login - iBilling']"))
	WebElement LOGINTITLE_ELEMENT;

	public void userName(String uName) {
		USER_NAME_ELEMENT.sendKeys(uName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void password(String pswd) {
		PASSWORD_ELEMENT.sendKeys(pswd);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clickSubmitButton() {
		CLICK_SUBMIT_BUTTON.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void dashboardValidation(String Dashboard) {
		String DASHBOARD_HEADER = DASHBOARD_ELEMENT.getText();
		Assert.assertEquals("Dashboardfailed", Dashboard, DASHBOARD_HEADER);
		System.out.println(DASHBOARD_HEADER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}


}