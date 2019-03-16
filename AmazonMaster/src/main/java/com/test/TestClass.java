package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./AmazonMaster/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
	}

}
