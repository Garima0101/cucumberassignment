package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCash {
	WebDriver driver;

	public BankCash(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@href='#']//span[contains(text(),'Bank & Cash')]")
	WebElement CLICK_BANKANDCASH;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement CLICK_NEWACCOUNT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement INERNET_BANKING_URL;
	@FindBy(how = How.XPATH, using = "//*[@type='submit' and @class ='btn btn-primary']")
	WebElement CLICK_SUBMIT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement CREATE_ACCOUNT;

	public void gotoBankCash() {
		CLICK_BANKANDCASH.click();
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void gotoNewAccount() {
		CLICK_NEWACCOUNT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void account_Title(String title) {
		ACCOUNT_TITLE.sendKeys(title);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void description(String text) {
		DESCRIPTION.sendKeys(text);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void initial_Balance(String bal) {
		INITIAL_BALANCE.sendKeys(bal);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void accountNumber(String acc_num) {
		ACCOUNT_NUMBER.sendKeys(acc_num);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void contactPerson(String contactPerson) {
		CONTACT_PERSON.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void phone(String phone) {
		PHONE.sendKeys(phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void internetBankingUrl(String url) {
		INERNET_BANKING_URL.sendKeys(url);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clickSubmit() {
		CLICK_SUBMIT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public String pageValidation() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		return CREATE_ACCOUNT.getText();

	}
}
