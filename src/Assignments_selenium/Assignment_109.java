package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.cssSelector("textarea.gLFyf"));
		search.sendKeys("INDIA");
		
		//[name='q']
		//textarea.gLFyf[name='q']
		
		//https://retail.onlinesbi.sbi/retail/login.html
	}

}
