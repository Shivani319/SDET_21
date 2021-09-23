package com.comcast.createcontact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smoke")
	public void createContactTest() {
		System.out.println("execute createContactTest");
	}
	@Test(groups="regression")
	public void createContactWithOrgTest() {
		System.out.println("execute createContactWithOrgTest");
	}
	@Test(groups="regression")
	public void deleteContactTest() {
		System.out.println("execute deleteTest");
	}

}
