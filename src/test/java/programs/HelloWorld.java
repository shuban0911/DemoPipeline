package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	
	@Test
	public void sampleTest() {
		WebDriver driver = null;
		
		String browser = System.getProperty("browser","firefox");
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get("https://www.google.com");
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		
		
		System.out.println(browser+"*********************");
	}

}
