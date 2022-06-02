package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class utility {
	public static WebDriver driver;
	
	public void inisiateBrowser() {

System.setProperty(
        "webdriver.chrome.driver",
        "E:\\UX Pack\\chromedriver.exe");
    // Instantiate a ChromeDriver class.
driver = new ChromeDriver();

    
    driver.manage().window().maximize();

	}

}
