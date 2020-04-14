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

CustomKeywords.'com.chiragh.com.PropertySubmit.submitForm'('no' , GlobalVariable.emptyWalletUser )


WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/label_INDEPENDENT REAL ESTATE VALUATOR (FEE_558d3e'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/h3_Knight Frank'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/button_Pay Now'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/input_POA Status_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/p_AED 000'))

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/ObjectCreated/Page_Chiragh - Sell Your Property/div_Select CurrencyUSD'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/span_USD'))
//
//WebUI.delay(1)


WebUI.check(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/ObjectCreated/Page_Chiragh - Sell Your Property/div_I agree with Chiragh wallet terms and conditions  (Read More)'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/p_Balance not sufficient'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/button_Save  submit later'))

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/p_Saving property details'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/SaveAndSubmitLater/Page_Chiragh - Sell Your Property/h4_Your property details are saved'))

