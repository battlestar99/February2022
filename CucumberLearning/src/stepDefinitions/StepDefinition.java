package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	//hooks
	@Before
	public void initializationPart() {
		
	}
	
	@Given("^user is in the login page$")
	public void user_is_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\Feb22-Workspace\\February2022\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^user insert valid standard username$")
	public void user_insert_valid_standard_username() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	    usernameTextbox.sendKeys("standard_user");
	}
	
	@When("^user insert valid problem username$")
	public void user_insert_valid_problem_username() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	    usernameTextbox.sendKeys("problem_user");
	}
	
	@When("^user insert valid lockedout username$")
	public void user_insert_valid_lockedout_username() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	    usernameTextbox.sendKeys("locked_out_user");
	}

	@When("^user insert valid performance glitch username$")
	public void user_insert_valid_performance_glitch_username() throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	    usernameTextbox.sendKeys("performance_glitch_user");
	}
	
	@When("^user insert valid standard \"([^\"]*)\"$")
	public void user_insert_valid_standard(String username) throws Throwable {
		WebElement usernameTextbox = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	    usernameTextbox.sendKeys(username);
	}

	@When("^user insert valid password \"([^\"]*)\"$")
	public void user_insert_valid_password(String password) throws Throwable {
		WebElement passwordTextbox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 passwordTextbox.sendKeys(password);
	}

	@When("^user insert valid password$")
	public void user_insert_valid_password() throws Throwable {
		 WebElement passwordTextbox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 passwordTextbox.sendKeys("secret_sauce");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		 WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		 loginButton.click();
	}

	@Then("^user is on the product page$")
	public void user_is_on_the_product_page() throws Throwable {
	    
	}
	
	//hooks
	@After
	public void closeBrowser() {
//		driver.close();
	}


}
