package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Alert al = driver.switchTo().alert();
		
		WebElement clickMeButton = driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		clickMeButton.click();
		Thread.sleep(2000);
		String expectedAlertText = "Please enter your name";
		String alertText = al.getText();
		System.out.println(alertText);

		al.sendKeys("Any name");
		al.accept();
		
	}

}
