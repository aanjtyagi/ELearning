package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	// for TC005 Register
	
	@FindBy(id="username")
	private WebElement UserName; 
	
	@FindBy (linkText="Sign up!")
	private WebElement SignUpBtn;
	
	@FindBy (xpath="//p[text()='Teach courses']")
	private WebElement ClickOnTeacherIcon;
	
	@FindBy (id="registration_firstname")
	private WebElement FirstName;
	
	@FindBy (id="registration_lastname")
	private WebElement LastName;
	
	@FindBy (id = "registration_email")
	private WebElement RegEmail;
	
	@FindBy(id="pass1")
	private WebElement password1;
	
	@FindBy(id="pass2")
	private WebElement password2;
	
	@FindBy(id="registration_phone")
	private WebElement RegPhone;
	
	@FindBy (id="registration_official_code")
	private WebElement RegOfficialCode;
	
	@FindBy (id="extra_skype")
	private WebElement skypeID;
	
	@FindBy (id="extra_linkedin_url")
	private WebElement linkedinURL;
	
	@FindBy (id="registration_submit")
	private WebElement RegSubBtn;
	
	// For TC005 Login
	
	@FindBy (id="login")
	private WebElement UserNm;
	
	@FindBy (id="password")
	private WebElement psswd;
	
	@FindBy (id="form-login_submitAuth")
	private WebElement LoginBtn;
	
	
	// for TC004 Forgot Password
	
	@FindBy (linkText="I lost my password")
	private WebElement ClickURL;
	
	@FindBy (id="lost_password_user")
	private WebElement lostPswdUserName;
	
	@FindBy (id="lost_password_submit")
	private WebElement sendMsgBtn;
	// for TC005 Register
	
	public void clickSignUpBtn(){
		this.SignUpBtn.click();
		
	}
	
	public void clickTeacherCourse(){
		this.ClickOnTeacherIcon.click();
	}
	public void first_name(String FirstName){
		this.FirstName.clear();
		this.FirstName.sendKeys(FirstName);
		
	}
	
	public void last_name(String LastName){
		this.LastName.clear();
		this.LastName.sendKeys(LastName);
	}
	
	public void reg_email(String RegEmail){
		this.RegEmail.clear();
		this.RegEmail.sendKeys(RegEmail);
	}
	public void sendUserName(String UserName) {
		this.UserName.clear();
		this.UserName.sendKeys(UserName);
	}
	
	public void sendPassword1(String password1) {
		this.password1.clear(); 
		this.password1.sendKeys(password1); 
	}
	public void sendPassword2(String password2) {
		this.password2.clear(); 
		this.password2.sendKeys(password2); 
	}
	
	public void sendRegistration_phone(){
		this.RegPhone.clear();
		this.RegPhone.sendKeys("9917141998");
		
	}
	
	public void sendRegistration_official_code(){
		this.RegOfficialCode.clear();
		this.RegOfficialCode.sendKeys("250001")
;
	}
	
	public void sendSkype_ID(String skypeID){
		this.skypeID.clear();
		this.skypeID.sendKeys(skypeID);
	}
	
	public void sendLinkend_url(String linkedinURL){
		this.linkedinURL.clear();
		this.linkedinURL.sendKeys(linkedinURL);
	}
	public void clickRegSubBtn(){
		this.RegSubBtn.click();
	}
	
	// for TC005 login
	
	public void enterUserName(String UserNm){
		this.UserNm.clear();
		this.UserNm.sendKeys(UserNm);
	}
	
	public void enterPsswd(String psswd){
		this.psswd.clear();
		this.psswd.sendKeys(psswd);
	}
	
	public void clickLoginBtn(){
		this.LoginBtn.click();
	}
	
	// for TC004 Forgot Password
	
	public void clickForgotPassword(){
		this.ClickURL.click();
	}
	
	public void sendLostPaswduserName(String lostPswdUserName){
		this.lostPswdUserName.clear();
		this.lostPswdUserName.sendKeys(lostPswdUserName);
	}
	
	public void clickSendMsgBtn(){
		this.sendMsgBtn.click();
	}
}
