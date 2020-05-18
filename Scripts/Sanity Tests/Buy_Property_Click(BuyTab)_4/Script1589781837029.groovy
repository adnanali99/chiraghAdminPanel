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

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Home/h1_Dubais Leading Online Real Estate Auction'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Home/p_Connecting Global Investment Community'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Home/a_BUY'))

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/p_hundreds of registered users have placed _b9b8bc'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/h1_We Build Trust'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/h2_Current Auctions'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/h6_ACTIVE AUCTIONS IN PROCESS'))

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/article_PROPERTY ID 39474'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/BuyTab/Page_Chiragh - Buy Property/h5_Our Partners'))

WebUI.delay(6)

WebUI.closeBrowser()

