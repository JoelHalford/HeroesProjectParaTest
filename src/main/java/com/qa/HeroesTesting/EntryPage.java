package com.qa.HeroesTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntryPage {
	
	@FindBy(id = "nav-register")
	private WebElement registerButton;
	
	public void clickRegister() {
		registerButton.click();
		
	}

}
