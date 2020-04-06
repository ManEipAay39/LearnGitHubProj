package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
  public WebDriver driver;
  public FileInputStream file_obj;
  public Workbook workbook_obj;
  public Sheet sheet_obj;
  
 //Method Name : launchApp
 //Description : To Launch Application
 //Author      : Manas Mohanty
 //Reviewed By : Kishore Kumar
 //Arguments   : String url, String sspath
 //************************************************************
  public void launchApp (String url, String sspath)throws Exception{
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\manas\\Desktop\\WD\\jar\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File(sspath));}
  //*************************************************************************************
   
  //Method Name : closeApp
  //Description : To Close Application
  //Author      : Manas Mohanty
  //Reviewed By : Kishore Kumar
  //************************************************************
  public void closeApp(){
	  driver.close();}
  //********************************************************************
  
  //Method Name : elementAvailable
  //Description : To verify WebEelement Available
  //Author      : Manas Mohanty
  //Reviewed By : Kishore Kumar
  //Arguments   : String locator, boolean exp String sspath
  //******************************************************************
  public void elementAvailable(WebElement element, boolean exp, String sspath)throws Exception{
	  boolean element_Available=element.isDisplayed();
	  if(element_Available==exp)
	  {
		  System.out.println("Pass");
		  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File((sspath)));
		  	  }
	  else
	  {
		  System.out.println("Fail");
		  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File((sspath)));
	  }
  } 
   
	//********************************************************************
  
	//Method Name : excelCon
	//Description : To connect Excel File for dataDriven Testing
	//Author      : Manas Mohanty
	//Reviewed By : Kishore Kumar
	//Arguments   : String filepath, String sname
  //**********************************************************************
  public void excelCon(String filepath, String sname)throws Exception{
	  file_obj=new FileInputStream(filepath);
	  workbook_obj=Workbook.getWorkbook(file_obj);
	  sheet_obj=workbook_obj.getSheet(sname);
	  
  }
  //******************************************************************************
    //Method Name : elementEnabled 
	//Description : To verifying WebElement Enabled
	//Author      : Manas Mohanty
	//Reviewed By : Kishore Kumar
	//Arguments   : WebElement element, boolean exp, String sspath
    //*******************************************************************
  public void elementEnabled(WebElement element, boolean exp, String sspath)throws Exception{
	  boolean element_Enabled=element.isEnabled();
	  if(element_Enabled==exp)
	  {
		  System.out.println("Pass");
		  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File((sspath)));
		  	  }
	  else
	  {
		  System.out.println("Fail");
		  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File((sspath)));
	  }
  } 
//************************************************************************************
  
    //Method Name : titleContains 
	//Description : To verifying Title Contains
	//Author      : Manas Mohanty
	//Reviewed By : Kishore Kumar
	//Arguments   : String expvalue, boolean exp, String sspath
  //*******************************************************************
  public void titleContains(String expvalue, boolean exp, String sspath) throws Exception{
	  String title=driver.getTitle();
	  if(title.contains(expvalue)==exp)
	  {
		  System.out.println("Pass");
	  File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File((sspath)));
           }
	  else
	  { 
		  System.out.println("Fail");
	      File f=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(f, new File((sspath)));
  }
}
//******************************************************************  
}
