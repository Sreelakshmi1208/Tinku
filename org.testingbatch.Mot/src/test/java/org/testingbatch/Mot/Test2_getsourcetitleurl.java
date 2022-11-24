package org.testingbatch.Mot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_getsourcetitleurl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		 d.manage().window().minimize();
		 Thread.sleep(4000);
		 
		 d.manage().window().maximize();
		
		 System.out.println(d.getCurrentUrl());
		 Thread.sleep(2000);
		 System.out.println(d.getPageSource());
		 Thread.sleep(4000);
		 
		 System.out.println(d.getTitle());
		 Thread.sleep(4000);
		 
		 d.close();
		 
		 
			
		
		 

	}

}
