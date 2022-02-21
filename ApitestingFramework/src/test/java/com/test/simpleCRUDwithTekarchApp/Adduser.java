package com.test.simpleCRUDwithTekarchApp;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.test.helpers.UserServiceHelper;

public class Adduser {
	
	@Test
	public static void add() throws StreamReadException, DatabindException, IOException {		
		UserServiceHelper.addUser().then().assertThat().statusCode(201);
	}

}
