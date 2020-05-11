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

WebUI.setText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'mumtazhassan')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_Assign Me'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/span_Yes'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_Start Now'))

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/span_Yes'))
WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_test mehwish 45678 sqft Land'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/img'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/button_Archive this lead'))

WebUI.setText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/div_Redo_ck ck-content ck-editor__editable _05d196'), 
    '<p style=""><br data-cke-filler="true"></p>')

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/mat-dialog-container_Type the remarks for a_09d184'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/p'))

WebUI.setText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/div_It will be sent to HOD'), 
    '<h2 style="">It will be sent to HOD</h2>')

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/span_Request Archive'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/span_Archive request has been sent to HOD'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/img_1'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/span_MH'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/button_exit_to_appLogout'))

WebUI.setText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/a_test mehwish 45678 sqft Land'))

WebUI.click(findTestObject('Object Repository/Admin/TC_ArchivedVerficationLeads/Page_Chiraghcom Admin/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/TC_ArchivedVerficationLeads/button/Page_Chiraghcom Admin/button_Move to Archive'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()

