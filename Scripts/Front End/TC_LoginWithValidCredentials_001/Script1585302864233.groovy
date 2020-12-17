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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(60)

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

def getText = WebUI.getText(findTestObject('Page_Chiragh - Home/a_Hi Usman Khan'))
println(getText);

WebUI.verifyMatch(getText, 'Auto Chiragh', true, FailureHandling.STOP_ON_FAILURE)
//WebUI.acceptAlert()

//String username = WebUI.getText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Dashborad Home/a_AUTOCHIRAGH'))
WebUI.delay(10)

//WebUI.verifyTextPresent(GlobalVariable.userName, true)
WebUI.closeBrowser()

