package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uhaul.com/");
		driver.manage().window().maximize();
		
		WebElement trailersAndTowing = driver.findElement(By.xpath("//*[@id=\"mainHeaderMenu\"]/li[6]/a[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(trailersAndTowing).build().perform();
		
	}

}
