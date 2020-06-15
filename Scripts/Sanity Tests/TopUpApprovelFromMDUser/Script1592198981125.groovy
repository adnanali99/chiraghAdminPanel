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

WebUI.navigateToUrl('http://test-admin-chiragh.surge.sh/login')

WebUI.delay(8)

WebUI.setText(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'kashif')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(8)

//WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/a_Assign Me'))
WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/a_Assign Me'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Yes'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Ok'))
WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Topups'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/a_Chiragh Real Estate Auctions_fas fa-bars _aebcba'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Verification'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Reject_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Chiragh account statement checked_mat-c_0d97f1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Transaction proof verified and matched__74a061'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Client details are verified_mat-checkbo_bac0e9'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Transaction ID matched with account sta_eb1118'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Yes'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Ok'))
WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/button_KJ'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Logout'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/input_Admin Panel_userName'), 
    'mandar')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/button_Login'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Topups'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/a_Chiragh Real Estate Auctions_fas fa-bars _aebcba_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/div_Reconciliation'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/button_Approve'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Yes'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Ok'))
WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_M'))

WebUI.click(findTestObject('Object Repository/Sanity Test/TopUpApprovelFromMDUser/Page_Chiraghcom Admin/span_Logout'))

WebUI.closeBrowser()

CustomKeywords.'com.sanitytest.com.AdminFinanceDeparment.financeDepartmentFlowOfTopUp'()

