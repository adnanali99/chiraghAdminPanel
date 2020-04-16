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

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.Buyer)

WebUI.setText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Password_userPassword'), 
    GlobalVariable.BuyerPassword)

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/button_Log In'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Home/h2_Current Auctions'), 
    10)

WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Home/button_Bid Now (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Home/button_Bid Now'))

WebUI.delay(15)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/input_Enter 30000000 AED or more_bidAmount'), 
    1, FailureHandling.OPTIONAL)) {
    WebUI.delay(10)

    String extractInt = WebUI.getText(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/em_Enter 30000000 AED or more')).substring(
        5)

    WebUI.setText(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/input_Enter 30000000 AED or more_bidAmount'), 
        extractInt)

    WebUI.delay(5)

    WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/button_arrowOnBidScreen'))

    WebUI.delay(20)

    def otp = org.apache.commons.lang.RandomStringUtils.randomNumeric(4)

    WebUI.setText(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/input_hms_bidOtp'), 
        otp)

    WebUI.delay(2)

    WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/svg_hms_svg-inline--fa fa-arrow-right fa-w-14'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/div_Your OTP is invalid or already expired'), 
        3)
} else {
    WebUI.delay(10)

    WebUI.setText(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'), 
        '3294723889')

    WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Owner/Page_Chiragh - Buy Property/input_ID Card Expiry Date_idCardExpiration'))

    WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

    WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_2029'))

    WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/month'))

    WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_21'))

    WebUI.scrollToElement(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/div_Scanned Passport Copy'), 
        5)

    WebUI.delay(4)

    WebUI.uploadFile(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Owner/documents/Scanned Passport Copy'), 
        'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

    WebUI.delay(7)

    WebUI.delay(4)

    WebUI.uploadFile(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Owner/documents/Scanned ID card Copy'), 
        'C:\\Users\\HP\\git\\chiraghAdminPanel\\Include\\PropertyImages\\1584693242612-Scanned_Passport_Copy.png')

    WebUI.delay(7)

    WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'))

    WebUI.click(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/div_POA Status_ng-input'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'), 
        'No')

    WebUI.sendKeys(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'), 
        Keys.chord(Keys.ENTER))

    WebUI.delay(4)

    WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/button_nextPOA'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Auction Deposit Page/Checkbox'))

    WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Auction Deposit Page/button_Proceed'))

    WebUI.delay(20)

    WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/Page_Chiragh - Buy Property/Auction Deposit Page/Bid now again'))

    WebUI.delay(15)
	
	WebUI.delay(10)
	
	String extractInt = WebUI.getText(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/em_Enter 30000000 AED or more')).substring(
			5)
	
	WebUI.setText(findTestObject('Object Repository/Front End Objects/Bidding/Page_Chiragh - Property Detail/input_Enter 30000000 AED or more_bidAmount'),
			extractInt)
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Front End Objects/Bidding/Page_Chiragh - Property Detail/button_arrowOnBidScreen'))
	
	WebUI.delay(20)
	
	def otp = org.apache.commons.lang.RandomStringUtils.randomNumeric(4)
	
	WebUI.setText(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/input_hms_bidOtp'),
			otp)
	
	WebUI.delay(2)
	
	WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/svg_hms_svg-inline--fa fa-arrow-right fa-w-14'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/Front End Objects/Bidding/OTP fields/Page_Chiragh - Property Detail/div_Your OTP is invalid or already expired'),
			3)

	
}

WebUI.closeBrowser()

