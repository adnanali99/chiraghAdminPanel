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

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Login/button_Log In'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Login/button_Log In'))
WebUI.waitForPageLoad(15)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/h6_Active auctions in process'), 
    4)

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/img'))

WebUI.click(findTestObject('Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/div_Property has been added to your Watch List'))

String successMessage = WebUI.getText(findTestObject('Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/div_Property has been added to your Watch List'))

WebUI.verifyEqual(successMessage, 'Property has been added to your Watch List.')

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/div_Property has been added to your Watch List'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Home/b_HI'))

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Dashborad Home/b_Manage Activity'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Open House/a_Watch List'))

//WebUI.click(findTestObject('Object Repository/Front End Objects/RegisterUserAdd(WatchList)/Page_Chiragh - Watch List/article_PROPERTY ID 39026'))
WebUI.delay(4)

WebUI.closeBrowser()

