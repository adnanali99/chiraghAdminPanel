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

WebUI.navigateToUrl('http://test.chiragh.com/')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Home/a_Register'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_First Name_userFirstName'), 
    'ahsan')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Last Name_userlastName'), 
    'kalim')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Email _userEmail'), 
    'ahsanali1@getnada.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Password_userPassword'), 
    'v2N3KuMMU6jMOH53M/J9Eg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), 
    'v2N3KuMMU6jMOH53M/J9Eg==')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/button_Next'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Date of Birth_dob'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/span_8'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/div_Afghani'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Complete address _address'), 
    '12323')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Complete address _address'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Complete address _address'), 
    '12323')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/span_Afghanistan'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/div_Sharan'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/div_National ID'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_ID Number_idCardNo'), 
    '13133233')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_ID Expiry Date_idExpiryDate'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/span_25'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input'), 'pa')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/span_(92) Pakistan'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Mobile Number _mobileNo'), 
    '3374840966')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/input_Phone Number_terms'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/button_Register'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Register/button_Proceed'))

WebUI.switchToWindowTitle('getnada - Google Search')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_getnada - Google Search/h3_Nada - temp mail - fast and free'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/span_Add Inbox'))

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'), 
    'ahsanali1')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/a_Accept'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/div_Activate Your Chiragh Account'))

WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Nada - temp mail - fast and free/a_httptestchiraghcomactivateAccountc6bce80b87606df216dcf5fe67fdfba53480'))

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue1'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue2'), 
    'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue3'), 
    'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue4'), 
    'abkeNdhXnEA=')





WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue1'), 
    '0mP41y2AN8w=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue2'), 
    'FkW8c3ilUpA=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue3'), 
    'EZJce3R/zYw=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue4'), 
    '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue3'), 
    '4zGPQDZ5VqE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue4'), 
    'EZJce3R/zYw=')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/button_Done'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/div_Your account has been successfully acti_88eb80'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/div_Your account has been successfully acti_88eb80'))

