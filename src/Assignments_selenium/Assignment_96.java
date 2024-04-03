package Assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/alert/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("(//button[.='Received1'])[1]"));
		search.click();
		//--Alerts
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		

	}

}
