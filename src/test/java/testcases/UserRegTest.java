package testcases;

import org.testng.annotations.Test;

import utilities.DataUtil;

public class UserRegTest {
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp1")
	public void userRegTest(String firstname,String lastname) {
		System.out.println(firstname+"------"+lastname);
		
	}

}
