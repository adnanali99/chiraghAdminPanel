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

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Login/input_Username_un'), 
    'ahsan1234')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Login/button_Log In'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Home/h2_Current Auctions'), 
    3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Home/button_Bid Now'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyBiddingOpenHouse/Page_Chiragh - Property Detail/a'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Mon'))

String mon = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(mon)

WebUI.delay(1)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Tue'))

String tue = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(tue)

WebUI.delay(1)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Wed'))

String wed = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(wed)

WebUI.delay(1)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Thu'))

WebUI.delay(1)

String thur = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(thur)

WebUI.delay(1)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Fri'))

WebUI.delay(1)

String fri = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(fri)

WebUI.delay(1)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Sat'))

WebUI.delay(1)

String satur = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(satur)

WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Sun'))

WebUI.delay(1)

String sund = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'), 
    FailureHandling.OPTIONAL).substring(0,9)

CustomKeywords.'com.sanitytest.com.HandleErrorMessage.getText'(sund)

WebUI.delay(2)

WebUI.setText(findTestObject('Sanity Test/PropertyOpenHouseBiddingExample/time/Page_Chiragh - Property Detail/input_Jun 2 2020_scheduleTime'), 
    sund)

WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/a_Proceed'))

WebUI.delay(4)

