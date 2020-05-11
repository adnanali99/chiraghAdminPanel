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

WebUI.waitForPageLoad(50)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 'farhanm')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'), 'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.delay(10)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Abdullah M'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'haleemhanif')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_a day ago_fas fa-user-circle'))

WebUI.click(findTestObject('valuation department/Page_Chiragh.com Admin/a_Chrystal Dsouza'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_HH'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'Hassan')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/i_Schedule Appointment_fas fa-'))

WebUI.delay(3)

WebUI.setText(findTestObject('valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/input_Schedule an Onsite Visit_title'), 
    'Onsite Visit')

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/textarea_Schedule an Onsite Vi'), 
    'Onsite Visit ')

WebUI.click(findTestObject('valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/i_Schedule an Onsite Visit_fas fa-calendar-alt'))

//WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Help_cdk-overlay-backdrop'))
/*WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Mar 2019'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_2019'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Dec'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_30'))*/
//WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_20'))
//WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Sat_owl-dt-timer-input'), 
//    '11')
//WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Hour_owl-dt-timer-input'), 
//    '00')
WebUI.delay(4)

WebUI.click(findTestObject('valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/span_Set'))

WebUI.delay(4)

WebUI.doubleClick(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_SAVE'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/img1'))

WebUI.delay(3)

WebUI.click(findTestObject('valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/button_HR'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.setText(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'abdullah')

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/a_In Valuation'))

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/a_Chiragh  Knight Frank_fas fa'))

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/a_Confirm'))

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/button_AM'))

WebUI.click(findTestObject('Object Repository/valuation department/brokerage valuation meeting/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'Hassan')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel_fas fa-ba_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Valuation_1'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Valuation_1'))

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Chiragh Valuation Report'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Market Analysis Report'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Gallery/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Gallery'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Gallery'))

WebUI.delay(8)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Gallery/Page_Chiragh.com Admin/button_Regular_upload-img-link'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'), 
    'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/img'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List_3'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Confirm on site meeting ca'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_NOC (optional)_mat-checkbo'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Keys collected_mat-checkbo'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Call photographer to confi'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Booked the camera through'))

WebUI.scrollToElement(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Valuation report is upload'), 
    3)

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Valuation report is upload'))

//WebUI.scrollToElement(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Market analysis report upl'),3)
//WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Market analysis report upl'))
WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiraghcom Admin/div_Property images are uploaded and verified (min 5)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/Page_Chiraghcom Admin/button_HR'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'haleemhanif')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'), 
    'c/4m4/rTvNs0iFiKg9IHPQ==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_In Process_2'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List_7'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Approve'))

WebUI.doubleClick(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(20)

//WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_HH'))


WebUI.closeBrowser()

