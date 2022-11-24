package org.testingbatch.Mot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test11_gettitleminimax {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		 d.manage().window().minimize();
		 Thread.sleep(4000);
		 
		 d.manage().window().maximize();
		 

	}

}
