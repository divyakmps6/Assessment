package org.objects.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class RegisterPatientObjects extends BaseClass {

	public RegisterPatientObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@id,'registerPatient')]")
	private WebElement optionRegisterPatient;

	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement txtGivenPatientName;

	@FindBy(xpath = "//input[@name='familyName']")
	private WebElement txtFamilyName;

	@FindBy(xpath = "//button[@id='next-button']")
	private WebElement btnNext;

	@FindBy(xpath = "//select[@id='gender-field']")
	private WebElement dropDownGender;

	@FindBy(xpath = "//input[@id='birthdateDay-field']")
	private WebElement txtDay;

	@FindBy(xpath = "//select[@id='birthdateMonth-field']")
	private WebElement dropDownMonth;

	@FindBy(xpath = "//input[@id='birthdateYear-field']")
	private WebElement txtYear;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement txtAddress1;

	@FindBy(xpath = "//input[@id='address2']")
	private WebElement txtAddress2;

	@FindBy(xpath = "//input[@id='cityVillage']")
	private WebElement txtCityVillage;

	@FindBy(xpath = "//input[@id='stateProvince']")
	private WebElement txtStateProvince;

	@FindBy(xpath = "//input[@id='country']")
	private WebElement txtCountry;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement txtPostalCode;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement txtPhoneNumber;

	@FindBy(xpath = "//input[@id='submit']")
	private WebElement btnConfirm;

	public WebElement getOptionRegisterPatient() {
		return optionRegisterPatient;
	}

	public WebElement getTxtGivenPatientName() {
		return txtGivenPatientName;
	}

	public WebElement getTxtFamilyName() {
		return txtFamilyName;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getDropDownGender() {
		return dropDownGender;
	}

	public WebElement getTxtDay() {
		return txtDay;
	}

	public WebElement getDropDownMonth() {
		return dropDownMonth;
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public WebElement getTxtAddress1() {
		return txtAddress1;
	}

	public WebElement getTxtAddress2() {
		return txtAddress2;
	}

	public WebElement getTxtCityVillage() {
		return txtCityVillage;
	}

	public WebElement getTxtStateProvince() {
		return txtStateProvince;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtPostalCode() {
		return txtPostalCode;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

}
