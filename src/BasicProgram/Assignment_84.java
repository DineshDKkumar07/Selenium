package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Customer Service")).click();
	}

}
