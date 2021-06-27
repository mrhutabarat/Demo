package co.uk.leonardushutabarat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoInternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Temp\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.uk/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
