package week3.day2.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://WWW.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	Thread.sleep(6000);
	String t=driver.findElement(By.xpath("(//div[@class='filter']/div)[1]")).getText();
	System.out.println("total"+t);
	List<WebElement> bagList=driver.findElements(By.className("brand"));
	System.out.println("total brand"+bagList.size());
	
	
	for(WebElement wb:bagList) {
		String text =wb.getText();
		System.out.println(text);
		
		
		List<WebElement> bagname= driver .findElements(By.xpath("//div[@class='nameSls']"));
		Thread.sleep(4000);
		System.out.println("size"+bagname.size());
		System.out.println("names of bags=");
		for(WebElement b:bagname)
		{
			String bags=b.getText();
		
			System.out.println(bags);
		}
			
	}
	
	}

}
