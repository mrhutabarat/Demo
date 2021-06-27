package co.uk.leonardushutabarat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		driver.getTitle();
		System.out.println("This is push");

	}

}
