package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginStepDefintions {

	WebDriver driver;
	
	
	@Given("^user on home page$")
	public void user_on_home_page()
	{
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	@When("^home page title google$")
	public void home_page_title_googles()
	{
		String homepageTitle=driver.getTitle();
		Assert.assertEquals(homepageTitle, "Google");
	}
	
	@Then("^user enter username and password$")
	public void user_enter_username_and_password()
	{
		WebElement searchBar=driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
		WebElement searchBtn=driver.findElement(By.cssSelector("input[class='gNO89b']"));
		searchBar.click();
		searchBar.clear();
		searchBar.sendKeys("google");
		searchBar.sendKeys(Keys.ENTER);
		
	}
	
	@Then("^user navigate user account page$")
	public void user_navigate_user_account_pages()
	{
		String searchPageTitle=driver.getTitle();
		
	}
	
	
}
