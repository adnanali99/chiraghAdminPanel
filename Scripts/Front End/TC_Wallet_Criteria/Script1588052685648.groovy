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

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/button_Log In'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - User Account Summary/div_AEDCurrent Balance1536748000 Available _9e388c'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - User Account Summary/div_USDCurrent Balance1507312100 Available _773f74'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - User Account Summary/div_EURCurrent Balance1498263700 Available _aaae34'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - User Account Summary/h1_Recent Transactions (EUR) View All'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Top Up/label_Select Payment Mode'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Top Up/div_Withdraw  Amount'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Withdraw Your Money/label_Chiragh Wallet Account'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Withdraw Your Money/div_Transfer  Amount'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transfer Your Money/label_From Account'))


WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transfer Your Money/a_Transaction Details'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/th_Property ID'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/th_Transaction ID'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/th_Description'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/th_Account Title'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/th_Amount'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Transaction Detail Summary/a_My Bank Accounts'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - My Bank Accounts/h1_My Bank Accounts'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - My Bank Accounts/svg_My Bank Accounts_svg-inline--fa fa-plus_86c403'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - My Bank Accounts/a_Chiragh Accounts'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Chiragh Bank Accounts/h6_Chiragh Accounts'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Chiragh Bank Accounts/div_Currency'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Chiragh Bank Accounts/div_Currency'))

WebUI.click(findTestObject('Object Repository/Front End Objects/walletcriteria/Page_Chiragh - Chiragh Bank Accounts/h4_My Wallet'))

WebUI.closeBrowser()

