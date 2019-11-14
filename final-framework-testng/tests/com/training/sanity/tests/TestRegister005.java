package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TestRegister005 {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	} 
	@Test
	public void register() {
		
		loginPOM.clickSignUpBtn();
		loginPOM.clickTeacherCourse();
		loginPOM.first_name("Anjali");
		loginPOM.last_name("Tyagi");
		loginPOM.reg_email("aanjali@gmail.com");
		loginPOM.sendUserName("anjali");
		loginPOM.sendPassword1("Reva@123");
		loginPOM.sendPassword2("Reva@123");
		loginPOM.sendRegistration_phone();
		loginPOM.sendRegistration_official_code();
		loginPOM.sendSkype_ID("skype@123");
		loginPOM.sendLinkend_url("https://in.linkedin.com/");
		loginPOM.clickRegSubBtn();	
		screenShot.captureScreenShot("First");
		
		
	}
}
