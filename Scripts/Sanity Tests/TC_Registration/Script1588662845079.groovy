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

Faker faker = new Faker()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Login/a_Register'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/input_First Name_userFirstName'), 
    '22222')

String errorMessage = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_First Name is not valid'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorMessage, 'First Name is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/input_Last Name_userlastName'), 
    '333333')

String errorLastName = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_Last Name is not valid'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorLastName, 'Last Name is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Username_0bdtue'), '3330-9')

String errorUsername = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_Space and special character not Allowed'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorUsername, 'Space and special character not Allowed!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/input_Email _userEmail'), 
    '556666666.com')

String errorEmail = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_Enter valid email address eg exampleemailcom'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorEmail, 'Enter valid email address e.g \n example@email.com')
WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Password_userPassword'), 'A123456s@')

WebUI.delay(7)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), 'A123456s@')

WebUI.delay(6)

String fName = faker.name().firstName()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_First Name_userFirstName'), fName)

CustomKeywords.'com.sanitytest.com.Validation.isAlpha'(fName)

WebUI.delay(2)

String lName = faker.name().lastName()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Last Name_userlastName'), lName)

CustomKeywords.'com.sanitytest.com.Validation.isAlpha'(lName)

WebUI.delay(2)

String userName = faker.name().firstName()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Username_0bdtue'), userName)

WebUI.delay(2)

String number = faker.number.randomNumber()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Email _userEmail'), ('testbcm11+' + number) + '@gmail.com')

CustomKeywords.'com.sanitytest.com.Validation.isEmail'(('testbcm11+' + number) + '@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Password_userPassword'), 'A123456s@')

WebUI.delay(7)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), 'A123456s@')

WebUI.delay(2)

//WebUI.click(findTestObject('Page_Chiragh - Register/button_Next'))
WebUI.closeBrowser()

