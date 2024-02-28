package org.testclasses;

import java.util.List;

import org.objects.repo.Details;
import org.objects.repo.LoginPageObjects;
import org.objects.repo.RegisterPatientObjects;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class Executable extends BaseClass {

	public LoginPageObjects l;
	public RegisterPatientObjects r;
	public Details d;

	@BeforeClass
	public void setUp() {
		loadDriver(readProperty("browser"));
		deleteCookies();
		maxWindow();
	}

	@BeforeMethod
	public void beforeTestCase() {
		System.out.println("Test case starts...");
	}

	@Test(dataProvider = "Logindata", priority = 1)
	public void login(String username, String password) {

		launchUrl(readProperty("url"));
		l = new LoginPageObjects();
		enterText(l.getTxtUsername(), username);
		enterText(l.getTxtPassword(), password);
		clickElement(l.getOptionOutPatientClinic());
		clickElement(l.getBtnLogIn());
		l = new LoginPageObjects();
//		verifyPresenceOfAnElement(l.getTabUserDashBoard());
	}

	@DataProvider(name = "Logindata")
	public Object[][] testData() {
		return new Object[][] { { "Admin", "Admin123" } };
	}

	@Test(priority = 2, dataProvider = "RegisterPatientdata")
	private void registerPatient(String givenname, String familyname, String gender, String day, String month,
			String year, String address1, String city, String state, String country, String postalcode, String phone) throws InterruptedException {

		r = new RegisterPatientObjects();
		clickElement(r.getOptionRegisterPatient());
		r = new RegisterPatientObjects();
		enterText(r.getTxtGivenPatientName(), givenname);
		enterText(r.getTxtFamilyName(), familyname);
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		selectFromDropDown(r.getDropDownGender(), gender);
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		enterText(r.getTxtDay(), day);
		selectFromDropDown(r.getDropDownMonth(), month);
		enterText(r.getTxtYear(), year);
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		enterText(r.getTxtAddress1(), address1);
		enterText(r.getTxtCityVillage(), city);
		enterText(r.getTxtStateProvince(), state);
		enterText(r.getTxtCountry(), country);
		enterText(r.getTxtPostalCode(), postalcode);
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		enterText(r.getTxtPhoneNumber(), phone);
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		clickElement(r.getBtnNext());
		r = new RegisterPatientObjects();
		clickElement(r.getBtnConfirm());
		
		applyWaitToAllElements();
		
           d = new Details();
		 
		 clickElement(d.getStartVisit());
		 clickElement(d.getConfirmBtn());
		
		 
		 clicksscript(d.getAttachmentBtn());
		 
		 
//		 clickElement(d.getDropFile());
		 
		 applyWaitToAllElements();
		 
		 Thread.sleep(13000);
		 
		 
//		 WebElement dropFile = d.getDropFile();
////		 
////		 clickElement(dropFile);
//		 
//		 dropFile.sendKeys("C:\\Users\\Srikeerthana\\Downloads\\Datas.txt");
//	 

//		 
		 enterText(d.getCaptionData(), "Datas");
////		 
		 clickElement(d.getUploadClick());
		 
		
		 
		 
		 
		 clickElement(d.getTestSmithBtn());
		 
		 
		 
		 
		 clickElement(d.getEndClick());
		 
		 clickElement(d.getYesBtn());
		 
		 
		 clickElement(d.getStartBtn());
		 
		 clickElement(d.getConfirmBtn());
		 
	    clickElement(d.getCaptureVitalsBtn());
	    
	    enterText(d.getHeightValue(), "56");
		 
	    clickElement(d.getArroyBtn());
	    
	    enterText(d.getWeightValue(), "52");
	    
	    clickElement(d.getArroyBtn());
	    
	    clickElement(d.getArroyBtn());
	    
	    
	    clickElement(d.getSaveForm());
	    
	    clickElement(d.getSaveBtn());
	    
	    
	    clickElement(d.getEndVisitBtn());
	    
	    clickElement(d.getYesBtn());
	    
	    
//	    
	    
	    clickElement(d.getTestJohnBtn());
	    
////	    
	    clickElement(d.getMergeVisit());
////	    
////	    
	    List<WebElement> checkBox = d.getCheckBox();
	    
	    
	    for (WebElement ele : checkBox) {
	    	
	    	clickElement(ele);
	    	
	    	
			
		}
	    
	    clickElement(d.getMergeSelectedVistBtn());
//	    
	    clickElement(d.getReturnBtn());
//	    
//	    clickElement(d.getPastVistBtn());
//	    
	    
	    
	    
	    
		 
		
		
		
		
	}

	@DataProvider(name = "RegisterPatientdata")
	public Object[][] registerData() {
		return new Object[][] { { "TestJohn", "Smith", "Male", "10", "February", "2000", "13B block", "Newyork", "NY",
				"US", "1022", "9988776655" } };
	}
	

	

	@AfterMethod

	public void afterTestCase() {
		System.out.println("...Test case ends");
	}

	@AfterClass

	public void tearDown() {
	//	closeBrowser();
	}

}
