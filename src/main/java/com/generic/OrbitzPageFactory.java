package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrbitzPageFactory {
	public OrbitzPageFactory (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//button[@type='button'])[3]")
	private WebElement homeSignInBtn;
	
	@FindBy (xpath = "//a[@data-stid='link-header-account-signin']")
	private WebElement popupSignInBtn;
	
	@FindBy (xpath = "//input[@id='loginFormEmailInput']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='loginFormPasswordInput']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@id='loginFormSubmitButton']")
	private WebElement loginSignInBtn;

	public WebElement getHomeSignInBtn() {
		return homeSignInBtn;
	}

	public WebElement getPopupSignInBtn() {
		return popupSignInBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginSignInBtn() {
		return loginSignInBtn;
	}
}
