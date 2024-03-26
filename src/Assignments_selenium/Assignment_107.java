package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_107 {

	public static void main(String[] args) {              //CSS ID -->  #ID                CSS CN-->.CN
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.cssSelector(".gLFyf"));
		search.sendKeys("INDIA");
		
		

	}

}
