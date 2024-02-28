package org.objects.repo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class Details extends BaseClass {
	
	public Details() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisit;
	
	
	@FindBy(xpath="//*[contains(@id,'start-visit-with-visittype-confirm')]")
	private WebElement confirmBtn;
	
	@FindBy(id="attachments.attachments.visitActions.default")
	private WebElement attachmentBtn;
	
	@FindBy(id="visit-documents-dropzone")
	private WebElement 	dropFile;
	
	@FindBy(xpath="//textarea[@ng-model='typedText.fileCaption']")
	private WebElement 	captionData;
	

	@FindBy(xpath="//button[text()='Upload file']")
	private WebElement 	UploadClick;
	
	@FindBy(xpath="//a[contains(text(),'TestJohn')]")
	private WebElement 	testSmithBtn;
	
	
	@FindBy(xpath="//a[@class='ng-binding']")
	private WebElement 	RecentVistVerify;
	
	@FindBy(xpath="(//*[contains(text(),'End Visit')])[3]")
	private WebElement 	endClick;
	
	@FindBy(xpath="//div[@id='end-visit-dialog']//div[@class='dialog-content']//button[@class='confirm right']")
	private WebElement 	yesBtn;

	@FindBy(xpath="//ul[@class='float-left']/li//*[contains(@id,'createVisit')]")
	private WebElement 	startBtn;

	
	@FindBy(xpath="//a[text()=' Capture Vitals']")
	private WebElement 	captureVitalsBtn;
	
	
	@FindBy(xpath="//span[@id='height']//input")
	private WebElement heightValue	;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement arroyBtn	;
	
	
	@FindBy(xpath="//span[@id='weight']//input")
	private WebElement 	weightValue;
	
	@FindBy(xpath="//span[@id='calculated-bmi']")
	private WebElement bmiValue	;
	
	@FindBy(xpath="//a[@id='save-form']")
	private WebElement saveForm	;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveBtn	;
	
	@FindBy(xpath="//div[@id='visit-details']//div[@class='visit-actions active-visit']//a[@class='button task activelist']//i[@class='icon-off']")
	private WebElement 	endVisitBtn;
	

	
	@FindBy(xpath="//span[contains(text(),'TestJohn')]")
	private WebElement testJohnBtn 	;
	
	@FindBy(xpath="//ul[@class='float-left']/li//*[contains(@id,'mergeVisits')]")
	private WebElement mergeVisit	;
	
	//use findelements
	@FindBy(xpath="//table[@id='active-visits']//tbody//input")
	private List<WebElement> checkBox	;
	
	
	
	@FindBy(xpath="//input[@id='mergeVisitsBtn']")
	private WebElement mergeSelectedVistBtn	;
	
	
	@FindBy(xpath="//input[@value='Return']")
	private WebElement ReturnBtn	;
	
	
	@FindBy(xpath="//ul[@class='float-left']/li//*[contains(@id,'createRetrospectiveVisit')]")
	private WebElement 	pastVistBtn;
	
	@FindBy(xpath="//*[contains(@id,'retrospectiveVisitStartDate-wrapper')]//span")
	private WebElement 	calBtn;



	public WebElement getStartVisit() {
		return startVisit;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getAttachmentBtn() {
		return attachmentBtn;
	}

	public WebElement getDropFile() {
		return dropFile;
	}

	public WebElement getCaptionData() {
		return captionData;
	}

	public WebElement getUploadClick() {
		return UploadClick;
	}

	public WebElement getTestSmithBtn() {
		return testSmithBtn;
	}

	public WebElement getRecentVistVerify() {
		return RecentVistVerify;
	}

	public WebElement getEndClick() {
		return endClick;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}

	public WebElement getStartBtn() {
		return startBtn;
	}

	public WebElement getCaptureVitalsBtn() {
		return captureVitalsBtn;
	}

	public WebElement getHeightValue() {
		return heightValue;
	}

	public WebElement getArroyBtn() {
		return arroyBtn;
	}

	public WebElement getWeightValue() {
		return weightValue;
	}

	public WebElement getBmiValue() {
		return bmiValue;
	}

	public WebElement getSaveForm() {
		return saveForm;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getEndVisitBtn() {
		return endVisitBtn;
	}

	public WebElement getTestJohnBtn() {
		return testJohnBtn;
	}

	public WebElement getMergeVisit() {
		return mergeVisit;
	}

	public List<WebElement> getCheckBox() {
		return checkBox;
	}

	public WebElement getMergeSelectedVistBtn() {
		return mergeSelectedVistBtn;
	}

	public WebElement getReturnBtn() {
		return ReturnBtn;
	}

	public WebElement getPastVistBtn() {
		return pastVistBtn;
	}

	public WebElement getCalBtn() {
		return calBtn;
	}
	
//	@FindBy(xpath="")
//	private WebElement 	;
//	@FindBy(xpath="")
//	private WebElement 	;
//	
	
	
	
	
	
	
	
	
	
	
}
