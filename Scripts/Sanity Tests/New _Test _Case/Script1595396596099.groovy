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

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Home/a_Register'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_First Name_userFirstName'), 
    'ahdjkadsjd')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Last Name_userlastName'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_First Name_userFirstName'), 
    'hasankalim')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Last Name_userlastName'), 
    'yahooo')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Email _userEmail'), 
    'hasanyahoo@')

WebUI.switchToWindowTitle('Chiragh - Register')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Email _userEmail'), 
    'hasanyahoo@')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_Add Inbox'))

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'), 
    'ahsanyahoo')

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'), 
    'ahsanyahoo')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/a_Accept'))

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_ahsanyahoogetnadacom'))

WebUI.switchToWindowTitle('Chiragh - Register')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Email _userEmail'), 
    'ahsanyahoo@getnada.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Password_userPassword'), 
    'v2N3KuMMU6jMOH53M/J9Eg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), 
    'v2N3KuMMU6jMOH53M/J9Eg==')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/button_Next'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Date of Birth_dob'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/span_9'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_Afghani'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Complete address _address'), 
    'ewrererff')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Complete address _address'), 
    'ewrererff')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_Afghanistan'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_Sharan'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_National ID'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_ID Number_idCardNo'), 
    '54654')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Complete address _address'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_ID Number_idCardNo'), 
    '546545656')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_ID Expiry Date_idExpiryDate'))

WebUI.rightClick(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_Refresh_cdk-overlay-backdrop cdk-overla_ff3373'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/span_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_ID Expiry Date_idExpiryDate'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_Refresh_cdk-overlay-backdrop cdk-overla_ff3373'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/div_(93) Afghanistan'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Mobile Number _mobileNo'), 
    '908547875')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/input_Phone Number_terms'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/button_Register'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Register/button_Proceed'))

WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_ahsanyahoogetnadacom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_ahsanyahoogetnadacom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_ahsanyahoogetnadacom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_jibuggetnadacom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/span_ahsanyahoogetnadacom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/div_Activate Your Chiragh Account'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/a_httptestchiraghcomactivateAccount06768942e6aac26f6c5a2df859a8d9294732'))

WebUI.switchToWindowTitle('Chiragh - Login')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Login/h1_Activate your Chiragh Account'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Chiragh - Login/p_Please enter One Time Password (OTP) sent_2d220d'))

WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/a_httptestchiraghcomactivateAccount06768942e6aac26f6c5a2df859a8d9294732'))

WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/a_httptestchiraghcomactivateAccount06768942e6aac26f6c5a2df859a8d9294732'))

WebUI.closeBrowser()

