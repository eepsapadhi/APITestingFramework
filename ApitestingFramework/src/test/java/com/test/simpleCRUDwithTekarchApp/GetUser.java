package com.test.simpleCRUDwithTekarchApp;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.test.helpers.UserServiceHelper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetUser {

	@Test
	public static void get() throws StreamReadException, DatabindException, IOException {

		Response res = UserServiceHelper.getuser();

		ResponseBody body = res.getBody();
		String bodyAsString = body.asString();
		Assert.assertEquals(bodyAsString.contains("TA-3333332"), true, "Response body contains TA-3333332");
	}

}
