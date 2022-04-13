package POMinSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome", "https://opensource-demo.orangehrmlive.com/");
		POM_1 loginHRM = PageFactory.initElements(driver, POM_1.class);
		loginHRM.LogininHRM("Admin", "admin123");
	}

}
