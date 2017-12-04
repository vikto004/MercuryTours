package com.MT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MTregistration {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//open MT registration pageaut.com/mercuryregister.php");
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
		//Asert title of page
		driver.getTitle().contains("Register: Mercury Tours");
		
	//Fill and verify all fields and submit form
		
		driver.findElement(By.name("firstName")).sendKeys("Ilya");
		driver.findElement(By.name("lastName")).sendKeys("Baranov");
		driver.findElement(By.name("phone")).sendKeys("555-555-5555");
		driver.findElement(By.name("userName")).sendKeys("eli4063@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 Main St.");
		driver.findElement(By.name("city")).sendKeys("Savage");
		driver.findElement(By.name("state")).sendKeys("MN");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		
		//Select Germany from drop down
		Select oSelect = new Select(driver.findElement(By.name("country")));
		oSelect.selectByVisibleText("GERMANY");
		
		//Fill in username and password
		driver.findElement(By.name("email")).sendKeys("eli4063@gmail.com");
		driver.findElement(By.name("password")).sendKeys("147258");
		driver.findElement(By.name("confirmPassword")).sendKeys("147258");
		
		//Submit form
		driver.findElement(By.name("register")).click();
		//go to login page
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")).click();
	}

}
