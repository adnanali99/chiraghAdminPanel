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


WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'),
	2)

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Home/h2_Current Auctions'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Home/h6_Active auctions in process'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Home/button_Register Now'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Login/h1_Log In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Login/img'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'),
	2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Home/h3_Volante Tower  3 Beds Apartment'),FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Property Detail/h3_BID NOW'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Property Detail/div_Log InOR Register'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Property Detail/a_Register'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBidingRegistration/Page_Chiragh - Register/h1_Register'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.closeBrowser()
