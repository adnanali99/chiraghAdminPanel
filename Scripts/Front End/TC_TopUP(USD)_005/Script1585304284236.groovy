import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Username_un'),
	'AUTOCHIRAGH')

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/button_Log In'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_a month ago_dropdownMenuLink'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Dashborad Home/a_My Wallet'))

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.delay(3)

WebUI.setText(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/input_Chiragh Wallet _amount'),
	'1000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/select_USD AED EUR'))

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/currency_USD'))

WebUI.delay(5)

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/select_ChiraghBank'))

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/BankOption1'))

WebUI.setText(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/input_Transaction ID _transact'),
	'676767')

WebUI.uploadFile(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/UploadReceipt'), 'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/checkbox'), 5)

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/div_I agree with Chiragh Walle'))

WebUI.delay(2)

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/div_TOP UP REQUEST SUBMITTED S'),
	3)

WebUI.closeBrowser()
