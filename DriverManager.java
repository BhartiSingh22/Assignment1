package com.crm.qa.seleniumdriverfactory;
import org.openqa.selenium.WebDriver;
import com.crm.qa.drivers.ChromeDriverManager;
import com.crm.qa.drivers.IEDriverManager;
public abstract class DriverManager   {
public WebDriver driver;
public abstract WebDriver createChromeDriver();
public abstract WebDriver createIEDriver();
public WebDriver getDriver(String browser)
{
if(browser.equalsIgnoreCase(“chrome”))
{
this.driver = new ChromeDriverManager().createChromeDriver();
}
Else
{
this.driver = new IEDriverManager().createIEDriver();
}
return driver;
}

