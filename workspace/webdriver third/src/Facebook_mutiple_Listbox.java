//package com.testingking.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_mutiple_Listbox {
public static  WebDriver driver=null;
	public static String vURL;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
vURL="http://www.facebook.com";
driver=new FirefoxDriver();
driver.navigate().to(vURL);

WebElement Firstname=driver.findElement(By.xpath("//*[@id='u_0_1']"));
Firstname.sendKeys("vivek");

 WebElement listbox=driver.findElement(By.xpath("//*[@id='day']"));
 // Arrays list --                    extract values from drop down
   List<WebElement> dropdown=listbox.findElements(By.tagName("option"));
 
   System.out.println(dropdown.get(0).getText()); // since it is array type object
 System.out.println("Total values from  drop down is -->"+dropdown.size()); /// length of array
 
for(int i=0;i<dropdown.size();i++  )
{
	System.out.println(dropdown.get(i).getText());
}
		
		driver.quit();
	}

}
