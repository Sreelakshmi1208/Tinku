package org.testingbatch.Mot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test10_xpath2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e = driver.findElement(By.xpath("//*[@id ='email']"));
		e.sendKeys("simmy@gmail.com");
		Thread.sleep(2000);
		
		//using name locator - password field
		WebElement e1=driver.findElement(By.name("password"));
		e1.sendKeys("simmy0703");
		Thread.sleep(5000);
		driver.close();
						
		

		
		
		

	}

}
