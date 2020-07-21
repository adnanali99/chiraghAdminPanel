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

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Login/input_Username_un'), 
    'chiragh1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Login/input_Password_userPassword'), 
    'H/aFGQTy4lw=')

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Login/a_Forgot Password'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Forget Password/input_Follow instructions mentioned in the _98cc19'), 
    'chiragh@getnada.com')

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Forget Password/button_Submit'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Chiragh - Forget Password/div_EMAIL SENT SUCCESSFULLY'))

WebUI.navigateToUrl('https://getnada.com/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/nav_Temp InboxeslelukgetnadacomAdd Inbox'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/span_Add Inbox'))

WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'), 
    'chiragh')

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/a_Accept'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/div_Chiragh Reset Password At Mon Apr 06 07_2f7f77'))

WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/a_Reset Password'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_/input_Enter New Password_userPassword'), 
    GlobalVariable.passWord)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_/input_Confirm New Password_userconfirmPassword'), 
    GlobalVariable.passWord)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_/button_Reset Password'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_/h4_Password Reset Successfully'))

WebUI.delay(2)

WebUI.closeBrowser()

