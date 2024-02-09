package Com.hrms.testscripts;
import org.testng.annotations.Test;

import Com.hrms.pages.LoginPage;
import Com.hrms.pages.Logoutpage;
import Com.hrms.utility.Baseclass;
public class TC_001 {
	@Test
	public void TC_001() {
	  //Test Steps
	Baseclass.openApplication();
	
	LoginPage.login("nareshit", "nareshit");
	Logoutpage .logout();

	Baseclass.closeApplication();
	}
	}

