package com.gsk.TestScripts;

import org.testng.annotations.Test;

import com.gsk.components.OrangeHrmLoginComponents;
import com.gsk.utility.BaseClass;
public class OrangeHRMTestScripts extends BaseClass {
	
	OrangeHrmLoginComponents components = new OrangeHrmLoginComponents();
	
	@Test(description = "Login The OrangaHRM Application")
	public void login() throws Exception {
		
		readData.readTestDataFile("C:\\Users\\usser\\Desktop\\OrangeHRM\\TestDataOrangeHRMTestData.xlsx", "1");
	
		components.launchApp();
	
		components.login();
		
	}

}
