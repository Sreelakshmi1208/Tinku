package org.testingbatch.Mot;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_12windohandles2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		String x = d.getWindowHandle();
		System.out.println(x);
		
		Thread.sleep(2000);
		
	    d.switchTo().newWindow(WindowType.TAB);

		Thread.sleep(2000);
		
		Set<String> s = d.getWindowHandles();
		System.out.println(s);
		
		
		
		 d.switchTo().newWindow(WindowType.TAB);
		 Thread.sleep(2000);
		 Set<String> s1 = d.getWindowHandles();
	     System.out.println(s1);
	     
	     d.close();
			
			

	}

}
