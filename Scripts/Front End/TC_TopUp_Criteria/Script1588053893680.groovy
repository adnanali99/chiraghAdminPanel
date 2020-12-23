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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://test.chiragh.com/')
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Home/a_Login'))
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Login/input_Username_un'), 
//    'AUTOCHIRAGH')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Login/input_Password_userPassword'), 
//    'RigbBhfdqOBDK95asqKeHw==')
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Login/button_Log In'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Home/a_HI AutoChiragh'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Dashborad Home/b_Go to Wallet'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - User Account Summary/a_Make a Transaction'))

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

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Dashborad Home/a_My Wallet'))

WebUI.click(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - User Account Summary/a_Make a Transaction'))

WebUI.delay(3)


WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/label_Select Payment Mode'))

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/div_Select Payment Mode  Bank TransferBank _1a2230'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Chiragh Wallet _amount'), 
    '1,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_Select Chiragh bankArab African Inte_8bf805'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Transaction ID _transactionId'), 
    '2252555')

WebUI.uploadFile(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/UploadReceipt'), GlobalVariable.fileUpload22)

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/label_I agree with Chiragh Wallet TC Read More'))

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/h3_TOP UP REQUEST SUBMITTED SUCCESSFULLY'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/label_Select Payment Mode'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_Bank TransferBank Transfer'), 
    'Bank Transfer', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Chiragh Wallet _amount'), 
    '1,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_USD AED EUR'), 
    'USD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_Select Chiragh bankArab African Inte_4c2284'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Transaction ID _transactionId'), 
    '25874125')

WebUI.uploadFile(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/UploadReceipt'), GlobalVariable.fileUpload22)

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/label_I agree with Chiragh Wallet TC Read More'))

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/h3_TOP UP REQUEST SUBMITTED SUCCESSFULLY'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_Bank TransferBank Transfer'), 
    'Bank Transfer', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Chiragh Wallet _amount'), 
    '1,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_USD AED EUR'), 
    'EUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/select_Select Chiragh bankArab African Inte_fa52c4'), 
    '102', true)

WebUI.setText(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/input_Transaction ID _transactionId'), 
    '111111')

WebUI.uploadFile(findTestObject('Front End Objects/TopUp(AED)/Page_Chiragh - Transaction Top Up/UploadReceipt'), GlobalVariable.fileUpload22)

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/label_I agree with Chiragh Wallet TC Read More'))

WebUI.click(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/button_SEND REQUEST'))

//WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/TopUpCriteria/Page_Chiragh - Transaction Top Up/div_CANCEL  SEND REQUEST'))

WebUI.delay(2)

WebUI.closeBrowser()

