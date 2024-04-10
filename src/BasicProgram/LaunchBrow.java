package BasicProgram;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class LaunchBrow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("Mouse");
		Thread.sleep(2000);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.ENTER);
		WebElement cli=driver.findElement(By.xpath("(//img[@class='_396cs4'])[2]"));
		cli.click();
		
		Set<String> w1= driver.getWindowHandles();
        /* Iterator<String>  w2=w1.iterator();
		
		String g1=		w2.next();
		String g2=		w2.next();
		driver.switchTo().window(g2);
		driver.close();*/
		
		TakesScreenshot d1= driver;
		File source=d1.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\DINESHS\\eclipse-workspace\\SeleniumDK\\NewSC\\grotechminds.png ");
		FileHandler.copy(source, destination);
	
		
	

	}

}
