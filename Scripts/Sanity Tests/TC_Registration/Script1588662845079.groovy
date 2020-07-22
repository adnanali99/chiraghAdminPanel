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

//WebUI.navigateToUrl('https://chiragh:AeBcm%231t@test.chiragh.com')
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

//WebUI.setText(findTestObject('Page_Chiragh - Register/input_Username_0bdtue'), '3330-9')
//
//String errorUsername = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_Space and special character not Allowed'))
//
//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorUsername, 'Space and special character not Allowed!')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Page_Chiragh - Register/input_Username_0bdtue'), 'ahsan1234')
//
//WebUI.delay(2)
//
//String errorUsernameSecond = WebUI.getText(findTestObject('Sanity Test/registration/object/Page_Chiragh - Register/div_Username already Exist'))
//
//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorUsernameSecond, 'Username already Exist!')
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/input_Email _userEmail'), 
    '556666666.com')

//String errorEmail = WebUI.getText(findTestObject('Object Repository/Sanity Test/registration/Page_Chiragh - Register/div_Enter valid email address eg exampleemailcom'))
//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(errorEmail, 'Enter valid email address e.g \n example@email.com')
WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Password_userPassword'), '6666333')

WebUI.delay(7)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), '92828333')

WebUI.delay(6)

String fName = faker.name().firstName()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_First Name_userFirstName'), fName)

CustomKeywords.'com.sanitytest.com.Validation.isAlpha'(fName)

WebUI.delay(2)

String lName = faker.name().lastName()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Last Name_userlastName'), lName)

CustomKeywords.'com.sanitytest.com.Validation.isAlpha'(lName)

WebUI.delay(2)

//String userName = faker.name().firstName()
//
//WebUI.setText(findTestObject('Page_Chiragh - Register/input_Username_0bdtue'), userName)
//
//WebUI.delay(2)
String number = faker.number.randomNumber()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Email _userEmail'), ('testbcm112' + number) + '@getnada.com')
//WebUI.setText(findTestObject('Page_Chiragh - Register/input_Email _userEmail'), 'ahsanKali97' + '@getnada.com')

//CustomKeywords.'com.sanitytest.com.Validation.isEmail'(('testbcm11+' + number) + '@gmail.com')
WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Password_userPassword'), 'A123456s@')

WebUI.delay(7)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Confirm Password_userConfirmPassword'), 'A123456s@')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Chiragh - Register/button_Next'))

WebUI.waitForPageLoad(4)

WebUI.click(findTestObject('Page_Chiragh - Register/button_Register'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Sanity Test/registration/object3/Page_Chiragh - Register/h1_Welcome yuere iyeyrie'), 
    2)

WebUI.delay(5)

WebUI.click(findTestObject('Sanity Test/registration/Date/Page_Chiragh - Register/input_Date of Birth_dob'))

WebUI.click(findTestObject('Sanity Test/registration/birth/Page_Chiragh - Register/span_May 2020'))

WebUI.click(findTestObject('Sanity Test/registration/Date/Page_Chiragh - Register/span_2016'))

WebUI.click(findTestObject('Sanity Test/registration/Date/Page_Chiragh - Register/span_May'))

WebUI.click(findTestObject('Sanity Test/registration/Date/Page_Chiragh - Register/span_4'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/Nationality'), 'Pakis')

WebUI.click(findTestObject('Page_Chiragh - Register/ng-dropdown-panel_Pakistani'))

String Useraddress = faker.address.fullAddress()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Complete address _address'), Useraddress)

WebUI.delay(2)

String PObox = faker.address.zipCode()

WebUI.setText(findTestObject('Page_Chiragh - Register/input_POBox_poBox'), PObox)

WebUI.setText(findTestObject('Page_Chiragh - Register/Country'), 'Pakis')

WebUI.click(findTestObject('Page_Chiragh - Register/span_Pakistan'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Chiragh - Register/City'), 'Lahor')

WebUI.click(findTestObject('Page_Chiragh - Register/span_Lahore'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Identification Type_ng-star-inserted'), 'National')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Chiragh - Register/span_National ID'))

String IdCardNumber = faker.number().digits(10)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_ID Number_idCardNo'), IdCardNumber)

WebUI.click(findTestObject('Page_Chiragh - Register/input_ID Expiry Date_idExpiryDate'))

WebUI.click(findTestObject('Page_Chiragh - Register/span_Apr 2020'))

WebUI.click(findTestObject('Page_Chiragh - Register/span_2021'))

WebUI.click(findTestObject('Page_Chiragh - Register/span_Jan'))

WebUI.click(findTestObject('Page_Chiragh - Register/Jan1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Country Code_ng-star-inserted'), 'Pakis')

WebUI.click(findTestObject('Page_Chiragh - Register/span_(92) Pakistan'))

WebUI.setText(findTestObject('Page_Chiragh - Register/input_Mobile Number _mobileNo'), '03451200042')

WebUI.click(findTestObject('Page_Chiragh - Register/input_Phone Number_terms'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Chiragh - Register/button_Register'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Chiragh - Register/button_Proceed'))

WebUI.delay(5)

//implement the regisration 
String emailAccount = 'testbcm112' + number;
CustomKeywords.'com.sanitytest.com.registration.accountActivation'(emailAccount)

WebUI.delay(1)
////


WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

CustomKeywords.'com.chiragh.com.ChiraghOTP.generateOtp'('registration', '1' ,GlobalVariable.otpNo)

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(5)


////

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue1'),
	'1')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue2'),
	'2')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue3'),
	'3')

WebUI.setText(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/input_Enter Mobile OTP_otpValue4'),
	'4')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject2/Page_Chiragh - Login/button_Done'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Chiragh - Registration Confirmation/h1_Thank You  for Registering on Chiragh'), 
    'Thank You')
WebUI.closeBrowser()

