package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		
	
	}

}
