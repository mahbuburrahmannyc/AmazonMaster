 package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pagefactory.AmazonPagefactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDef {
	
	    WebDriver driver;
	    AmazonPagefactory pf;
	    
	    
	    
	@Given("^User on Amazon Home page$")
	public void user_on_Amazon_Home_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver =new ChromeDriver();
		pf=PageFactory.initElements(driver, AmazonPagefactory.class);
		driver.manage().window().maximize();
		driver.get(pf.getUrl());
	}

	@When("^User click sign in$")
	public void user_click_sign_in() throws Throwable {
	    pf.getSignIn().click();
	}

	@When("^User enter UserName$")
	public void user_enter_UserName() throws Throwable {
	   pf.getEmail().sendKeys(pf.getUsername());
	}

	@When("^User enter Password$")
	public void user_enter_Password() throws Throwable {
	   pf.getPassword().sendKeys(pf.getPass());
	}

	@When("^User Click signIn Button$")
	public void user_Click_signIn_Button() throws Throwable {
	   pf.getClickButton().click();
	
	}

	@Then("^User Successfully LogIn$")
	public void user_Successfully_LogIn() throws Throwable {
	  Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
	}


}
