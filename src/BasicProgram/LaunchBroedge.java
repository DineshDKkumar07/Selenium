package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBroedge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("Java");
		driver.findElement(By.id("learntocode_searchbtn")).click();
		Thread.sleep(3000);


	}

}
