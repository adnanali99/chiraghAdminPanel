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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://test.chiragh.com/')
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Home/a_Login'))
//
//WebUI.setText(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Login/input_Username_un'), 
//    'AUTOCHIRAGH')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Login/input_Password_userPassword'), 
//    'RigbBhfdqOBDK95asqKeHw==')
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Login/button_Log In'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Home/h2_Current Auctions'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Home/button_Bid Now'))

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Username_un'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/button_Log In'))

WebUI.waitForPageLoad(15)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'),
	2)

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/button_Bid Now'))

WebUI.delay(8)


WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_AED_ng-input'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_USD'))

WebUI.delay(2)


WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/small_(Approx USD 4165420)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_USD_ng-input'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_EUR'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/small_(Approx EUR 3854239)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_EUR_ng-input'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/span_AED'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_AED_ng-input_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChangeInCurrencyData/Page_Chiragh - Property Detail/div_AED'))

WebUI.closeBrowser()

