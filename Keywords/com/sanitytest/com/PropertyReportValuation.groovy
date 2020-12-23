package com.sanitytest.com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker
import internal.GlobalVariable

public class PropertyReportValuation {

	def propertySubmitFlow(){
		Faker faker = new Faker()

		String projectname = faker.address().streetName()

		//poa
		String poafirst = faker.name().firstName()

		String poamiddle = faker.name().firstName()

		String poalast = faker.name().firstName()

		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)

		WebUI.waitForPageLoad(15)

		WebUI.maximizeWindow()

		WebUI.delay(3)

		WebUI.click(findTestObject('Property submission/owner/Page_Chiragh - Home/a_SELL'))

		WebUI.setText(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/input_Username_un'), GlobalVariable.userName)

		WebUI.setText(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/input_Password_userPassword'),
				GlobalVariable.passWord)

		WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/button_Log In'))

		//OWNER//
		WebUI.delay(10)

		WebUI.setText(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'),
				'3294723889')

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/ID card expiry'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_2029'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/month'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_21'))

		WebUI.scrollToElement(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/div_Scanned Passport Copy'),
				5)

		WebUI.delay(4)

		WebUI.uploadFile(findTestObject('Property submission/owner/Scanned Passport Copy'), GlobalVariable.fileUpload22)

		WebUI.delay(7)

		WebUI.delay(4)

		WebUI.uploadFile(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/div_Scanned ID Copy  (UAE or c'),
				GlobalVariable.fileUpload22)

		WebUI.delay(7)

		WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'))

		//************************POA**************************//
		WebUI.setText(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
				'Yes')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
				poafirst)

		WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'),
				poamiddle)

		WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
				poalast)

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Nationality/Page_Chiragh - Sell Your Property/input_Nationality_ng-star-inserted'),
				'Pakistani')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/Nationality/Page_Chiragh - Sell Your Property/input_Nationality_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
				'3294723889')

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/input_Passport Expiry Date_passportExpiryDate'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_2026'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_Aug'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_14'))

		WebUI.setText(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'),
				'3294723889')

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA ID/Page_Chiragh - Sell Your Property/input_ID Card Expiry Date_idCardExpiration'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA ID/Page_Chiragh - Sell Your Property/span_2029'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA ID/Page_Chiragh - Sell Your Property/span_Jun'))

		WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA ID/Page_Chiragh - Sell Your Property/span_21'))

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Mobile Number/Page_Chiragh - Sell Your Property/input_Country Code_ng-star-inserted'),
				'Pakistan')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/Mobile Number/Page_Chiragh - Sell Your Property/input_Country Code_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Mobile Number/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'),
				'3357974889')

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Email_email'),
				'test32766@gmail.com')

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Address_address'),
				'Lahore Pakistan')

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Country_ng-star-inserted'),
				'Pakistan')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Country_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_City_ng-star-inserted'),
				'Lahore')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_City_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_POA Number_poaNumber'),
				'47382472387')

		WebUI.click(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/label_No Expiry Date'))

		WebUI.setText(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_Specific Property_ng-star-inserted'),
				'Multiple')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_Specific Property_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Passport Copy'), 5)

		WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Passport Copy'), GlobalVariable.fileUpload22)

		WebUI.delay(8)

		WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned ID Copy'), GlobalVariable.fileUpload22)

		WebUI.delay(8)

		WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Notarized POA'), GlobalVariable.fileUpload22)

		WebUI.delay(8)

		WebUI.click(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/label_General POA not accepted'))

		WebUI.click(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/button_Next'))

		//PROPERTY//
		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'),
				'Completed')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input_Title Deed Number_titleD'),
				'348236327')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'),
				'Free Hold')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'),
				'Villa')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Project Name/Page_Chiragh - Sell Your Property/input_Project Name_projectName'),
				projectname)

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Building name/Page_Chiragh - Sell Your Property/input_Building Name_bulidingNa'),
				'Ajman Tower')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Net Area_netArea'),
				'2100')

		WebUI.delay(5)

		WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'),
				'sqm')

		WebUI.sendKeys(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.delay(5)

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Gross Area_grossArea'),
				'2300')

		WebUI.delay(4)

		WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Address/Page_Chiragh - Sell Your Property/input_Address_address'),
				'United Arab Emirates')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'),
				'Dubai')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Developer Name/Page_Chiragh - Sell Your Property/input_Developer Name_developer'),
				'DEV')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'),
				'Residential')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Approx Age/Page_Chiragh - Sell Your Property/input_Property Approx. Age_pro'),
				'2 years')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Beds/Page_Chiragh - Sell Your Property/input_Bedrooms_noOfBedrooms'),
				'6')

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Baths/Page_Chiragh - Sell Your Property/input_Bathrooms_noOfBaths'),
				'4')

		//WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Covered Parking'))
		WebUI.delay(2)

		WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Car Parkings/input_car_parkings'),
				'2')

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Driver Room'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Fully Fitted Kitchen'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Fully Furnished'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_Beach Access'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_Bank ATM Facility'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_24 Hours Maintenance'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Mosques'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Schools'))

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Shopping Malls'))

		WebUI.scrollToElement(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Description/Page_Chiragh - Sell Your Property/div_Description _ngx-editor-textarea'),
				5)

		WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Description/Page_Chiragh - Sell Your Property/div_Description _ngx-editor-textarea'),
				'Villa for sale')

		WebUI.delay(4)

		WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'),
				5)

		WebUI.uploadFile(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'), GlobalVariable.fileUpload22)

		WebUI.delay(7)

		WebUI.uploadFile(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/SPA/SPA'), GlobalVariable.fileUpload22)

		WebUI.delay(7)

		WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

		//MORTGAGE//
		WebUI.setText(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
				'Yes')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Number_mortgageNo'),
				'3211111111')

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Start Date_mortgageStartDate'))

		WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_2016'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_Dec'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_18'))

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Year_ng-star-inserted'),
				'3')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Year_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Month_ng-star-inserted'),
				'6')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Month_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Initial Amount (AED)_initialAmount'),
				'200000')

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Outstanding Amount (AED)_outstandingAmount'),
				'120000')

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Monthly Mortgage Payment (AED)_monthlyMortgagePayment'),
				'80000')

		WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
				5)

		WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
				'Ajman Bank')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Mortgage/Mortgage Documents/Scanned NOC form'), 5)

		WebUI.uploadFile(findTestObject('Property Submission(All Forms)/Mortgage/Mortgage Documents/Scanned NOC form'), GlobalVariable.fileUpload22)

		WebUI.delay(10)

		WebUI.click(findTestObject('Object Repository/Property submission/Mortgage/Next/Page_Chiragh - Sell Your Property/button_Next'))

		//rental//
		WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'),
				5)

		WebUI.delay(4)

		WebUI.setText(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), 'Yes')

		WebUI.sendKeys(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), Keys.chord(
				Keys.ENTER))

		WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Ejari Number_ejariNo'),
				'999992322')

		WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Tenant Name_tenantName'),
				'dev')

		WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Annual Rent Amount (AED)_annualRent'),
				'229990')

		WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Payment Structure_ng-star-inserted'),
				'3')

		WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Payment Structure_ng-star-inserted'),
				Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Lease Start Date_leaseStartDate'))

		WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_2016'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_Dec'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/span_18'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Lease End Date_leaseExpiryDate'))

		WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/span_2030'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/span_Nov'))

		WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/span_24'))

		WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Rent/Rental Document/Ejari Contract'), 5)

		WebUI.uploadFile(findTestObject('Property Submission(All Forms)/Rent/Rental Document/Ejari Contract'), GlobalVariable.fileUpload22)

		WebUI.delay(8)

		WebUI.click(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('Property submission/ValuationCompany/button_SUBMIT'), 5)

		WebUI.click(findTestObject('Property submission/ValuationCompany/button_SUBMIT'))

		WebUI.delay(8)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Property submission/Done/Page_Chiragh - Sell Your Property/h3_Thank You'),
				5)

		WebUI.closeBrowser()
	}

	@Keyword
	def verificationDepartmentFlow(){
		WebUI.openBrowser('')

		WebUI.waitForPageLoad(40)

		WebUI.navigateToUrl(GlobalVariable.url)

		WebUI.maximizeWindow()

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'arsalankhalid')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
				'c/4m4/rTvNs0iFiKg9IHPQ==')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_New Leads'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Mumtaz Hassan (30)'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_AK'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(8)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'mumtazhassan')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
				'c/4m4/rTvNs0iFiKg9IHPQ==')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_My Leads'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/th_Status'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Start Now'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

		WebUI.delay(8)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/button_ownerVerify'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property Details'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/button_propertyVerify'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Check List'))

		WebUI.delay(3)

		WebUI.scrollToElement(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property details are verif'), 9)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property details are verif'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Confirm'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_MH'))

		WebUI.delay(10)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(8)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'arsalankhalid')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
				'c/4m4/rTvNs0iFiKg9IHPQ==')

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_In Process'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Check List'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Approve'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/snack-bar-container_Are you su_2'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/span_Are you sure you want to _2'))

		WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

		WebUI.delay(5)

		WebUI.closeBrowser()
	}

	@Keyword
	def brokerageDepartmentFlow(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.url)

		WebUI.maximizeWindow()

		String currentWindow = WebUI.getWindowIndex()


		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'abdullah')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
				'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_My Leads'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Reichel Trail 3 Floors Build'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

		WebUI.delay(5)

		WebUI.uploadFile(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img_Form A_ng-star-inserted'),
				GlobalVariable.fileUpload22)


		WebUI.uploadFile(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img_Brokerage Report_ng-star-i'),
				GlobalVariable.fileUpload22)

		WebUI.delay(5)

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price Range (AED)_o'),
				'3000000')

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price Range (AED)_o_7'),
				'6000000')

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price Range (AED'),
				'7000000')

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price Range (AED_7'),
				'9000000')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Submit for Approval'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_AM'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'farhanm')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
				'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars_1'))

		WebUI.delay(20)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Activity Log'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Activity Log'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_1'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_1'))

		WebUI.delay(8)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'nayab')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
				'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process_1'))

		WebUI.delay(20)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars_2'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Documents'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Documents'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_2'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_2'))

		WebUI.delay(8)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

		WebUI.delay(10)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_NB'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'abdullah')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
				'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_My Leads'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/i_Call Seller_fas fa-calendar-'))

		WebUI.delay(3)

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Schedule a Brokerage Mee'),
				'Brokerage Meeting')

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/textarea_Schedule a Brokerage'),
				'Brokerage Meeting')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Schedule a Brokerage Meet'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Set'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_SAVE (1)'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/img'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

		WebUI.delay(5)

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price (AED)_openPri'),
				'5000000')

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price (AED)_rese'),
				'8000000')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Select duration (in days)_'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_7'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Auction Start Date_mat-'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_9'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Auction Start Date_mat-che'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/button_ Add Schedule'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/mat-form-field__datepicker-inp'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/button__mat-icon-button'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_9'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/input__form-control form-input'), '2 00PM' )

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/Page_Chiragh.com Admin/input__form-control form-input'), '4 00PM')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Save'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

		WebUI.delay(3)


		WebUI.delay(5)

		WebUI.executeJavaScript('window.open();', [])

		WebUI.switchToWindowIndex(currentWindow+1)

		WebUI.navigateToUrl(GlobalVariable.Url)

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/div_Login or Register'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Login'))

		WebUI.waitForPageLoad(5)

		WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userName'), GlobalVariable.userName)
		WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userPassword'), GlobalVariable.passWord)
		WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/button_Sign In'))

		//WebUI.delay(5)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/div_Login or Register'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Profile'))

		WebUI.waitForPageLoad(5)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Activity'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_In Process'))
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Property Id 52482_ellipisIco'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Listing Terms'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/button_Agree'))
		WebUI.delay(7)
		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/button_'))
		WebUI.delay(5)

		WebUI.switchToWindowIndex(currentWindow)

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Check List'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Confirm'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img1'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_AM'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.waitForPageLoad(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

		WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
				'farhanm')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

		WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
				'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Cordia Tunnel Hotel'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Check List_2'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve_1'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Yes'))

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img1'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

		WebUI.closeBrowser()
	}

	@Keyword
	def propertyReportVisiablity(){
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)

		WebUI.waitForPageLoad(15)

		WebUI.maximizeWindow()

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

		WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_Login'))

		WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Username_un'),
				GlobalVariable.userName)

		WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Password_userPassword'),
				'RigbBhfdqOBDK95asqKeHw==')

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/button_Log In'))

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Home/a_HI ahsan1234'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Dashborad Home/p_Activity'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Dashborad Home/a_Sell'))

		WebUI.mouseOver(findTestObject('Sanity Test/propertyUpdate/mouseOver/Page_/img'))

		WebUI.click(findTestObject('Sanity Test/propertyReportValuation/Page_/a_Property images are coming soon_bid-bottom-menu'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_Chiragh - Open House/a_Valuation Reports'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/label_Chiragh Valuation Report'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/label_3rd Party Valuation Report'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/img'))

		WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/span_'))

		WebUI.delay(3)

		WebUI.closeBrowser()
	}
}
