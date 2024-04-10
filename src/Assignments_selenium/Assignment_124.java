package Assignments_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment_124 {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement over=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(over).perform();
		
		WebElement sign=driver.findElement(By.xpath("//span[.='Sign in']"));
		sign.click();
		
		//taking screenshot
		
		 TakesScreenshot tc= driver;
		 File source= tc.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\DINESHS\\eclipse-workspace\\SeleniumDK\\Screenshots\\two.jpeg");
		 FileHandler.copy(source, destination);
	}

}
