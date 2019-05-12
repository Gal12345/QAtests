package com.cucumber.Selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "http://facebook.com/";

	public void createDriver() throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(baseURL);

		waitVar = new WebDriverWait(driver, 20);
	}

	public void teardown() {
		driver.quit();
	}

	public void ishomepageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgot account?")));
		
	}

	public void clickLink() {
		driver.findElement(By.linkText("Forgot account?")).click();
	}

	public void enterAccount() {
		driver.findElement(By.id("identify_email")).sendKeys("galena_dimeska@yahoo.com");
		driver.findElement(By.name("did_submit")).click();
	}

}