package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.utility;

public class LoginPage extends utility {
	private By primaryLoginBtn = By.xpath("//li[@class='Login']/a");
	private By usernameText=By.xpath("//form[@name='login-form']/div[2] /input");
	private By searchjobsText = By.xpath("//form[@id='search-jobs']/div");
	private By passwordText=By.xpath("//input[@type='password']");
	private By invalidvaliderrornotificationtext = By.xpath("//div[@class='login-layer']/form/div)[1]");
	public void locatedloginelement() {
		 
	}
	
	
	public void enterurl() {
		driver.get("https://www.naukri.com");	
	}
	
	 public void clickonlogin() { 
     driver.findElement(primaryLoginBtn).click();
	 }
	 public void enteredusername() throws InterruptedException {
	 
	 Thread.sleep(3000);
		driver.findElement( usernameText).sendKeys("arjunreddyabd8660@gmail.com");
		
	 }
	 public void userenteredpassword( ) throws InterruptedException {
		 Thread.sleep(3000);
			driver.findElement(passwordText).sendKeys("Amareswar@1234");
		    
			
	 }
	 
	 public void verifyValidInvalidCred(String status) {

			if(status.equals("pass")) {
				String ExpectedSearcjJobTextv = driver.findElement(searchjobsText).getText();
				Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
				
			}
			else if(status.equals("fail")){
				boolean flag = false;
				String ExpectedInvalidErrortext = driver.findElement(invalidvaliderrornotificationtext).getText();
				if(ExpectedInvalidErrortext.equals("Invalid details. Please check the Email ID - Password combination.")) {
					flag = true;
					Assert.assertTrue("status did not match", flag);
				}
			}
	 }
	 
}
