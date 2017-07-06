//package com.testingking.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_examples {
public static WebDriver d;
	public static void main(String[] args) {
		try{
			 d= new FirefoxDriver();
			d.get("http://toolsqa.com/iframe-practice-page/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// swicth to first iframe
			Thread.sleep(5000l);
			d.switchTo().frame("iframe1");
			
	d.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("vivek");		
			
			//d.findElement(By.xpath("//*[@id='photo']")).click();		
			d.findElement(By.xpath("//*[@id='photo']")).sendKeys("D:\\hrprog.png");
			
			Thread.sleep(5000l);
			d.findElement(By.xpath("//*[@id='submit']")).click();
			
			//*[@id='submit']
	}catch(Exception e)
		{
		System.out.println(e);
		}

}
}
