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

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Login/input_Username_un'), 'ahsan1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/img_Auction Deposit_w-100'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/a_PKR'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/div_(PKR) currency wallet has been added to_aafb00'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Transaction Top Up/p_Amount'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Withdraw Your Money/h6_Transfer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Transfer Your Money/select_Select Currency USD AED EUR SAR INR _8c80d4'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Transfer Your Money/div_Hi Ahsan Kalim Welcome to your Chiragh _919967'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - Transfer Your Money/a_Account Summary'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/h6_PKR'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/h4_Current Balance'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/h5_000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/em_Available Balance'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/span_000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/em_Available Balance'))

WebUI.click(findTestObject('Object Repository/Sanity Test/addNewCurrency/Page_Chiragh - User Account Summary/h5_000'))

WebUI.closeBrowser()

