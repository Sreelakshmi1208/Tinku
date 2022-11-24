//launching hotelwbsite

package org.testingbatch.Mot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class test8_webelement {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		
		WebElement X = driver.findElement (By.id("username"));
		X.sendKeys("motadoosreelakshmi@gmail.com");
		

	}

}
