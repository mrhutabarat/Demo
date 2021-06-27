package co.uk.leonardushutabarat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Temp\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
