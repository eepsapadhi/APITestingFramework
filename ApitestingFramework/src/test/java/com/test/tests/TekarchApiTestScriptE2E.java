package com.test.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.test.simpleCRUDwithTekarchApp.Adduser;
import com.test.simpleCRUDwithTekarchApp.DeleteUser;
import com.test.simpleCRUDwithTekarchApp.GetUser;
import com.test.simpleCRUDwithTekarchApp.LoginToAPI;
import com.test.simpleCRUDwithTekarchApp.UpdateUser;

public class TekarchApiTestScriptE2E {

	
	@Test
	public static void TC01Login() {
		LoginToAPI.Login();
		
	}
	
	@Test
	public static void TC02Getuser() throws StreamReadException, DatabindException, IOException {
		GetUser.get();
	}
	
	@Test
	public static void TC03Add() throws StreamReadException, DatabindException, IOException {
		Adduser.add();
	}
	@Test
	public static void TC04Update() throws StreamReadException, DatabindException, IOException {
		UpdateUser.update();
	}
	@Test
	public static void TC05Delete() throws StreamReadException, DatabindException, IOException {
		DeleteUser.delete();
	}
}
