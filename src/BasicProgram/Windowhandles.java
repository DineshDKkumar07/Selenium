package BasicProgram;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bestcolleges.com");
		driver.manage().window().maximize();
		Set<String> g1=driver.getWindowHandles();
        
	}

}
