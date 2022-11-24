package org.testingbatch.Mot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9_bynamepassword {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		
		driver.findElement(By.name("password")).sendKeys("Simmy@0703");
		Thread.sleep(5000);
		
		WebElement Y = driver.findElement(By.name("login"));
		Y.sendKeys("click");
		
		
		
		

	}

}
