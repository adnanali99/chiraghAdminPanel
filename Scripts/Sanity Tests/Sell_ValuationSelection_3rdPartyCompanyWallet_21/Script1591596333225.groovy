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

//wallet amount deduction //
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.delay(5)

String amountOfWalletBefore = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/span_111048781000'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(amountOfWalletBefore)

WebUI.delay(5)

WebUI.navigateToUrl(GlobalVariable.SellerPropertyUrl)

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

WebUI.uploadFile(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/div_Scanned ID Copy  (UAE or c'), 
    GlobalVariable.fileUpload)

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

WebUI.uploadFile(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'), 
    GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/SPA/SPA'), 
    GlobalVariable.fileUpload)

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

//valuation 3rd Party//

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/label_INDEPENDENT REAL ESTATE VALUATOR (FEE_558d3e'))

String url = WebUI.getUrl()

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(url)

String urlNumber = url.substring(url.length() - 5);

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(urlNumber)

WebUI.delay(3)


WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/h3_Savills'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/h3_Knight Frank'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/button_Pay Now'))

//actually 
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/label_I agree with Chiragh wallet terms and_4a56ad'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/PropertyValuation/Page_Chiragh - Sell Your Property/h3_Thank You'))

WebUI.delay(10)

// verify the WalletPayment
WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.delay(5)

String afterPaymentPropertyThenWalletAmount = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/span_111048781000'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(afterPaymentPropertyThenWalletAmount)

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/h1_Recent Transactions (AED) View All'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/td_third party valuation fee'))

WebUI.delay(3)

String transaction = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/td_200000'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(transaction)

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/h5_111060864000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/a_View All'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/th_Property ID'))

WebUI.delay(5)

String propertyId = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/td_39642'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(propertyId)

WebUI.delay(3)

String amountOfWalletAfter = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/td_200000 Approved'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(amountOfWalletAfter)

WebUI.delay(5)

CustomKeywords.'com.chiragh.com.ChiraghOTP.verifyTransferAmount'(amountOfWalletBefore, amountOfWalletAfter)

WebUI.closeBrowser()