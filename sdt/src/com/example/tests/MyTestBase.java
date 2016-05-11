package com.example.tests;

import org.junit.After;
import org.junit.Before;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
@SuppressWarnings("deprecation")


public class MyTestBase {
	
	protected Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/");
		selenium.start();
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}

	protected void createGroup(GroupData group) {
		openMainPage();
		gotoGroupsPage();
		initGroupCreation();
		fillGroupForm(group);
		submitGroupForm();
		returnToGroupsPage();
	}

	private void returnToGroupsPage() {
		clickAndWait("link=group page");
	}

	private void submitGroupForm() {
		clickAndWait("submit");
	}

	private void fillGroupForm(GroupData group) {
		selenium.type("group_name", group.name);
		selenium.type("group_header", group.header);
		selenium.type("group_footer", group.footer);
	}

	private void initGroupCreation() {
		clickAndWait("new");
	}

	private void gotoGroupsPage() {
		clickAndWait("link=groups");
	}

	private void openMainPage() {
		selenium.open("/addressbookv4.1.4/group.php");
	}

	private void clickAndWait(String locator) {
		selenium.click(locator);
		selenium.waitForPageToLoad("30000");
	}

}
