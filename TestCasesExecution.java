package com.crm.qa.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import com.crm.qa.base.TestBase;

public class TestCasesExecution extends TestBase {
@BeforeTest
public void beforeMethod() {
initialize();
}
@Test
public void openBrowser() throws InterruptedException {
WebDriverWait myWait = new WebDriverWait(driver, 9000);
String baseUrl =”https://www.myntra.com/”;
driver.get(baseUrl);
driver.manage().window().maximize();
Actions action = new Actions(driver);
WebElement element=driver.findElement(By.xpath(“//a[@href=’/shop/women’]”));
action.moveToElement(element).perform();
Thread.sleep(5000);
driver.findElement(By.xpath(“//a[href=’/women-ethnic-dresses’]”)).click();
Thread.sleep(5000);

//TC 2
driver.findElement(By.xpath(“//*[@class=’common-checkboxIndicator’])[1]”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@class=’common-checkboxIndicator’])[2]”)).click();
Thread.sleep(5000);

//TC 3
driver.findElement(By.xpath(“//*[@class=’common-checkboxIndicator’])[10]”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@class=’common-checkboxIndicator’])[11]”)).click();
Thread.sleep(5000);

//TC 4
driver.findElement(By.xpath(“//*[@class=’common-customCheckbox’])[2]”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@class=’common-customCheckbox’])[5]”)).click();
Thread.sleep(5000);

//TC 5
driver.findElement(By.xpath(“(//*[@class=’common-customRadio vertical-filters-label’])[2]”)).click();
Thread.sleep(5000);

//TC 6
WebElement element1=driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[3]//div[1]/div/div/div/picture/img”));
action.moveToElement(element1).perform();
driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[3]/div[3]/span[1]/span”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[3]/div[3]/div[2]/ button[2]”)).click();
Thread.sleep(5000);


//TC 7
driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[1]/section/div[1]/div[2]/ul/li[2]/label/h4”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@class=’common-checkboxIndicator’])[19]”)).click();
Thread.sleep(5000);

//TC 8
WebElement element2=driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[1]/a/div[1]/div”));
action.moveToElement(element2).perform();
driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[1]/div[2]/span[1]/span”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@id=’desktopSearchResults’]/div[2]/section/ul/li[1]/div[3]/div[2]/ button[1]”)).click();
Thread.sleep(5000);

//TC 9
driver.findElement(By.xpath(“//a[@href=’/checkout/cart’]”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@class=’icon-dropdown_down itemComponents-base-dropDown’])[4]”)).click();
Thread.sleep(5000);
driver.findElement(By.xpath(“//*[@id=’4’]”)).click();
Thread.sleep(5000);

//TC 10
driver.findElement(By.xpath(“//*[@class=’button-base-button ‘]”)).click();
Thread.sleep(5000);
@AfterTest
public void afterTest() {
flushReports();
}
}
