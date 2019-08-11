package com.crm.qa.seleniumdriverfactory;
import com.crm.qa.drivers.ChromeDriverManager;
import com.crm.qa.drivers.ChromeDriverManager;
import com.crm.qa.seleniumdriverfactory.DriverType;

public class DriverManagerFactory {
public static DriverManager getManager(DriverType driverType)
{
DriverManager driverManager = null;
switch(driverType)
{
case CHROME:
  driverManager = new ChromeDriverManager();
break;
case IE:
driverManager = new IEDriverManager();
break;

default:
driverManager = new ChromeDriverManager();
break;
}
return driverManager;
}
