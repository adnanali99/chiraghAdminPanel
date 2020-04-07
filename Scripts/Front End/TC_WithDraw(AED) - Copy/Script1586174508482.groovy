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

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Home/a_Login'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Login/input_Password_userPassword'), 
    GlobalVariable.passWord)

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Transaction Top Up/h6_Withdraw'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/label_Chiragh Wallet Account'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/select_Select your bank Dubai Bank AED'), 
    '112', true)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/label_Amount'), 
    3)

WebUI.setText(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/input_Amount _amount'), 
    '1,234')

WebUI.click(findTestObject('Object Repository/Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/button_SEND OTP'))

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

CustomKeywords.'com.chiragh.com.ChiraghOTP.generateOtp'('withdrawal', '2')

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(2)

WebUI.click(findTestObject('Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/label_I agree with Chiragh Wallet TC Read More'))

//WebUI.switchToDefaultContent()
WebUI.setText(findTestObject('Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/input_SMS OTP _smsOtp'), 
    '1234')

WebUI.delay(2)

WebUI.setText(findTestObject('Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/input_EMAIL OTP _emailOtp'), 
    '1234')

WebUI.click(findTestObject('Front End Objects/WithDraw(AED)/Page_Chiragh - Withdraw Your Money/button_SEND REQUEST'))

WebUI.delay(2)

WebUI.closeBrowser()

