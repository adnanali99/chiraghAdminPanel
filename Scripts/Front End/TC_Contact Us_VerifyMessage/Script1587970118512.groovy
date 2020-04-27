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

WebUI.waitForPageLoad(20)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Contact Us/Page_Chiragh - Home/a_-Contact Us'), 
    8)

WebUI.click(findTestObject('Object Repository/Front End Objects/Contact Us/Page_Chiragh - Home/a_-Contact Us'))

WebUI.delay(10)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Front End Objects/Contact Us/Page_Chiragh - Contact Us/h2_Contact Us'))

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Contact Us/Page_Chiragh - Contact Us/input_Personal Details _firstName'),5)

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Your Message'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/button_Send'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Form submission failed Please provide t_46a3f5'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/h2_Headquarter'),2)

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_First Name is required'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Last Name is required'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Email is required'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Message is required'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Personal Details'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/input_Personal Details _firstName'), 
    'fatima')

WebUI.setText(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/input_Personal Details _lastName'), 
    'tul')

WebUI.setText(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/input_Personal Details _email'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/textarea_Your Message _message'), 
    'test msg')

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/button_Send'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Message delivered'))

WebUI.click(findTestObject('Object Repository/Front End Objects/verifyContactMessage/Page_Chiragh - Contact Us/div_Ok'))

WebUI.closeBrowser()

