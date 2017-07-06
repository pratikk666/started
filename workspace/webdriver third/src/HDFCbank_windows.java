//package com.testingking.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HDFCbank_windows {
	public static  WebDriver driver=null;
	public static String vURL;
	
	public static void main(String[] args) throws InterruptedException {
		vURL="http://www.hdfcbank.com/";
		driver=new FirefoxDriver();
		driver.navigate().to(vURL);
	//	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	Thread.sleep(8000l);	
// Collection Set -- Dynamic Arrays
	Set<String> winids=driver.getWindowHandles();		
	Iterator<String>  iterator=winids.iterator();

	// click on link     Personal Loan EMI Calculator
driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div[1]/div[2]/ul/li[1]/a")).click();
Thread.sleep(8000l);



//===for second window repeat both objects to get infor
// find every open window ids

winids=driver.getWindowHandles();		
iterator=winids.iterator();

String firstwindow=iterator.next();// find main window id
System.out.println("Main window id is  -->"+firstwindow);
String secondwindow=iterator.next();// find main window id
System.out.println("second window id is  -->"+  secondwindow);

driver.switchTo().window(secondwindow);
Thread.sleep(3000l);
 

driver.findElement(By.xpath("html/body/div[1]/div[6]/div[2]/div[4]/div[2]/ul[1]/li[3]/div/a")).click();
 
winids=driver.getWindowHandles();		
iterator=winids.iterator();
String thirdwindow=iterator.next();// find main window id
System.out.println("third second window id is  -->"+  thirdwindow);


driver.switchTo().window(thirdwindow);
Thread.sleep(5000l);


//Closing
// mouse focus on second window
driver.switchTo().window(secondwindow);

driver.close();

	//  take focus on main window and close it
driver.switchTo().window(firstwindow);
driver.close();
	
	
	
	
	
		
		
	}

}
