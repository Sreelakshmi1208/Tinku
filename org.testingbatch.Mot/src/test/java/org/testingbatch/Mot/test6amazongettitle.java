package org.testingbatch.Mot;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test6amazongettitle {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();   
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
		
		
		


	}

}
