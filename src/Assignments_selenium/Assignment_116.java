package Assignments_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
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
		
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(3));//Explicit should be written as condition
		w1.until(ExpectedConditions.titleIs("Google"));
		
		search.sendKeys("India");
		driver.findElement(By.name("btnK")).click();

	}

}
