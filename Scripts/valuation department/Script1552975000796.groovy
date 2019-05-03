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

WebUI.navigateToUrl('http://admin-chiragh.surge.sh/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'farhanm')

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/a_Abdullah M'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/button_FM'))

WebUI.click(findTestObject('Object Repository/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)


WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'haleemhanif')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_a day ago_fas fa-user-circle'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Chrystal Dsouza'))

//WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Haleem Hanif'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_HH'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'chrystaldsouza')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/i_Schedule Appointment_fas fa-'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Schedule an Onsite Visit'),
	'Onsite Visit')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Schedule an Onsite Visit_'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Help_cdk-overlay-backdrop'))

/*WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Mar 2019'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_2019'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Dec'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_30'))*/

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_20'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Sat_owl-dt-timer-input'),
	'11')

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Hour_owl-dt-timer-input'),
	'00')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Set'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/textarea_Schedule an Onsite Vi'),
	'Onsite Visit ')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_SAVE'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/img1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_CD'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'fatimazaidi')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_December 30th 2019 1024 AM_f'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Adnan Shafiq'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_FZ'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'adnanshafiq')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')
WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_December 30th 2019 1000 AM_f_1'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Confirm'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel_fas fa-ba'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Valuation'))

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Valuation_file'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\pdf\\valuation.pdf')

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/span_Third party valuation rep'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_AS'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'fatimazaidi')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Approve'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_FZ'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'chrystaldsouza')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel_fas fa-ba_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Valuation_1'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Valuation_1'))


WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Chiragh Valuation Report'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\pdf\\ChiraghValuation.pdf')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Market Analysis Report'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\pdf\\MarketAnalysis.pdf')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Gallery/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Gallery'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Gallery'))

WebUI.delay(8)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\15.jpg')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Mark Main_upload-img-li'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\akoya-oxygen-1076-2052.jpg')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\arabian-ranches.png')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\119161567.jpg')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\41533282.jpeg')

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_This collection is empty'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\propertyImages\\arabian-ranches.png')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List_3'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Confirm on site meeting ca'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_NOC (optional)_mat-checkbo'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Keys collected_mat-checkbo'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Call photographer to confi'))

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Booked the camera through'))

WebUI.scrollToElement(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Valuation report is upload'),3)

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Valuation report is upload'))

//WebUI.scrollToElement(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Market analysis report upl'),3)

WebUI.click(findTestObject('Object Repository/valuation department/Checklist/Page_Chiragh.com Admin/div_Market analysis report upl'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_CD'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'haleemhanif')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_In Process_2'))

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/a_Birdie Fords Hotel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/div_Check List_7'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Approve'))

WebUI.doubleClick(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_Yes'))

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_HH'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/valuation department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.closeBrowser()
