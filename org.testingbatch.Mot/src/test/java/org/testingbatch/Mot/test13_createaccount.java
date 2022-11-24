package org.testingbatch.Mot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test13_createaccount {

public static void main(String[] args) throws InterruptedException {

		//using partial link text 
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	//Launch site using base based url
	driver.get("http://www.github.com/login");
	Thread.sleep(5000);

	WebElement e4=driver.findElement(By.linkText("Create an account"));
	e4.click();
    Thread.sleep(5000); 

	}

}
