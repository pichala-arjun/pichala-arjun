package com.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import core.utility;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends utility {
	utility u; 
@Before
	public void callingBrowser() {
		
		u = new utility();
		u.inisiateBrowser();
		
	} 

@After
public void CloseBrowser(Scenario scenario) throws IOException {
	String filePath = null;
	
		System.out.println("nsvigsted to dscejjksdn");
		/*
		 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * String fileName =
		 * System.getProperty("user.dir")+"\\target\\Screenshot\\test.png"; File
		 * CurrentDir = new File(fileName); System.out.println("CurrentDir"+CurrentDir);
		 * FileUtils.copyFile(file,CurrentDir);
		 */
		byte[] x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(x, "image/png", scenario.getName());
		
		//scenario.attach(data, "image/png", "My screenshot");
		 
	
	//Reporter.addScreenCaptureFromPath(fileName);
	driver.quit();
	
}

	}
	


