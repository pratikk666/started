//package com.testingking.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_mutiple_Radiobuttons {
public static  WebDriver driver=null;
	public static String vURL;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
vURL="http://www.facebook.com";
driver=new FirefoxDriver();
driver.navigate().to(vURL);

driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("vivek");
// or
WebElement Firstname=driver.findElement(By.xpath("//*[@id='u_0_1']"));
Firstname.sendKeys("vivek");
// Array list  
List<WebElement> radio=driver.findElements(By.name("sex"));
	System.out.println(radio.get(0).getAttribute("checked"));

	System.out.println(radio.get(0).getAttribute("value"));
radio.get(0).click();
System.out.println(radio.get(0).getAttribute("checked"));
System.out.println(radio.get(0).getAttribute("value"));

radio.get(1).click();

driver.quit();

}
}