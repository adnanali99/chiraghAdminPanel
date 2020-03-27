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

currentWindow = WebUI.getWindowIndex()

/*WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'farhanm')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_New Leads'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_an hour ago_fas fa-user-circ'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Abdullah M'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)*/

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'abdullah')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Reichel Trail 3 Floors Build'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img_Form A_ng-star-inserted'),
				 'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\pdf\\MarketAnalysis.pdf')


WebUI.uploadFile(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img_Brokerage Report_ng-star-i'),
	'C:\\Users\\HP\\Katalon Studio\\Chiragh(Admin)\\Include\\pdf\\MarketAnalysis.pdf')

WebUI.delay(5)

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price Range (AED)_o'),
	'3000000')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price Range (AED)_o_7'),
	'6000000')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price Range (AED'),
	'7000000')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price Range (AED_7'),
	'9000000')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Submit for Approval'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_AM'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'farhanm')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars_1'))

//WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/mat-tab-header_MessagesActivit'))

WebUI.delay(20)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Activity Log'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Activity Log'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_1'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_1'))

WebUI.delay(8)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'nayab')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process_1'))

WebUI.delay(20)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Documents'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Documents'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_2'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal_2'))

WebUI.delay(8)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

WebUI.delay(10)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_NB'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'abdullah')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_My Leads'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/i_Call Seller_fas fa-calendar-'))

WebUI.delay(3)

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Schedule a Brokerage Mee'),
	'Brokerage Meeting')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/textarea_Schedule a Brokerage'),
	'Brokerage Meeting')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Schedule a Brokerage Meet'))

/*WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Mar 2019'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_2019'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Jul'))*/

//WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_18'))//////////

WebUI.delay(5)

/*WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_19'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Sat_owl-dt-timer-input'),
	'12')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Hour_owl-dt-timer-input'),
	'00')

WebUI.delay(5)*/

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Set'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_SAVE (1)'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel_fas fa-bars'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Valuation'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Gallery_mat-tab-header-pag'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Brokerage Proposal'))

WebUI.delay(5)

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Open Price (AED)_openPri'),
	'5000000')

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Reserve Price (AED)_rese'),
	'8000000')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Select duration (in days)_'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_7'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Auction Start Date_mat-'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_9'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Auction Start Date_mat-che'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/button_ Add Schedule'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/mat-form-field__datepicker-inp'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/button__mat-icon-button'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_9'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/input__form-control form-input'), '2 00PM' )

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/Page_Chiragh.com Admin/openhouse/Page_Chiragh.com Admin/Page_Chiragh.com Admin/input__form-control form-input'), '4 00PM')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Save'))

//WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/span_Brokerage proposal has be'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img'))

WebUI.delay(3)


//WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Form A uploaded_mat-checkb'))

//WebUI.delay(3)

//WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Auction specifications fin'))
	

WebUI.delay(5)

WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(currentWindow+1)

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(5)
		 
WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/div_Login or Register'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Login'))
		 
WebUI.waitForPageLoad(5)
		 
WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userName'), GlobalVariable.userName)
WebUI.setText(findTestObject('Object Repository/Property(owner)/individual owner/input_Sign In_userPassword'), GlobalVariable.passWord)
WebUI.click(findTestObject('Object Repository/Property(owner)/individual owner/button_Sign In'))
		 
		 //WebUI.delay(5)
WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/div_Login or Register'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Profile'))
		 
WebUI.waitForPageLoad(5)
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Activity'))
		 WebUI.delay(5)
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_In Process'))
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Property Id 52482_ellipisIco'))
		 WebUI.delay(3)
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/a_Listing Terms'))
		 WebUI.delay(3)
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/button_Agree'))
		 WebUI.delay(7)
		 WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh/button_'))
		 WebUI.delay(5)
		 
		 WebUI.switchToWindowIndex(currentWindow)
		 
WebUI.delay(5)
		 
WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_June Light Hotel'))
		 
WebUI.delay(5)
		 
WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Check List'))
		 
WebUI.delay(3)
		 
WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Confirm'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img1'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_AM'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Admin Panel_userName'),
	'farhanm')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Password'))

WebUI.setEncryptedText(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/input_Username_password'),
	'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/a_Cordia Tunnel Hotel'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/div_Check List_2'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Approve_1'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_Yes'))

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/img1'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_FM'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/brokerage department/Page_Chiragh.com Admin/button_exit_to_appLogout'))

WebUI.closeBrowser()
