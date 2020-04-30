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

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_a month ago_dropdownMenuLink'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Dashborad Home/a_Profile'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/p_Contact Info'),
	6)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/svg_Sharjah UAE_svg-inline--fa fa-eye fa-w-18'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_currentPassword'),
	'233335555')


WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_userPassword'),
	'331113333')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_userconfirmPassword'),
	'233335555')

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/button_Change Password'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/div_Password Changed Successfully'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/div_Ok'))

WebUI.closeBrowser()
