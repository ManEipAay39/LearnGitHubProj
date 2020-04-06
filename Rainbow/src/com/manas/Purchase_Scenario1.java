package com.manas;

import org.openqa.selenium.support.PageFactory;

import com.qshore.Methods;
import com.qshore.PO_LoginPage;

public class Purchase_Scenario1{
	
//Test Name : Purchase_Login
//Test Script Name: Puchase_Login
//Auther          : Manas Mohanty
//Reviewed By     : Kishore Kumar
//Scenario        : Scenario1
//Module Name     : Purchase Module
//Project Name    : Qshore Motor
//************************************************
public void Purchase_Login() throws Exception {
	
//import Methods Class
	
Methods methods_Obj=new Methods();

//Import excelCon Method

methods_Obj.excelCon("C:\\Users\\manas\\Desktop\\Framework\\Test Data\\Manas\\Purchase\\Scenario1\\TestData.xls","Sheet1");
  
//Launch Application

methods_Obj.launchApp(methods_Obj.sheet_obj.getCell(0,0).getContents(), "C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\LaunchApp.png");
   
//Initialize Page Objects into Driver

PO_LoginPage LoginPage=PageFactory.initElements(methods_Obj.driver, PO_LoginPage.class);

//Verifying UID and PWD available or not

methods_Obj.elementAvailable(LoginPage.LoginPage_UID, true, "C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\UIDAvailable.png");
methods_Obj.elementAvailable(LoginPage.Loginpage_PW, true, "C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\PWAvailable.png");

methods_Obj.elementEnabled(LoginPage.LoginPage_UID, true, "C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\UIDEnabled.png");
methods_Obj.elementEnabled(LoginPage.Loginpage_PW, true, "C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\PWEnabled.png");

//Verifying Title Contains
 
methods_Obj.titleContains("Qshore Motors", true,"C:\\Users\\manas\\Desktop\\Framework\\Test Results\\Manas\\Purchase\\Scenario1\\TitleContains.png");
}
//******************************************************************************************************


}
