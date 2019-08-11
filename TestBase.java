package com.crm.qa.base;
import java.util.concurrent.TimeUnit;
import org.openqa.seleniumWebDriver;
import org,openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openga.selenium.support.ui.WebDriverWait;
import com.crm.qa.config.ConfigReader;
import com.crm.qa.seleniumdriverfactory.DriverManager;
import com.crm.qa.seleniumdriverfactory.DriverManagerFactory;
import com.crm.qa.seleniumdriverfactory.DriverType;

public class TestBase {
                    protected static DriverManager drivermanager;
                    protected static  WebDriver driver;
                    protected static ConfigReader cReader;
public static void initialize()
{
driverManager = DriverManagerFactory.getManager(DriverType.valueOf(cReader.getDriverType()));
driver= driverManager.getDriver(cReader.getDriverType());
driver.manage().window.maximize();
driver.manage().deleteAllCookies();
}
Public TestBase()
{
cReader = new ConfigReader();
}
