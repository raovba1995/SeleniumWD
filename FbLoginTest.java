package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("abc@xyz.com");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Abc@123");
		
		WebElement loginbt = driver.findElement(By.name("login"));
		loginbt.click();
		
		driver.close();
		
		

	}

}
