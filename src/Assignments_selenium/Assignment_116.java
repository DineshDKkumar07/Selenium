package Assignments_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		WebElement search=driver.findElement(By.name("q"));
		
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(4));//Explicit should be written as condition
		w1.until(ExpectedConditions.titleContains("Goo"));
		
		search.sendKeys("India");
		WebElement cli=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		cli.click();

	}

}
