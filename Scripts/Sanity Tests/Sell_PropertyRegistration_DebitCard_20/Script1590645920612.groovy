import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String projectname = faker.address().streetName()

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

WebUI.uploadFile(findTestObject('Property submission/owner/Scanned Passport Copy'), GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.delay(4)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/div_Scanned ID Copy  (UAE or c'), GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/div_Owner details added succes'),
	4)

//POA//
WebUI.click(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/div_POA Status_ng-input'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
	'No')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(4)

//Property form//
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

WebUI.uploadFile(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'), GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/SPA/SPA'), GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

//mortgage//
WebUI.setText(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
	'No')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property submission/Mortgage/Next/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(10)

//rental//
WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'),
	5)

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), 'No')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), Keys.chord(
		Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))



WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/label_INDEPENDENT REAL ESTATE VALUATOR (FEE_558d3e'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/h3_Savills'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/h3_Knight Frank'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/button_Pay Now'))


//actually 

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/input'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/a_Pay with DebitCredit Card'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/label_I agree with Chiragh wallet terms and_4a56ad'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/button_Proceed with Payment'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/section_BCM                                _108362'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/input_Error_cc_number'), 
    '4111111111111111')

WebUI.setText(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/input_Error_cvv'), 
    '222')

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/input_Error_cc_number'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/select_Expiry Month                        _bea8c8'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/select_Year                                _26701a'), 
    '36', true)

WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/button_Pay Now'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/section_BCM                                _108362'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/input_Edit Shipping Information_email'), 
    'ahsankalim01@gmail.com')

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_PayTabs - Simple  Trusted Payments/button_Pay Now'))

WebUI.delay(15)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/h3_Thank You'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/a_Load More_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Sell Your Property/a_HI ahsan1234'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - Dashborad Home/b_Go to Wallet'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - User Account Summary/h5_111060864000'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - User Account Summary/span_111048781000'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - User Account Summary/span_12075000'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - User Account Summary/h1_Recent Transactions (AED) View All'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertySubmittionThroughCredit/Page_Chiragh - User Account Summary/td_200000'))

WebUI.closeBrowser()

