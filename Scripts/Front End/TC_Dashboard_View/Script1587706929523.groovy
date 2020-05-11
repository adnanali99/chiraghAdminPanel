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

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Login/input_Username_un'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Login/input_Username_un'), 
    'AUTOCHIRAGH')

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Dashborad Home/h2_Hi Auto Chiragh'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Dashborad Home/h6_Welcome to your Chiragh Dashboard'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Dashborad Home/a_Home'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Dashborad Home/a_Profile'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Profile/p_Personal Info'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Profile/p_Contact Info'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Profile/p_Activity'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Profile/a_Buy'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Open House/h4_Buy'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Open House/img'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Open House/a_Sell'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_/p_With Chiragh Wallet you can save payment _bfd46b'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_/h4_Sell'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_/a_My Wallet'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/h4_My Wallet'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/p_With Chiragh Wallet you can save payment _bfd46b'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/div_AEDCurrent Balance1536748000 Available _9e388c'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/div_USDCurrent Balance1507312100 Available _773f74'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/div_EURCurrent Balance1498263700 Available _aaae34'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/h1_Recent Transactions (EUR) View All'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/article_Disclaimer Chiragh cannot guarantee_58504f'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/img'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Transaction Top Up/div_Top Up  Account'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Dashboard view/Page_Chiragh - Transaction Top Up/div_Withdraw  Amount'))

WebUI.delay(3)

WebUI.closeBrowser()

