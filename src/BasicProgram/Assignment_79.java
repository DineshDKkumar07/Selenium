package BasicProgram;

import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_79 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.name("email")).sendKeys("dineshdkssm@gmail.com");
		driver.findElement(By.id("continue")).click();
		
	}

}
