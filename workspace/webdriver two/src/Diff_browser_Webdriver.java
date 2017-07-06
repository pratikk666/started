

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Diff_browser_Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vivek\\mayWDSelenium\\WebDriverDayTwo\\chromedriver.exe");
	WebDriver ch=new ChromeDriver();
	ch.navigate().to("http://www.gmail.com");
	
	
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Vivek\\mayWDSelenium\\WebDriverDayTwo\\IEDriverServer.exe");
	WebDriver ie=new InternetExplorerDriver();
	ie.navigate().to("http://www.gmail.com");
		
		
	}

	
}
