package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public static void initmethod() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static String generateRandomString() {
		String rand_string = RandomStringUtils.randomAlphanumeric(4);
		return rand_string;

	}

	public static Integer generateRandomNumber() {
		// creating an instance of Random class
		Random rand = new Random();
		// Generating random integers in range 0 to 999
		int rand_number = rand.nextInt(999);
		return rand_number;

	}

}
