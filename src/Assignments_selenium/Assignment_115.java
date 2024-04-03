package Assignments_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//once written applicable throughout program
		driver.findElement(By.name("btnK")).click();
		

	}

}
