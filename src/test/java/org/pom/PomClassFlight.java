package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClassFlight extends BaseClass {
	
	public PomClassFlight () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputName")
	private WebElement name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="state")
	private WebElement state;
	@FindBy(id="zipCode")
	private WebElement zipCode;
	@FindBy(id="cardType")
	private WebElement cardType;
	@FindBy(id="creditCardNumber")
	private WebElement creditCardNumber;
	@FindBy(id="creditCardMonth")
	private WebElement month;
	
	public WebElement getName() {
		return name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipCode() {
		return zipCode;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getMonth() {
		return month;
	}
	
	
	
	
}
