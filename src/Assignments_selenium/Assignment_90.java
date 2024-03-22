package Assignments_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-base a-text-center']")).click();
		
		
	}

}
