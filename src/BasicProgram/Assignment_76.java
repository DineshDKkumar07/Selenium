package BasicProgram;

import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//driver.close();
		driver.manage().window().maximize();
		String name= driver.getTitle();
		System.out.println("tittle");
		
		
		
		
		
		
		

	}

}
