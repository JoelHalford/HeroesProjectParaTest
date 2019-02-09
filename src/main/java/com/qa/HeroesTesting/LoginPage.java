package com.qa.HeroesTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "nav-login")
	private WebElement navLogin;
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(id = "register-button")
	private WebElement loginSubmit;
	
	public void addUser(String username, String password) throws InterruptedException {
		navLogin.click();
		Thread.sleep(1000);
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginSubmit.click();
		Thread.sleep(1000);
	}
}
