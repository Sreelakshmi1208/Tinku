package org.testingbatch.Mot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3_webelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.github.com/login");
		
		Thread.sleep(2000);
		WebElement x=d.findElement(By.id("login_field"));
		x.sendKeys("simmy.07@gmail.com");
		Thread.sleep(2000);
		
		WebElement y=d.findElement(By.id("password"));
		y.sendKeys("simmy");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}

	
}
