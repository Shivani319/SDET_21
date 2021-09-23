package com.comcast.orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="smoke")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	@Test(groups="regression")
	public void OrgWithContactTest() {
		System.out.println("execute createOrgwithContactTest");
	}
	@Test(groups="regression")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest");
	}


}
