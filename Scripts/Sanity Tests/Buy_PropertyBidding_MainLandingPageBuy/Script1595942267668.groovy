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

WebUI.verifyElementPresent(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img'),5)



WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/svg_Guest_svg-inline--fa fa-user fa-w-16'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))


WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h1_Dubais Leading Online Real Estate Auction'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Connecting Global Investment Community'))



WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Dubai Land Dept Regulated'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Verified Properties'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Third Party Valuation'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Transparent Bidding'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Open House Facility'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_Active auctions in process'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_PROPERTY ID 38965'))


WebUI.closeBrowser()