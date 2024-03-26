package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement tag=driver.findElement(By.tagName("a"));
		tag.click();

	}

}
