package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.utility;

public class HomePage extends utility{
	private By searchjobsText = By.xpath("//form[@id='search-jobs']/div");
	private By updateprofileBtn=By.xpath("//div[@class='updateProfile']");
	
	public void userclicksonupdateprofile() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(updateprofileBtn).click();
 }
	public void VerifyUserOnHomePage() {
		 String ExpectedSearcjJobTextv = driver.findElement(searchjobsText).getText();
			Assert.assertEquals(ExpectedSearcjJobTextv, "Search Jobs");
	 }

}
