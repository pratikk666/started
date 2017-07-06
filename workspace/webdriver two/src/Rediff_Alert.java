

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_Alert {

	public static WebDriver driver =null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
           FileUtils.copyFile(scrFile, new File("D:\\screenshotlogin.png"));
           
		Thread.sleep(5000l);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Thread.sleep(5000l);

		Alert alert=driver.switchTo().alert();  // move mouse from page to alert
		
		
		String AlertText=alert.getText();
		 
System.out.println("Alert text name is -->"+ alert.getText());		


		alert.accept();  // accept alert or click ok
		//alert.dismiss();
		driver.quit();
		
	}

}
