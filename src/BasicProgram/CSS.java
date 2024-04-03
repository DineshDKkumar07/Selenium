package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		search.sendKeys("Dk is coder");
		
		

	}

}
