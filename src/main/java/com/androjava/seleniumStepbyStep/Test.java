package com.androjava.seleniumStepbyStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Base.getDriver();
		driver.get("https://ema-jhon-a7b49.web.app/");
		WebElement element = driver.findElement(By.linkText("Sign up/Sign in"));
		element.click();
		element=driver.findElement(By.name("email"));
		element.sendKeys("admintest1@gmail.com");
		element=driver.findElement(By.name("password"));
		element.sendKeys("admintest1");
		element=driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
		element.click();
		System.out.println("Logged in Successfully");
		System.out.println("Logged In");
	}

}
