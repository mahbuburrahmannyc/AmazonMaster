package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.PageFactory;

//import com.pagefactory.AmazonPagefactory;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver =new ChromeDriver();
		//pf=PageFactory.initElements(driver, AmazonPagefactory.class);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//drop down menu handle with select class.
		Select drop=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
        List<WebElement> drop1=drop.getOptions();
        System.out.println(drop1.size());//size of drop down menu
        for(int i =0; i<drop1.size();i++) {// print our all the item of the menu
        	
        	System.out.println(drop1.get(i).getText());
        }
        drop.selectByVisibleText("Baby");
        WebElement drop2= drop.getFirstSelectedOption();
        System.out.println(drop2.getText());
        
        Actions action=new Actions(driver);//for Mouse Hover
    	WebElement element=driver.findElement(By.xpath("(//*[contains(text(),'Account & Lists')])[1]"));
	    action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"))).click().build().perform();
 
	}

}
