package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
public static WebDriver driver;

@Test
public void OpenBrowserurl() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BOSU\\eclipse-workspace\\Testing\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	}

}
