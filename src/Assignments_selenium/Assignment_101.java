package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_101 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement over=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(over).perform();
		
		WebElement sign=driver.findElement(By.xpath("//span[.='Sign in']"));
		sign.click();

	}

}
