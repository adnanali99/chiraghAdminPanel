import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Admin Panel_userName'), 'sami')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Username_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_ 7 Days_fas fa-user-circle d'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Hamza Attiq'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_In Process'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_S'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Admin Panel_userName'), 'hamza')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Username_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Marina Studio 312 sqft Studi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Listing Specifications'))

WebUI.delay(3)

def title = WebUI.getText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Property Title_title'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Property Title_title'), title+ '!!!')

def description = WebUI.getText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Marina Studio 312 sqft Stu'))

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Marina Studio 312 sqft Stu'),  description+ 'for Sale!!!')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Property TitleProperty Des'))

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Minimum Subsequent Bid_b'), '2000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Reserve Price_mat-checkbox'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Owners'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/a_Golf Grove Townhouse 8 Beds'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Gallery'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Gallery'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/i_Mark Main_fas fa-eye-slash1'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/i_Mark Main_fas fa-circle1'))

//WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Mark Main1'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/i_Mark Main_fas fa-eye-slash2'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/i_Mark Main_fas fa-eye-slash3'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/i_Images_fas fa-eye-slash4'))

//WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Marina Studio 312 sqft Studi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Listing Specifications'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Save listing Specificat'))

//WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/span_List specifications have'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Confirm'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_HA'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Admin Panel_userName'), 'sami')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Password'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Password'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/input_Username_password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Marina Studio 312 sqft Studi'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Listing Specifications'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Approve'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_Yes'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/a_Approved Leads'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_S'))

WebUI.click(findTestObject('Object Repository/listing/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.closeBrowser()


