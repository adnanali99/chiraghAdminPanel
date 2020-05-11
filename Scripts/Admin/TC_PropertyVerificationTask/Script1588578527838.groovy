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

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'mumtazhassan')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(12)

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/a_test mehwish 45678 sqft Land'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/img'))

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/button_Create a Task'))

WebUI.setText(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/textarea_New Task_task'), 
    'hello its automated scripts task')

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/i_Select task purpose_fas fa-sort-down'))

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/a_Call'))

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/button_SAVE'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/span_Task has been created successfully'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Admin/verificationPropertyTask/Page_Chiraghcom Admin/img_1'))

WebUI.closeBrowser()

