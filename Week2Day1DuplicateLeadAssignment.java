package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1DuplicateLeadAssignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Setting Driver Environment for chrome browser");
		WebDriverManager.chromedriver().setup();

		System.out.println("Automation testing started");
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println("Launch the url:http://leaftaps.com/opentaps/control/login");
		driver.get("http://leaftaps.com/opentaps/control/login");
		/*
		 * 2. Enter UserName and Password Using Id Locator 
		 * 3. Click on Login Button using Class Locator 
		 * 4. Click on CRM/SFA Link 
		 * 5. Click on Leads Button 
		 * 6. Click on Create Lead 
		 * 7. Enter CompanyName Field Using id Locator 
		 * 8. Enter FirstName Field Using id Locator 
		 * 9. Enter LastName Field Using id Locator 
		 * 10.Enter FirstName(Local) Field Using id Locator 
		 * 11. Enter Department Field Using any Locator of Your Choice 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice 
		 * 14. Select State/Province as NewYork Using Visible Text 
		 * 15. Click on Create Button 
		 * 16. Get the Title of Resulting Page(refer the video) using driver.getTitle() 
		 * 17. Click on Duplicate button 
		 * 18. Clear the CompanyName Field using .clear() And Enter new CompanyName 
		 * 19. Clear the FirstName Field using .clear() And Enter new FirstName 
		 * 20. Click on Create Lead Button 
		 * 21. Get the Title of Resulting Page(refer the video) using driver.getTitle()
		 */
		
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

		System.out.println("Open the Create lead button link");
		driver.findElement(By.linkText("Create Lead")).click();
		
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

		/* 17. Click on Duplicate button 
		 * 18. Clear the CompanyName Field using .clear() And Enter new CompanyName 
		 * 19. Clear the FirstName Field using .clear() And Enter new FirstName 
		 * 20. Click on Create Lead Button 
		 * 21. Get the Title of Resulting Page(refer the video) using driver.getTitle()
		 */
		
		System.out.println("Finding the element for Update Leads button");
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		System.out.println("Clear the Description field");
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		System.out.println("Finding the element for Company name");
		WebElement elementNewCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementNewCompanyName.sendKeys("ABCDEF");
		
		System.out.println("Clear the First name field");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		System.out.println("Finding the element for First name");
		WebElement elementNewFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementNewFirstName.sendKeys("Gunavathi");
		
		System.out.println("Finding the element for Create Leads button");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());

		
	}
}
