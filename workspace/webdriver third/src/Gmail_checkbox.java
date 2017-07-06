//package com.testingking.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_checkbox {
	public static  WebDriver driver=null;
	public static String vURL;
	public static void main(String[] args) throws InterruptedException {
		vURL="http://www.gmail.com";
		driver=new FirefoxDriver();
		driver.navigate().to(vURL);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

String placeholder=driver.findElement(By.xpath("//*[@id='Email']")).getAttribute("placeholder");
System.out.println("place     holder bvalue is -->"+ placeholder);
driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("joglekar.vivek@gmail.com");

driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("test");
driver.findElement(By.xpath("//*[@id='passwordNext']/div[2]")).click();

List<WebElement>  checkbox=driver.findElements(By.name("PersistentCookie"));

String verifycheck=checkbox.get(0).getAttribute("checked");
System.out.println(" Check box is checked or not -->"+ verifycheck);
Thread.sleep(6000l);


if(checkbox.get(0).getAttribute("checked").equals("true"))
{checkbox.get(0).click();}


//checkbox.get(0).click();
Thread.sleep(6000l);
driver.quit();


		
		

	}

}
