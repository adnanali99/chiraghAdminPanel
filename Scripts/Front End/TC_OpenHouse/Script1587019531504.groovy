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

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Login/input_Username_un'), 'chiraghcom')

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Login/button_Log In'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Home/h6_Active auctions in process'), 3)


WebUI.delay(2)

WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Home/button_Bid Now (1)'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Property Detail/a'))

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Property Detail/a'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Property Detail/a_Mon'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Property Detail/div_Apr 20 2020_chevrons'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Property Detail/a_Proceed'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/input_ID Card Number_idCardNo'), 
    '123456')

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/input_ID Card Expiry Date_idCardExpiration'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/span_Apr 2020_owl-dt-control-button-arrow'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/span_2030'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/span_Dec'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/span_28'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/button_Next'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/input_POA Status_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/div_No'))

WebUI.click(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Buy Property/button_Next'))

WebUI.closeBrowser()
