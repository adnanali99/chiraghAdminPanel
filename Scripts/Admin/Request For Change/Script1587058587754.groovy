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

WebUI.openBrowser('')

WebUI.waitForPageLoad(40)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(8)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'arsalankhalid')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'),
	'c/4m4/rTvNs0iFiKg9IHPQ==')

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
	'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/th_Status'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Start Now'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/imgRFC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Request for change'))

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/i_First Name_fas fa-plus-circle text-success ng-star-inserted'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/input_Label  First Name_form-control form-input ng-untouched ng-dirty ng-invalid'), 'Ali')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Ok'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property Details'))

WebUI.scrollToElement(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/i_Garage_fas fa-plus-circle text-success ng-star-inserted'), 5)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/i_Garage_fas fa-plus-circle text-success ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/div_Label  Garden_mat-checkbox-inner-container'))
	
WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Ok'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Done'))

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_REQUEST NOW'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_MH'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/a_Wyman Dale 3 Floors Building'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/i_Approve'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Yes'))

WebUI.click(findTestObject('Object Repository/verification department/Page_Chiragh.com Admin/div_Property Details'))

WebUI.scrollToElement(findTestObject('Admin/Request For Change/user/Page_Chiraghcom Admin/span_Garden'), 7)

WebUI.click(findTestObject('Admin/Request For Change/user/Page_Chiraghcom Admin/i_GardenApprove'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Request For Change/user/Page_Chiraghcom Admin/button_Done'))

WebUI.delay(5)

WebUI.closeBrowser()

