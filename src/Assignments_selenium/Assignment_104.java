package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement navigate=driver.findElement(By.linkText("Courses"));
		
		Actions a1 = new Actions(driver);
		a1.doubleClick(navigate).perform();
		

	}

}
