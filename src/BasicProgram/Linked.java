package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.name("user_login")).sendKeys("Dinesh");
		driver.findElement(By.name("user_password")).sendKeys("Dinesh");
		driver.findElement(By.partialLinkText("Sign In")).click();
		driver.quit();
		
		
		
    //the amount of heat energy is absorbed or evolved when one amphere current flows for one second in two elements d
	}

}
