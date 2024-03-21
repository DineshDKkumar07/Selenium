package BasicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("mobile");
		//Thread.sleep(2000);
	//	-----------

		List<WebElement> action=driver.findElements(By.xpath("(//ul[@class='_1sFryS _2x2Mmc _3ofZy1'])/li/div"));
		int count=action.size();
		System.out.println(count);
	//	action.get(4).click();
		
	}

}
