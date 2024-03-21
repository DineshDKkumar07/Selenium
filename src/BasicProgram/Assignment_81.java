package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("dineshdkssm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		WebElement values = driver.findElement(By.name("gender"));
		values.click();
		// -----------------------

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Skills']"));
		dropdown.click();

		Select dropdownvalues = new Select(dropdown);
		dropdownvalues.selectByVisibleText("Technical Skills");

		WebElement dropdownvalues1 = driver.findElement(By.name("technicalskills c-s"));
		dropdownvalues1.click();

		Select dropdownvalues2 = new Select(dropdownvalues1);
		dropdownvalues2.selectByValue("Data Science CSS");

		WebElement dropdownvalues3 = driver.findElement(By.id("Country"));
		dropdownvalues3.click();

		Select dropdownvalues4 = new Select(dropdownvalues3);
		dropdownvalues4.selectByValue("Bangladesh");

		driver.findElement(By.id("Present-Address")).sendKeys("password");

		driver.findElement(By.name("Permanent-Address")).sendKeys("password");

		driver.findElement(By.id("Pincode")).sendKeys("34567");

		WebElement dropfind = driver.findElement(By.id("Relegion"));
		dropfind.click();

		Select dropdownvalues5 = new Select(dropfind);
		dropdownvalues5.selectByIndex(2);

		WebElement upload = driver.findElement(By.name("file"));
		
		upload.sendKeys(
				"C:\\Users\\DINESHS\\OneDrive - Capgemini\\Pictures\\Assignments\\Assignment_AB39_Assignment4.jpg.png");

		driver.findElement(By.name("relocate")).click();

		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])")).click();

	}

}
