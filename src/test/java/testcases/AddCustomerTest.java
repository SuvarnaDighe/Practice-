package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class AddCustomerTest extends BaseTest {

	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void addCustomer(String firstname, String lastname, String postcode) {
		
		click("addCustomerBtn_XPATH");
		type("firstname_XPATH",firstname);
		type("lastname_XPATH",lastname);
		type("postcode_XPATH",postcode);
		click("addcust_XPATH");
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Customer added successfully"));
		
		alert.accept();
		
		
		
	}
	
}
