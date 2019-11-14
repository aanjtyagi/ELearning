package simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test
	public void login(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.magento.com");
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.id("email")).sendKeys("anjalityagi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcome1");
	}

}
