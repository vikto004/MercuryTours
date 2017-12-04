package com.MT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MTflightfinder {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Open MT homepage
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//login using username and password
		driver.findElement(By.name("userName")).sendKeys("eli4063@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("login")).click();

		//Fill flight details
		driver.findElement(By.name("findFlights"));
		
		Select oSelect = new Select(driver.findElement(By.name("passCount")));
		oSelect.selectByIndex(1);
		
		Select bSelect = new Select(driver.findElement(By.name("fromPort")));
		bSelect.selectByVisibleText("New York");;
		
		Select cSelect = new Select(driver.findElement(By.name("fromMonth")));
		cSelect.deselectByVisibleText("February");
		
		Select dSelect = new Select(driver.findElement(By.name("fromDay")));
		dSelect.selectByIndex(6);
		
		Select eSelect = new Select(driver.findElement(By.name("toPort")));
		eSelect.selectByVisibleText("Paris");
	}

}
