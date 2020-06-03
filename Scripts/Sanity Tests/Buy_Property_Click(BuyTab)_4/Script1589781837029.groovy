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

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Home/a_BUY'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/h1_We Build Trust'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/p_hundreds of registered users have placed _b9b8bc'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/h2_Current Auctions'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/h6_ACTIVE AUCTIONS IN PROCESS'),5)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/h5_Our Partners'),1)


//WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/p_Email Us'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_About Us'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_Our mission is to provide a user-friend_97e858'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_Quick Links'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_Newsletter'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_Dont miss a chance to get a best deal S_65e1a0'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_Contact'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_109-110 Building  6 Emaar Gold  Diamond_c60f27'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/div_971 4338 8823 Sunday to Thursday 900 am_906058'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Buy Property/img_ACTIVE AUCTIONS IN PROCESS_wow zoomIn'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyerPropertyTab/Page_Chiragh - Property Detail/b_230000 sqm'))

WebUI.closeBrowser()

