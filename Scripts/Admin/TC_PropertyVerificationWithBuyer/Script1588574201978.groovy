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

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Buyer'))

WebUI.delay(12)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Ajman_fas fa-user-circle dropdown-link'))

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))
WebUI.click(findTestObject('Admin/BuyerVerificationflow/assignLead/Page_Chiraghcom Admin/i_Mumtaz Hassan (14)_fas fa-user-circle mr-2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/span_AK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.setText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'mumtazhassan')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Buyer_1'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_My Leads'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Start Now'))

WebUI.delay(9)

WebUI.click(findTestObject('Admin/BuyerVerificationflow/verificationUer/Page_Chiraghcom Admin/span_Yes'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Warehouse Ajman 324470 sqm Warehouse'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Attorneys'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Check List'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Check List_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Made an acknowledgment call_mat-checkbo_06f31e'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Personal details are verified_mat-check_753cc8'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Confirm'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/span_Ok'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/span_MH'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/span_Logout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Admin Panel_userName'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Admin Panel_userName'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Buyer'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/a_Warehouse Ajman 324470 sqm Warehouse'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Attorneys'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Approve'))

WebUI.click(findTestObject('Object Repository/Admin/BuyerVerificationflow/Page_Chiraghcom Admin/button_Yes'))

WebUI.closeBrowser()

