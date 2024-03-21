package BasicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzon_DK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		
		
		List<WebElement> dk=driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])/div/div"));
		int count =dk.size();
		System.out.println(count);
		Thread.sleep(2000);
		dk.get(2).click();
	}

}
