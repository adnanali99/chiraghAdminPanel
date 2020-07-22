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

//WebUI.executeJavaScript('window.open();', [])

//currentWindow = WebUI.getWindowIndex()

//Go in to new tab
//WebUI.switchToWindowIndex(currentWindow + 1)
WebUI.openBrowser('')

WebUI.navigateToUrl('http://test.chiragh.com/test-login')

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Username_un'), GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Password_userPassword'), GlobalVariable.passWord)

WebUI.click(findTestObject('Object Repository/CreateOTPLoginPage/Page_/button_Log In'))

WebUI.delay(6)

WebUI.setText(findTestObject('OTP_Creation/Page_/input_Transaction Type_un'), 'withdrawal')

WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Password_userPassword'), '2')

WebUI.setText(findTestObject('OTP_Creation/Page_/input_OTP_Create'), '1234')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CreateOTPLoginPage/Page_/button_Proceed'))

WebUI.delay(3)

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(2)

