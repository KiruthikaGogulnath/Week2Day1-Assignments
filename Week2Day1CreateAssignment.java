package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1CreateAssignment {
	
	public static void main(String[] args) {
		
		System.out.println("Assignment 1 : Create Lead");

		System.out.println("Setting Driver Environment for chrome browser");
		WebDriverManager.chromedriver().setup();

		System.out.println("Automation testing started");
		ChromeDriver driver = new ChromeDriver();

		System.out.println("Load the url:http://leaftaps.com/opentaps/control/main");
		driver.get("http://leaftaps.com/opentaps/control/login");

		System.out.println("Finding the element for username");
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");

		System.out.println("Finding the element for password");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		System.out.println("Finding the element for Login button");
		WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
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
		elementCompanyName.sendKeys("ABC");

		System.out.println("Finding the element for First name");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Kiruthika");

		System.out.println("Finding the element for Last name");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Gogulnath");
		
		System.out.println("Finding the element for First name Local");
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Kiruthika");
		
		System.out.println("Finding the element for Departmental");
		WebElement elementDepartmental = driver.findElement(By.name("departmentName"));
		elementDepartmental.sendKeys("Developement");
		
		System.out.println("Finding the element for Description");
		WebElement elementDescription = driver.findElement(By.name("description"));
		elementDescription.sendKeys("Just sample description");
		
		System.out.println("Finding the element for state");
		WebElement elementDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(elementDropDown);
		dropdown.selectByVisibleText("Florida");
		
		System.out.println("Finding the element for Create Leads button");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The title is: " + driver.getTitle());
	}

}
