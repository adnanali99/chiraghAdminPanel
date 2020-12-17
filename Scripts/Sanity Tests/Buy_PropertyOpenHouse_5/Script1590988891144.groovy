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

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Username_un'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Username_un'),
	GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/SellProperty/Page_Chiragh - Login/button_Log In'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/h2_Current Auctions'),
	2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/h3_Hayley Ridges 6 Beds Villa'))

/// start verify openHouse ///
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/a'), FailureHandling.OPTIONAL)

WebUI.delay(3)

String openHouseFirst = WebUI.getText(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/h1_OPEN HOUSE'),
	FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.OpenHouse.verifyOpenHousePopup'(openHouseFirst)

/// end verify openHouse ///
WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/h6_Active auctions in process'),
	2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/button_Bid Now'))

/// start verify openHouse ///
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/a'), FailureHandling.OPTIONAL)

WebUI.delay(3)

String openHouseSecond = WebUI.getText(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/h1_OPEN HOUSE'),
	FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.OpenHouse.verifyOpenHousePopup'(openHouseSecond)

/// end verify openHouse ///
WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/h6_PROPERTY ID 39651'),
	1)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Home/h3_Bergnaum Square'))

/// start verify openHouse ///
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/a'), FailureHandling.OPTIONAL)

WebUI.delay(3)

String openHouseThird = WebUI.getText(findTestObject('Object Repository/Sanity Test/openHouseSample/Page_Chiragh - Property Detail/h1_OPEN HOUSE'),
	FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.OpenHouse.verifyOpenHousePopup'(openHouseThird)

/// end verify openHouse ///

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.delay(8)

WebUI.closeBrowser()



