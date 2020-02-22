package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
	WebDriver driver;
	@When("^I open OrangeHRMS URL on \"([^\"]*)\"$")
	public void i_open_OrangeHRMS_URL_on(String brw) throws Throwable {
	   if(brw.equalsIgnoreCase("chrome"))
	   {
		  // System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://orangehrm.qedgetech.com/");
		   driver.manage().window().maximize();
		   
	   }
	   else if(brw.equalsIgnoreCase("Firefox"))
	   {
		   driver=new FirefoxDriver();
		   driver.get("http://orangehrm.qedgetech.com/");
		   driver.manage().window().maximize();
		   
		   
     }
	}

	@When("^I enter \"([^\"]*)\" in UsernameField$")
	public void i_enter_in_UsernameField(String UserName) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(UserName);
	   
	}

	@When("^I enter \"([^\"]*)\" in PasswordField$")
	public void i_enter_in_PasswordField(String Password) throws Throwable {
	    driver.findElement(By.name("txtPassword")).sendKeys(Password);
	}

	@When("^clicking Login Button$")
	public void clicking_Login_Button() throws Throwable {
	   driver.findElement(By.name("Submit")).click();
	}

	@Then("^I should dee Dashboard in URL$")
	public void i_should_dee_Dashboard_in_URL() throws Throwable {
	   if(driver.getCurrentUrl().contains("dash"))
	   {
		   System.out.println("Login Success");
		   
	   }
	   else 
	   {
		   System.out.println("Login Fail");
	   }
	}

	@When("^Closing Browser$")
	public void closing_Browser() throws Throwable {
	   Thread.sleep(3000);
	   driver.close();
	}

}
