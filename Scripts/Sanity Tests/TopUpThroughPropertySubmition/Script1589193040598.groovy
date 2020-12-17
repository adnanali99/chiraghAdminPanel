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

//poa
String poafirst = faker.name().firstName()

String poamiddle = faker.name().firstName()

String poalast = faker.name().firstName()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Username_un'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Username_un'), 'chiraghcom')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_SELL'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/h5_Personal Detail'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/label_First Name'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
	'')

String errorFirstName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_First name is required'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'),
	'22')

String errorMiddleName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorMiddleName, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
	'333')

String errorFirstNameSec = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorFirstNameSec, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
	'')

String lastName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Last name is required'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
	'333')

String lastNameSec = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(lastNameSec, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
	'')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Passport number is required'))

String lastNameCh = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(lastNameCh, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
	'vvv')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'),
	'r')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'),
	'')

String mobileNumber = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Mobile Number is required'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'),
	'55555')

//OWNER//
WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
	'Auto')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'),
	'Auto')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
	'Chiragh')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
	'3333333')

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

WebUI.uploadFile(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/div_Scanned ID Copy  (UAE or c'),
	GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'))

//************************POA**************************//
WebUI.setText(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
	'Yes')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
	'333')

String poa = WebUI.getText(findTestObject('Sanity Test/SellProperty/object/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(poa, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_First Name_firstName'),
	poafirst)

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'),
	'333')

String poaMiddleNm = WebUI.getText(findTestObject('Sanity Test/SellProperty/object/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(poaMiddleNm, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'),
	poamiddle)

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
	'333')

String poaLastNm = WebUI.getText(findTestObject('Sanity Test/SellProperty/object/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(poaLastNm, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/Name Fields/Page_Chiragh - Sell Your Property/input_Last Name_lastName'),
	poalast)

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Nationality/Page_Chiragh - Sell Your Property/input_Nationality_ng-star-inserted'),
	'Pakistani')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/Nationality/Page_Chiragh - Sell Your Property/input_Nationality_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
	'')

WebUI.setText(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'),
	'3294723889')

WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/input_Passport Expiry Date_passportExpiryDate'))

WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_2026'))

WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_Aug'))

WebUI.click(findTestObject('Object Repository/Property Submission(All Forms)/POA/POA Passport/Page_Chiragh - Sell Your Property/span_14'))

WebUI.setText(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'),
	'')

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
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Mobile Number/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'),
	'3357974889')

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Email_email'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Email_email'),
	'test32766@gmail.com')

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/Address email/Page_Chiragh - Sell Your Property/input_Address_address'),
	'')

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
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_POA Number_poaNumber'),
	'47382472387')

WebUI.click(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/label_No Expiry Date'))

WebUI.setText(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_Specific Property_ng-star-inserted'),
	'Multiple')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/POA/POA Details/Page_Chiragh - Sell Your Property/input_Specific Property_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Passport Copy'), 5)

WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Passport Copy'), GlobalVariable.fileUpload)

WebUI.delay(8)

WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned ID Copy'), GlobalVariable.fileUpload)

WebUI.delay(8)

WebUI.uploadFile(findTestObject('Property Submission(All Forms)/POA/POA Documents/Scanned Notarized POA'), GlobalVariable.fileUpload)

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
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input_Title Deed Number_titleD'),
	'348236327')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'),
	'Free Hold')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'),
	'Villa')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Project Name/Page_Chiragh - Sell Your Property/input_Project Name_projectName'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Project Name/Page_Chiragh - Sell Your Property/input_Project Name_projectName'),
	projectname)

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Building name/Page_Chiragh - Sell Your Property/input_Building Name_bulidingNa'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Building name/Page_Chiragh - Sell Your Property/input_Building Name_bulidingNa'),
	'Ajman Tower')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Net Area_netArea'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Net Area_netArea'),
	'2100')

WebUI.delay(5)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'),
	'sqm')

WebUI.sendKeys(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Gross Area_grossArea'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Gross Area_grossArea'),
	'2300')

WebUI.delay(4)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Address/Page_Chiragh - Sell Your Property/input_Address_address'),
	'')

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Address/Page_Chiragh - Sell Your Property/input_Address_address'),
	'United Arab Emirates')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'),
	'Dubai')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Developer Name/Page_Chiragh - Sell Your Property/input_Developer Name_developer'),
	'')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Developer Name/Page_Chiragh - Sell Your Property/input_Developer Name_developer'),
	'DEV')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'),
	'Residential')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Approx Age/Page_Chiragh - Sell Your Property/input_Property Approx. Age_pro'),
	' ')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Approx Age/Page_Chiragh - Sell Your Property/input_Property Approx. Age_pro'),
	'2 years')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Beds/Page_Chiragh - Sell Your Property/input_Bedrooms_noOfBedrooms'),
	' ')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Beds/Page_Chiragh - Sell Your Property/input_Bedrooms_noOfBedrooms'),
	'6')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Baths/Page_Chiragh - Sell Your Property/input_Bathrooms_noOfBaths'),
	' ')

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
	'')

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Description/Page_Chiragh - Sell Your Property/div_Description _ngx-editor-textarea'),
	'Villa for sale')

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'),
	5)

