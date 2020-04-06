package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_LoginPage {
	
	
 //Page Name        : LoginPage
 //Module Name      : Purchase
 //Application Name : QshoreMotors
 //Author           : Manas Mohanty
 //Date Created     : 03222020
 //Reviewed By      :Kishore Kumar
//*****************************************************************
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtUserId']") WebElement LoginPage_UID;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtPassword']") WebElement Loginpage_PW;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_btnLogin']") WebElement LoginPage_SignIn;
	
}
