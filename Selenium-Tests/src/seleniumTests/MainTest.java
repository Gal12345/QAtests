package seleniumTests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest {
	public static void main(String[] args) throws InterruptedException {
		try (InputStream input = MainTest.class.getClassLoader().getResourceAsStream("config.properties")) {

			Properties prop = new Properties();

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}

			// load a properties file from class path, inside static method
			prop.load(input);

			// get the property value and print it out

			// System.out.println(prop.getProperty("url"));
			// System.out.println(prop.getProperty("username"));
			// System.out.println(prop.getProperty("password"));
			
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/div/div[1]/div[4]/div/div[1]/form/div[3]/button")).click();
			
			//WebDriverWait wait = new WebDriverWait(driver, 5);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div/div/div/div/div[1]/input"))).click();
			Thread.sleep(5000);
			driver.quit();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
