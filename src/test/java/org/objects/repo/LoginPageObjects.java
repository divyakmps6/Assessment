package org.objects.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPageObjects extends BaseClass {

	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUsername;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//li[@id='Outpatient Clinic']")
	private WebElement optionOutPatientClinic;

	@FindBy(xpath = "//input[@id='loginButton']")
	private WebElement btnLogIn;

	@FindBy(xpath = "//div[@id='navbarSupportedContent']")
	private WebElement tabUserDashBoard;

	
	public WebElement getTabUserDashBoard() {
		return tabUserDashBoard;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getOptionOutPatientClinic() {
		return optionOutPatientClinic;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

}
