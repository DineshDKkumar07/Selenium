package Assignments_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_123
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int count=link.size();

		for (int i=0;i<count;i++) {
			
			WebElement singlelink=link.get(i);
			String msg=singlelink.getAttribute("href");
			
			System.out.println(msg);
			
		}
		//The Amount of heat energy 
		

	}

}
