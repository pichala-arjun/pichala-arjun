package Pages;

import org.openqa.selenium.By;

import core.utility;

public class EditProfilePage extends utility{
	private By useruplodetheresume=By.xpath("//input[@id='attachCV']");
	
	 public void usersubmitstheresume() {
		 driver.findElement(useruplodetheresume).sendKeys("C:\\Users\\cyb er\\Desktop\\ARJUN RESUME.docx");
	 }
}
