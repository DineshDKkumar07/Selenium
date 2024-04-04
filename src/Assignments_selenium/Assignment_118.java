package Assignments_selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_118 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");//another method to get URL
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement cli=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		cli.click();
		
		Set<String> s1=driver.getWindowHandles();
		//System.out.println(s1);
		
		//Changing control parent to child
		
		Iterator<String>  s2=s1.iterator();
		
		String g1=		s2.next();
		String g2=		s2.next();
		driver.switchTo().window(g2);
		
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}

}
