package com.qa.HeroesTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(id = "register-button")
	private WebElement registerSubmit;
	
	@FindBy(id = "error-message")
	private WebElement errorMessage;
	
	
	public void addUser(String username, String password) throws InterruptedException {
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		registerSubmit.click();
		Thread.sleep(3000);
	}
	
	public String checkOutput() {
		return errorMessage.getText();
		
	}
}
