package currency;
import com.opencsv.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
public class curr {

	public static WebDriver driver ;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
  driver = new FirefoxDriver();
  driver.get("https://www.google.com/finance/converter") ;
  
  List<String> amt= new ArrayList<String>() ;
  amt.add("1");
  amt.add("1");
  amt.add("1");
  
  List<String> from= new ArrayList<String>() ;
  from.add("USD");
  from.add("EUR");
  from.add("AUD");
  
  List<String> to = new ArrayList<String>() ;
  to.add("INR");
  to.add("INR");
  to.add("INR");
  
for(int i=0 ; i<=2 ; i++)
{
	driver.findElement(By.xpath("//*[@name='a']")).clear();
  driver.findElement(By.xpath("//*[@name='a']")).sendKeys(amt.get(i));
  

 Select fromcur = new Select(driver.findElement(By.xpath("//*[@name='from']")));
		fromcur.selectByValue(from.get(i));

		 Select tocur = new Select(driver.findElement(By.xpath("//*[@name='to']")));
			tocur.selectByValue(to.get(i));
  

  driver.findElement(By.xpath("//*[@type='submit']")).click();
  
String result = driver.findElement(By.xpath("//*[@id='currency_converter_result']")).getText();
  System.out.println(result);}
  driver.quit();
	}

}
