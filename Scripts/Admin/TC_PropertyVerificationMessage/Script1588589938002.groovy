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

WebUI.waitForPageLoad(40)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'faisalzaidi')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/a_My Leads'))

//WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/a_Mehwish test company  456789 sqft Land_fa_4137a8'))
//
//WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/a_Mehwish test company  456789 sqft Land_fa_4137a8'))

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/p'))

WebUI.setText(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/div_Bulleted List_ck ck-content ck-editor___fbd255'), 
    '<p style=""><br data-cke-filler="true"></p>')

WebUI.setText(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/div_hello'), '<p style="">hello</p>')

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/button_SEND'))

WebUI.click(findTestObject('Object Repository/Admin/propertyMessage/Page_Chiraghcom Admin/span_Your message has been sent successfully'))

WebUI.closeBrowser()

