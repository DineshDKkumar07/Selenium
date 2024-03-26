package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement over=driver.findElement(By.xpath("//span[.='Login']"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(over).perform(); 
		 
		WebElement sign=driver.findElement(By.xpath("//span[.='Sign Up']"));
		sign.click();
		
		WebElement no=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		no.sendKeys("8888866666");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		

		
	}

}
