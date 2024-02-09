package Com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Com.hrms.utility.Baseclass;

public class Logoutpage extends Baseclass{
	//objects
	static By link_logout = By.linkText("Logout");
	//fun
	public static void logout() {
	driver.findElement(link_logout).click();
	Reporter.log("Logout completed ");
	}
}


