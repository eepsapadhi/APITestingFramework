package com.test.simpleCRUDwithTekarchApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.test.helpers.UserServiceHelper;

public class UpdateUser {
	@Test
	public static void update() throws StreamReadException, DatabindException, IOException {		
		UserServiceHelper.getupdate().then().assertThat().statusCode(200);
	}

}
