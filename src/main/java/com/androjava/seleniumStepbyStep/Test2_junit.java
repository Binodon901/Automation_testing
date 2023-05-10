package com.androjava.seleniumStepbyStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

import org.junit.Test;

public class Test2_junit {
	@Test
	public void showProducts() {
		WebDriver driver=Base.getDriver();
		driver.get("https://ema-jhon-a7b49.web.app/");
		int n=driver.findElements(By.className("product")).size();
		Assert.assertEquals(10, n);
	}
}
