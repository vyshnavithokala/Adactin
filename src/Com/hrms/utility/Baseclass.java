package Com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Baseclass {
	// driver
	public static WebDriver driver;
	//open app
	public static void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opened "); //html report
	}
	//close app
	public static void closeApplication() {
	driver.close();
	Reporter.log("Application closed ");
	}
	}

