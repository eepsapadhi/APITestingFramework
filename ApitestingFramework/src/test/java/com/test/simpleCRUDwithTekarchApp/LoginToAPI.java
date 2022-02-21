package com.test.simpleCRUDwithTekarchApp;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.helpers.UserServiceHelper;

public class LoginToAPI {
	

	@Test
	public static void Login() {
		UserServiceHelper.LogintoApp().then().assertThat().statusCode(201);
	}
}
