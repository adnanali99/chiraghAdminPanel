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

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Dashborad Home/b_Go to Wallet'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - User Account Summary/a_My Bank Accounts'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/svg_My Bank Accounts_svg-inline--fa fa-plus_86c403'))

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/label_Currency'),
	3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/select_Select CurrencyUSDAEDEUR'),
	'2', true)

//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
//	'@@@@@@@@')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_IBAN_accIbanNumber'),
//	'@@@@@@@0989')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account No_accountNumber'),
//	'8855@@@@@')
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/div_Account Name'))
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
//	'8855@@@@@')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Acct Holder Address_address'),
//	'@@889557766HHGHGGGHG')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Name_bankName'),
//	'8855@@@@@')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Branch Address_branchName'),
//	'@@@@@@@@$')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Swift Code_accSwiftCode'),
//	'###%%@@@9889U')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Name_corresponding_bf0020'),
//	'###%%@@@9889U')
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Swift Code_corresp_eefb27'),
//	'###%%@@@9889U')


WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
	'@@@@@@@@')

String accountName = WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Account Name is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(accountName)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(accountName, 'Account Name is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_IBAN_accIbanNumber'),
	'@@@@@@@0989')

String IbanNo = WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_IBAN is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(IbanNo)
CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(IbanNo, 'IBAN is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account No_accountNumber'),
	'8855@@@@@')

String accountNo = WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Account No is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(accountNo)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(accountNo, 'Account No is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
	'8855@@@@@')

String title= WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Account Name is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(title)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(title, 'Account Name is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Acct Holder Address_address'),
	'@@889557766HHGHGGGHG')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Name_bankName'),
	'8855@@@@@')

String bankName = WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Bank name is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(bankName)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(bankName, 'Bank name is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Branch Address_branchName'),
	'@@@@@@@@$')

String bankaddress = WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Bank Branch Address is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(bankaddress)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(bankaddress, 'Bank Branch Address is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Swift Code_accSwiftCode'),
	'###%%@@@9889U')

String swiftCode =  WebUI.getText(findTestObject('Sanity Test/MybankAccount/Page_Chiragh - My Bank Accounts/div_Swift code is not valid'))

//CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(swiftCode)
CustomKeywords.'com.sanitytest.com.HandleErrorMessage.verifyErrorMessage'(swiftCode, 'Swift code is not valid!')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Name_corresponding_bf0020'),
	'###%%@@@9889U')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Swift Code_corresp_eefb27'),
	'###%%@@@9889U')


WebUI.delay(6)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/select_Select CurrencyUSDAEDEUR'),
	'2', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
	'Sharjah Platinum')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_IBAN_accIbanNumber'),
	'647489347389')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account No_accountNumber'),
	'6376376373')

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/div_Account Name'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
	'Emirati Bank')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Acct Holder Address_address'),
	'Dubai Town')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Name_bankName'),
	'Emirati Platinum')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Branch Address_branchName'),
	'Dubai Town')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Swift Code_accSwiftCode'),
	'64637634')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Name_corresponding_bf0020'),
	'Dubai CB')

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Swift Code_corresp_eefb27'),
	'53635')

//WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/button_Send OTP'))


WebUI.delay(3)

WebUI.closeBrowser()