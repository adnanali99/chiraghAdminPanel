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


CustomKeywords.'com.chiragh.com.PropertySubmit.submitForm'(GlobalVariable.propertySubmissionCredit)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/h5_Property Valuation'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/h5_Property Valuation'))

String url = WebUI.getUrl()

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(url)

String urlNumber = url.substring(url.length() - 5);

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(urlNumber)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/label_Please select independent real estate_9689df'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/label_INDEPENDENT REAL ESTATE VALUATOR (FEE_558d3e'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/div_Knight Frank AED 200000TC AppliesA resi_311f8a'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/button_Pay Now'))


WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/a_Pay with DebitCredit Card'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/label_I agree with Chiragh wallet terms and_4a56ad'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/button_Proceed with Payment'))

WebUI.switchToWindowTitle('PayTabs - Simple & Trusted Payments')

WebUI.delay(2)


WebUI.setText(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/input_Error_cc_number'), 
    '4111111111111111')

WebUI.setText(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/input_Error_cvv'), 
    '111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/select_Expiry Month                        _bea8c8'), 
    '09', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/input_Error_cvv'), 
    '1112')

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/select_Year                                _26701a'), 
    '31', true)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/button_Pay Now'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/select_Choose CountryABW  297AFG  93AGO  24_354bc8'), 
    '92', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/input_Edit Shipping Information_email'), 
    'ahsan@bestercapitalmedia.com')

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_PayTabs - Simple  Trusted Payments/button_Pay Now'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/a_Your property has been submitted successf_cf338b'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Sell Your Property/a_HI AUTOCHIRAGH'))


WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Dashborad Home/b_Manage Activity'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Open House/p_Activity'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_Chiragh - Open House/a_Sell'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_/article_PROPERTY ID 39358'))

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_/article_PROPERTY ID 39358'))

String propertyId = WebUI.getText(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_/article_PROPERTY ID 39358'))

//CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(propertyId)

WebUI.delay(2)

WebUI.verifyEqual(propertyId, urlNumber)

WebUI.click(findTestObject('Object Repository/Front End Objects/PropertySubmissionCreditCard/Page_/article_PROPERTY ID 39358'))

