package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Documentation']")).click();
		
		
	
	}

}
