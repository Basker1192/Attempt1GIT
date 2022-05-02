package org.stepDefinition;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDefinition{

	static WebDriver driver;
	@Given("User should launch chrome and launch URL and maximize")
	public void user_should_launch_chrome_and_launch_URL_and_maximize() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.libertyclothing.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("User should type special characters in e-mail")
	public void user_should_type_special_characters_in_e_mail() {
	    driver.findElement(By.id("Enter your email")).sendKeys("bazzbasker@gmail.com");
	    
	}

	@When("User should click Subscribe button")
	public void user_should_click_Subscribe_button() {
	    driver.findElement(By.xpath("//icon[@class='footer__newsletter-btn-label']")).click();
	    
	}



	
}
