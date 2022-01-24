package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilis.BaseConfig;

public class BaseLogin {
	public void getLogin () throws Exception {
		System.setProperty("webdriver.chrome.driver", BaseConfig.getValue("DRIVER_PATH"));
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getValue("BASEURL"));
		
		OrbitzPageFactory pgFactory = new OrbitzPageFactory(driver);
		pgFactory.getHomeSignInBtn().click();
		pgFactory.getPopupSignInBtn().click();
		pgFactory.getEmail().sendKeys(BaseConfig.getValue("EMAIL"));
		pgFactory.getPassword().sendKeys("PASSWORD");
		pgFactory.getLoginSignInBtn().click();
	}
}
