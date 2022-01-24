package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilis.BaseConfig;
import com.utilis.Highlighter;

public class BaseLogin {
	public void getLogin () throws Exception {
		System.setProperty("webdriver.chrome.driver", BaseConfig.getValue("DRIVER_PATH"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BaseConfig.getValue("BASEURL"));
		
		MasterPageFactory pgFactory = new MasterPageFactory(driver);
		
		Highlighter.getColor(driver, pgFactory.getUsername());
		pgFactory.getUsername().sendKeys(BaseConfig.getValue("USERNAME"));
		Highlighter.getColor(driver, pgFactory.getPassword());
		pgFactory.getPassword().sendKeys(BaseConfig.getValue("PASSWORD"));
		pgFactory.getLoginBtn().click();
		
		driver.quit();
	}
}
