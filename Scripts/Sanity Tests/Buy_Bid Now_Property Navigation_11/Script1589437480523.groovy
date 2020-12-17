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
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/LoginWithValidCredentials/Page_Chiragh - Login/button_Log In'))

WebUI.waitForPageLoad(15)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'),
	2)

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Home/button_Bid Now'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/b_200000 sqm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/img'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/img_1'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/img_Logout_w-100'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/canvas_Complete office_webgl-canvas'), FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/img_Logout_w-100_1'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/div_Logout_ngx-gallery-icon ngx-gallery-arrow'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/div_Logout_ngx-gallery-icon ngx-gallery-arrow'), FailureHandling.OPTIONAL)

WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/h3_Property on Map'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_PROPERTY DESCRIPTION'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_FEATURES'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_FACILITIES'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_NEIGHBOURHOODS'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_VALUATIONS'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/label_AIRBNB YIELD (Daily)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/a_DOWNLOAD VALUATORS REPORT'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/h5_Valuation Reports'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/span_'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/h2_Similar Search Properties'),
	3)

//WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/h2_Similar Search Properties'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyNavigation/Page_Chiragh - Property Detail/h5_Our Partners'))

WebUI.closeBrowser()

