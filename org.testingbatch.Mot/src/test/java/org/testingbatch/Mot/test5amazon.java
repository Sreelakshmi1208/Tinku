//Amazon site

package org.testingbatch.Mot;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();   
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		

	}

}
