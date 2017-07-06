package currency;
 
 
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



@RunWith(value=Parameterized.class)
public class currency_parameter {
String from,to ;
int amt;
public static WebDriver driver ;

public currency_parameter(int amt , String from , String to )
{this.amt = amt ;
 this.from = from ;
 this.to = to ;

 }
	
@Parameters
public static Collection  testdata()
{  
 return Arrays.asList(new Object[][]{{1,"USD","INR"},{1,"AUD","INR"},{1,"EUR","INR"}});
 }

/* another way of passing parameters
 * 
@Parameters
public static Collection<Object[]> testdata()
{ Object[][]  testdata = new Object [] []  
		{
	{1,"USD","INR"},
	{2,"EUR","INR"},
	{3,"AUD","INR"}
	} ;
 return Arrays.asList(testdata);
 }
*/
@BeforeClass
public static void start()
{ driver = new FirefoxDriver();
driver.get("https://www.google.com/finance/converter") ;
}

@Test
public void Converter()
{
  
	driver.findElement(By.xpath("//*[@name='a']")).clear();
  driver.findElement(By.xpath("//*[@name='a']")).sendKeys(String.valueOf(amt));
  

 Select fromcur = new Select(driver.findElement(By.xpath("//*[@name='from']")));
		fromcur.selectByValue(from);

		 Select tocur = new Select(driver.findElement(By.xpath("//*[@name='to']")));
			tocur.selectByValue(to);
  

  driver.findElement(By.xpath("//*[@type='submit']")).click();
  
  String result = driver.findElement(By.xpath("//*[@id='currency_converter_result']")).getText();
  System.out.println(result);
 
}



}

