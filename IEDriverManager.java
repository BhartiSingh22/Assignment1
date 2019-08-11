package com.crm.qa.qa.drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.seleniumdriverfactory.DriverManager;

public class IEDriverManager extends DriverManager
{
@Override

public WebDriver createChromeDriver()
{
return null;
}

@Override
 public WebDriver createIEDriver()
 {
System.setProperty("webdriver.ie.driver","C://SWDTOOLS//Selenium\\bin\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
     return driver;
 }
}
