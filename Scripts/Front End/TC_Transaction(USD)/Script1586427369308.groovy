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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Login/input_Username_un'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_111069888000'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_134138880000'))

///////

String USD = WebUI.getText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_134138880000'))

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(USD)

WebUI.delay(1)

///


///////

WebUI.delay(1)

String EUR = WebUI.getText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_343006'))

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(EUR)

WebUI.delay(1)

///

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_343006'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transaction Top Up/h6_Transfer'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/label_From Account'),
	3)

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/label_From Account'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/select_Select Currency USD AED EUR'),
	'1', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/input_Transferred Amount _amount'),
	GlobalVariable.transferAmount)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/select_Select Currency USD EUR'),
	'3', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/p_AED 1  USD 0272254 (approx)'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/label_I agree with Chiragh Wallet TC Read More'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/button_SEND OTP'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/h3_OTP has been sent to your registered ema_cef8f6'))

WebUI.delay(1)
////


WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

CustomKeywords.'com.chiragh.com.ChiraghOTP.generateOtp'('transfer', '1',  GlobalVariable.otpNo)

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(1)


////

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/input_SMS OTP _smsOtp'), 2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/input_SMS OTP _smsOtp'),
	GlobalVariable.otpNo)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/input_EMAIL OTP _emailOtp'),
	GlobalVariable.otpNo)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/button_proceed'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transfer Your Money/a_Transaction Details'))

//WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transaction Detail Summary/td_250958 approved'))

///////

WebUI.delay(2)

String tdAmount = WebUI.getText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transaction Detail Summary/td_250958 approved'))

CustomKeywords.'com.chiragh.com.ChiraghOTP.verifyTransferAmount'(GlobalVariable.transferAmount , tdAmount)

WebUI.delay(1)

//WebUI.verifyEqual(GlobalVariable.transferAmount, tdAmount)

WebUI.delay(1)

///

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - Transaction Detail Summary/a_Account Summary'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_111059891000'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_134141594000'))

///////

WebUI.delay(1)

String USDAfter = WebUI.getText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_134138880000'))

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(USDAfter)

WebUI.delay(1)

///

WebUI.delay(1)

String EURAfter = WebUI.getText(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/span_343006'))

CustomKeywords.'com.chiragh.com.ChiraghOTP.checkBalance'(EURAfter)

WebUI.delay(2)

///


WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/a'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Transaction(AED)/Page_Chiragh - User Account Summary/a_Logout'))

