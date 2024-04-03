package Assignments_selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");//another method to get URL
		driver.manage().window().maximize();
		WebElement d1=driver.findElement(By.xpath("//span[.='Google']"));
		d1.click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		//changing control 
		Iterator<String>  s2=s1.iterator();
					String k1=		s2.next();
					String K2=		s2.next();
					driver.switchTo().window(K2);
					driver.close();
	
		
		
	
		
		
	}

}
