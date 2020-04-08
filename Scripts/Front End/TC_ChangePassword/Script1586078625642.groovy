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

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/input_Password_userPassword'), 
    GlobalVariable.passWord)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/button_Log In'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Dashborad Home/a_Profile'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/p_Contact Info'), 
    6)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/svg_Sharjah UAE_svg-inline--fa fa-eye fa-w-18'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_currentPassword'), 
    GlobalVariable.passWord)

//WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/svg_Sharjah UAE_svg-inline--fa fa-eye fa-w-18_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_userPassword'), 
    GlobalVariable.changePassword)

//WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/svg_Sharjah UAE_svg-inline--fa fa-eye fa-w-18_1'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/div_Password strength (Weak)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/input_Sharjah UAE_userconfirmPassword'), 
    GlobalVariable.changePassword)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/button_Change Password'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/div_Password Changed Successfully'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - User Profile/div_Ok'))

WebUI.closeBrowser()

