package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1ClassroomExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Automation testing started");

		System.out.println("Setting Driver Environment for chrome browser");
		// System.setProperty("WebDriver.chrome.driver",
		// "D:\\firstSelenium\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		System.out.println("Automation testing started");
		ChromeDriver driver = new ChromeDriver();

		System.out.println("Load the url:http://leaftaps.com/opentaps/control/main");
		driver.get("http://leaftaps.com/opentaps/control/main");

		System.out.println("Maximizing the opened browser");
		driver.manage().window().maximize();

		System.out.println("Finding the element for username");
		WebElement elementUsername = driver.findElement(By.id("username"));
		System.out.println("Entering the username as Demosalesmanager");
		elementUsername.sendKeys("Demosalesmanager");

		System.out.println("Finding the element for password");
		WebElement elementPassword = driver.findElement(By.id("password"));
		System.out.println("Entering the password as crmsfa");
		elementPassword.sendKeys("crmsfa");

		System.out.println("Finding the element for Login button");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		System.out.println("Click the Login button");
		elementLoginButton.click();

		System.out.println("Finding the element for CRMSFA Link");
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		System.out.println("Finding the element for Leads Link");
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		System.out.println("Finding the element for Create Leads Link");
		WebElement elementCreateLeads = driver.findElement(By.linkText("Create Lead"));
		elementCreateLeads.click();

		System.out.println("Finding the element for Company name");
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		System.out.println("Entering the Company name as ABC");
		elementCompanyName.sendKeys("ABC");

		System.out.println("Finding the element for First name");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		System.out.println("Entering the Company name as Kiruthika");
		elementFirstName.sendKeys("Kiruthika");

		System.out.println("Finding the element for Last name");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		System.out.println("Entering the Company name as Gogulnath");
		elementLastName.sendKeys("Gogulnath");

		System.out.println("Finding the element for Create Leads button");
		WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadButton.click();
		
	}

}
