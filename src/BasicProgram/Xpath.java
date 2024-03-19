package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.name("user_login")).sendKeys("Dinesh");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("paarkavi");
		Thread.sleep(2000);
		
		
		driver.findElement(By.partialLinkText("Sign In")).click();
		driver.quit();
	
		
		
		//---------------//tagname[@attribute='attribute value']-----------syntax for relative xpath
		
		
		
		
		
		

	}

}
