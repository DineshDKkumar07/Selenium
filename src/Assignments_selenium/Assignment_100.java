package Assignments_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_100 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");//another method to get URL
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