WebUI.uploadFile(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'),
	GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/SPA/SPA'),
	GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

//MORTGAGE//
WebUI.setText(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
	'Yes')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Number_mortgageNo'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Number_mortgageNo'),
	'3211111111')

WebUI.click(findTestObject('Sanity Test/SellProperty/object/Page_Chiragh - Sell Your Property/input_Mortgage Start Date_mortgageStartDate'))

WebUI.click(findTestObject('Sanity Test/SellProperty/calender/Page_Chiragh - Sell Your Property/span__owl-dt-control-button-arrow'))

WebUI.click(findTestObject('Sanity Test/SellProperty/calender/Page_Chiragh - Sell Your Property/span_2018'))

WebUI.click(findTestObject('Sanity Test/SellProperty/calender/Page_Chiragh - Sell Your Property/span_Apr'))

WebUI.click(findTestObject('Sanity Test/SellProperty/calender/Page_Chiragh - Sell Your Property/span_8'))

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Year_ng-star-inserted'),
	'3')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Year_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Month_ng-star-inserted'),
	'6')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Month_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Initial Amount (AED)_initialAmount'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Mortgage Initial Amount (AED)_initialAmount'),
	'200000')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Outstanding Amount (AED)_outstandingAmount'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Outstanding Amount (AED)_outstandingAmount'),
	'120000')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Monthly Mortgage Payment (AED)_monthlyMortgagePayment'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Monthly Mortgage Payment (AED)_monthlyMortgagePayment'),
	'80000')

WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
	5)

WebUI.setText(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
	'Ajman Bank')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Mortgage/Page_Chiragh - Sell Your Property/input_Financing Bank_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Mortgage/Mortgage Documents/Scanned NOC form'), 5)

WebUI.uploadFile(findTestObject('Property Submission(All Forms)/Mortgage/Mortgage Documents/Scanned NOC form'), GlobalVariable.fileUpload)

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
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Ejari Number_ejariNo'),
	'999992322')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Tenant Name_tenantName'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Tenant Name_tenantName'),
	'dev')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Annual Rent Amount (AED)_annualRent'),
	'')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Annual Rent Amount (AED)_annualRent'),
	' ')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Annual Rent Amount (AED)_annualRent'),
	'229990')

WebUI.setText(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Payment Structure_ng-star-inserted'),
	'3')

WebUI.sendKeys(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Payment Structure_ng-star-inserted'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Lease Start Date_leaseStartDate'))

WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

WebUI.click(findTestObject('Sanity Test/SellProperty/leaser Date/Page_Chiragh - Sell Your Property/span_2018'))

WebUI.click(findTestObject('Sanity Test/SellProperty/leaser Date/Page_Chiragh - Sell Your Property/span_Jun'))

WebUI.click(findTestObject('Sanity Test/SellProperty/leaser Date/Page_Chiragh - Sell Your Property/span_8'))

WebUI.click(findTestObject('Property Submission(All Forms)/Rent/Page_Chiragh - Sell Your Property/input_Lease End Date_leaseExpiryDate'))

WebUI.click(findTestObject('Sanity Test/SellProperty/expire 2/Page_Chiragh - Sell Your Property/span_23'))

WebUI.scrollToElement(findTestObject('Property Submission(All Forms)/Rent/Rental Document/Ejari Contract'), 5)

WebUI.uploadFile(findTestObject('Property Submission(All Forms)/Rent/Rental Document/Ejari Contract'), GlobalVariable.fileUpload)

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Sell Your Property/label_INDEPENDENT REAL ESTATE VALUATOR (FEE_558d3e'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Sell Your Property/h3_Knight Frank'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Sell Your Property/button_Pay Now'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Sell Your Property/p_Balance not sufficient'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Sell Your Property/p_Top Up Wallet'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/label_Select Payment Mode'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/input_Chiragh Wallet _amount'), 
    '1,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/select_Select Chiragh bankArab African Inte_8bf805'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/input_Transaction ID _transactionId'), 
    'yuioop')

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/div_Only numeric and alphanumeric values ar_f1eae8'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/input_Transaction ID _transactionId'), 
    'AGGHW45')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/UploadReceipt'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/label_I agree with Chiragh Wallet TC Read More'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/h3_TOP UP REQUEST SUBMITTED SUCCESSFULLY'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/p_Activity'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh - Transaction Top Up/a_Sell'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_/a_Pending'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh -Sell In Process/h4_Project Name 3 899'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertySubmitThroughSaveTopUp/Page_Chiragh -Sell In Process/article_PROPERTY ID 39604'))

WebUI.delay(5)

WebUI.closeBrowser()

