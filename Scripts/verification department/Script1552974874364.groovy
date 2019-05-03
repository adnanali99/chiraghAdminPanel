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

WebUI.waitForPageLoad(8)

WebUI.navigateToUrl('http://admin-chiragh.surge.sh/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'arsalankhalid')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Mumtaz Hassan (30)'))

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/span_Are you sure you want to'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_AK'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'mumtazhassan')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/th_Status'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Start Now'))

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/snack-bar-container_Are you su_1'))

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/span_Are you sure you want to _1'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Owners'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_POAs'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_POAs_1'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property Details'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Mortgage'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Mortgage_1'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Rental'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Verify'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property details are verif'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Confirm'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_MH'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'arsalankhalid')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Approve'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/snack-bar-container_Are you su_2'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/span_Are you sure you want to _2'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Approved Leads'))

WebUI.closeBrowser()
