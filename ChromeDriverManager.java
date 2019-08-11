package org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.crm.qa.seleniumdriverfactory.DriverManager;

public class ChromeDriverManager extends DriverManager
{

@Override
public WebDriver createChromeDriver()
{
System.setProperty("webdriver.chrome.driver","C://SWDTOOLS//Chrome Driver//chromedriver.exe");
WebDriver driver=new ChromeDriver();
ChromeOptions options=new ChromeOptions();
options.addArguments("disable-notifications");
return driver;
}

@Override
 public WebDriver createIEDriver()
 {
 //TODO Auto-generated method stub
     return null;
 }
}
