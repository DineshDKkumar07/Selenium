package Assignments_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.in");//another method to get URL
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		String s1=driver.getWindowHandle();
		System.out.println(s1);
		Set<String> s2=driver.getWindowHandles();
		System.out.println(s2);

	}

}
