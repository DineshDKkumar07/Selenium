package Assignments_selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_120{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[.='Mobiles']")).click();//for just text message
		WebElement values=driver.findElement(By.xpath("//select[@name='url']"));
		values.click();
		//dropdown
		Select dd= new  Select(values);//we can select dropdown by creating obj and by ref varaible we can perform actions
	//	dd.selectByValue("search-alias=stripbooks");
		List<WebElement> opt= dd.getOptions();
		int count=opt.size();
		System.out.println(count);
		
	}
}