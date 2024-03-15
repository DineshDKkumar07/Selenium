package BasicProgram;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.close();
		String name= driver.getTitle();
		System.out.println("tittle");
		
		
		
		
		
		

	}

}
