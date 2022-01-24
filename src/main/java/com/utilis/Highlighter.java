package com.utilis;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	public static void getColor (WebDriver driver, WebElement element) {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid red'", element);
	}
}
