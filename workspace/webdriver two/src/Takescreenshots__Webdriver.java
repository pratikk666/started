

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Takescreenshots__Webdriver {

	public static WebDriver d=null;
	static String vURL,vEmail,vPassword;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			 d=new FirefoxDriver();
		vURL="http://www.gmail.com";
		vEmail="joglekar.vivek@gmail.com";
		vPassword="testing";
			d.navigate().to(vURL);
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.id("Email")).sendKeys(vEmail);		
	d.findElement(By.id("Emailaa")).sendKeys(Keys.ENTER);
	
	d.findElement(By.id("Passwd")).sendKeys(vPassword);		
	d.findElement(By.id("Passwd")).sendKeys(Keys.ENTER);	
	
String text=d.findElement(By.xpath("//*[@id='errormsg_0_Passwd']")).getText();
System.out.println("Errro message is -->"+text);
	d.quit();
	}catch(Exception e)
		{
		//report the error and take screen  hsots
		System.out.println(e);
		 File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("c:\\screenshotlogin.png"));
    }
		
		}
	}


