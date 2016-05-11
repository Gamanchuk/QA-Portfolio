package com.example.tests;

import org.junit.Test;

public class AddGroupTests extends MyTestBase{
	
	@Test
	public void testAddNewGroup() throws Exception {
		GroupData group = new GroupData("newgroup2", "asfasva", "asvasv");
		createGroup(group);
		//verification
	}

	
	
}
