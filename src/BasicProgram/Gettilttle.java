package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettilttle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("great indian Novel");
		search.sendKeys(Keys.ENTER);
		String Tilt=driver.getTitle();
		System.out.println(Tilt);
		
		
	}

}
