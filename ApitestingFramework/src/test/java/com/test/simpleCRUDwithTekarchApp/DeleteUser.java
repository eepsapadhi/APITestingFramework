package com.test.simpleCRUDwithTekarchApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.test.helpers.UserServiceHelper;

public class DeleteUser {
@Test
	public static void delete() throws StreamReadException, DatabindException, IOException {		
		UserServiceHelper.Deleteuser().then().assertThat().statusCode(401);
	}
}
