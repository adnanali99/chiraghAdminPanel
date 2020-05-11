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

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/OpenHouse/Page_Chiragh - Home/h6_Active auctions in process'), 1)

WebUI.delay(1)

//WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Home/h3_Emaar Square 990078 sqm Land'))


WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/a_PROPERTY DESCRIPTION'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/a_FEATURES'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/a_FACILITIES'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/a_NEIGHBOURHOODS'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/a_VALUATIONS'))


WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/h3_Emaar Square 990078 sqm Land'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/div_Property on Map_property-location-overlay'))

WebUI.click(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/h2_Similar Search Properties'))


WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/View Property Detail/Page_Chiragh - Property Detail/h5_Our Partners'),5)

WebUI.delay(5)

WebUI.closeBrowser()

