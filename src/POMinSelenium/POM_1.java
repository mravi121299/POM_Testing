package POMinSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_1 {
	WebDriver driver;
	
public POM_1(WebDriver driver) {
	this.driver=driver;
		
	}
@FindBy(how = How.ID, using="txtUsername")
WebElement UserName;

@FindBy(how = How.ID, using="txtPassword")
WebElement Password;

@FindBy(how = How.XPATH, using="//*[@id=\"btnLogin\"]")
WebElement LoginBtn;
public void LogininHRM(String Uname, String Psd) {
	UserName.sendKeys(Uname);
	Password.sendKeys(Psd);
	LoginBtn.click();
}
}
