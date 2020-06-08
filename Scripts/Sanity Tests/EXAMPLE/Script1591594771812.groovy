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

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Login/input_Username_un'), 
    'AUTOCHIRAGH')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.delay(5)

String amountOfWallet = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/span_111048781000'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(amountOfWallet)

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/h1_Recent Transactions (AED) View All'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/td_third party valuation fee'))

WebUI.delay(3)

String transaction  = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/td_200000'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(transaction)

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/h5_111060864000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - User Account Summary/a_View All'))

WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/th_Property ID'))

WebUI.delay(5)

String propertyId = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/td_39642'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(propertyId)

WebUI.delay(3)

String VerifyTransaction = WebUI.getText(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/td_200000 Approved'))

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(VerifyTransaction)

//WebUI.click(findTestObject('Object Repository/Sanity Test/walletVerification/Page_Chiragh - Transaction Detail Summary/td_third party valuation fee'))

WebUI.closeBrowser()

