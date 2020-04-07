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

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Login/button_Log In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - User Account Summary/a_My Bank Accounts'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/th_BankBranch'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'), 
    'AED764763476')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_IBAN_accIbanNumber'), 
    '647634783478')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Account No_accountNumber'), 
    '12111111AED')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Acct Holder Address_address'), 
    'Dubai Bank Town')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Bank Branch Address_branchName'), 
    'DubaiTown')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Swift Code_accSwiftCode'), 
    '1232334')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Name_corresponding_bf0020'), 
    'Dubai CB')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Swift Code_corresp_eefb27'), 
    '738364')

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/button_Send OTP'))

WebUI.delay(2)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Go in to new tab
WebUI.switchToWindowIndex(currentWindow + 1)

CustomKeywords.'com.chiragh.com.ChiraghOTP.generateOtp'('myaccounts', '2')

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/label_SMS OTP'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_SMS OTP_smsOtp'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/input_EMAIL OTP_emailOtp'), 
    '1234')

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Update)/Page_Chiragh - My Bank Accounts/button_Proceed'))

WebUI.delay(4)

WebUI.closeBrowser()

