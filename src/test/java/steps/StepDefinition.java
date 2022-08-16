package steps;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BankCash;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {

	LoginPage login;
	BankCash bankcash;

	@Before
	public void method() {
		initmethod();
		login = PageFactory.initElements(driver, LoginPage.class);
		bankcash = PageFactory.initElements(driver, BankCash.class);
	}

	@Given("^User should be in login page$")
	public void user_should_be_in_login_page() {

		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^user enters correct username \"([^\"]*)\"$")
	public void user_enters_correct_username(String Uname) {
		login.userName(Uname);
	}

	@When("^user enters correct password \"([^\"]*)\"$")
	public void user_enters_correct_password(String pswd) {
		login.password(pswd);
	}

	@When("^user click the submit button$")
	public void user_click_the_submit_button() {
		login.clickSubmitButton();
	}

	@Then("^user landed to the Dashboard page$")
	public void user_landed_to_the_Dashboard_page() {
        login.dashboardValidation("Dashboard");
	}
	@When("^User should click Bank&Cash$")
	public void user_clicks_Bank_Cash()  {
	    bankcash.gotoBankCash();
	}

	@When("^User should click New Account$")
	public void user_clicks_New_Account()  {
	    bankcash.gotoNewAccount();
	}
	

	@Then("^User should fill Account Title \"([^\"]*)\"$")
	public void user_should_fill_Account_Title(String Account_Title) {
		bankcash.account_Title(Account_Title + generateRandomString() );
	}
	@Then("^User should fill Description \"([^\"]*)\"$")
	public void user_should_fill_Description(String Description) {
		bankcash.description(Description +generateRandomString());
	}
	@Then("^User should fill Inital Balance \"([^\"]*)\"$")
	public void user_should_fill_Inital_Balance(String Inital_Balance) {
		bankcash.initial_Balance(Inital_Balance);
	}
	@Then("^User should fill Account Number \"([^\"]*)\"$")
	public void user_should_fill_Account_Number(String Account_Number) {
		bankcash.accountNumber(Account_Number +generateRandomString());
	}
	@Then("^User should fill Contact Person \"([^\"]*)\"$")
	public void user_should_fill_Contact_Person(String Contact_Person) {
		bankcash.contactPerson(Contact_Person +generateRandomString());
	}
	@Then("^User should fill Phone Number \"([^\"]*)\"$")
	public void user_should_fill_PhoneNumber(String Phone_Number) {
		bankcash.phone(Phone_Number +generateRandomNumber());
	}
	@Then("^User should fill Internet Banking Url \"([^\"]*)\"$")
	public void user_should_fill(String Internet_banking_Url) {
		bankcash.internetBankingUrl(generateRandomString()+Internet_banking_Url);
	}

	@When("^User should click Submit$")
	public void user_should_click_Submit() {
		bankcash.clickSubmit();
	}

	@Then("^User land to the Accounts page$")
	public void user_land_to_the_Accounts_page() {
		String Expected = "Account Created Successfully" ;
		String Actual = bankcash.pageValidation() ;
		System.out.println(Actual.replaceAll("[^a-zA-Z ]+", "").trim());
		Assert.assertEquals("Validation Failed", Expected, Actual.replaceAll("[^a-zA-Z ]+", "").trim());
	}

	@After
	public void tearDown () {
		driver.close();
		driver.quit();
		
	}


}
