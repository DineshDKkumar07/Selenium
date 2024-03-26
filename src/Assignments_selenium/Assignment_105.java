package Assignments_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_105 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement right=driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(right).perform();
		
		
		Robot r1 = new Robot();
	     r1.keyPress(KeyEvent.VK_DOWN);
	     r1.keyPress(KeyEvent.VK_DOWN);
	     r1.keyPress(KeyEvent.VK_DOWN);
	     
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
