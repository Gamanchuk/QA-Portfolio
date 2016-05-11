package com.example.tests;

import org.junit.Test;

public class AddEmptyGroupTests extends MyTestBase{
		
	@Test
	public void testAddNewEmptyGroup() throws Exception {
		GroupData group = new GroupData("", "", "");
		createGroup(group);
		//verification
	}
	
}