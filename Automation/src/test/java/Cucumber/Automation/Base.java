package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException {

		prop = new Properties();
		FileInputStream Fis = new FileInputStream("C:\\Users\\Harikrishna Reddy M\\git\\CucumberAutomation\\Automation"
				+ "\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(Fis);
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

}
