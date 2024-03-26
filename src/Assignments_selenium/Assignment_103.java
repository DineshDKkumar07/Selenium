package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_103 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement postman=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(postman, drop).perform();
		

	}

}
