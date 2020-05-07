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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://test.chiragh.com/')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Username_un'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Username_un'), 'ahsan1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_SELL'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/h5_Personal Detail'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/label_First Name'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_First Name_firstName'), 
    '')

String errorFirstName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_First name is required'))


WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Middle Name_middleName'), 
    '22')


String errorMiddleName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorMiddleName, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_First Name_firstName'), 
    '333')

String errorFirstNameSec = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorFirstNameSec, 'Special character not allowed.')

WebUI.delay(2)


WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Last Name_lastName'), 
    '')


String lastName = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Last name is required'))


WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Last Name_lastName'), 
    '333')

String lastNameSec = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(lastNameSec, 'Special character not allowed.')

WebUI.delay(2)


WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'), 
    '')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Passport number is required'))

String lastNameCh = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Special character not allowed'))


CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(lastNameCh, 'Special character not allowed.')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'), 
    'vvv')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'), 
    'r')

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'), 
    '')

String mobileNumber = WebUI.getText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/p_Mobile Number is required'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Sell Your Property/input_Mobile Number_mobileNo'), 
    '55555')

WebUI.closeBrowser()

