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

WebUI.navigateToUrl('http://test.chiragh.com/')

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Login/input_Username_un'), GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Login/input_Password_userPassword'),
	'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Dashborad Home/b_Manage Activity'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Open House/p_Activity'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_Chiragh - Open House/a_Sell'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Sanity Test/propertyUpdate/mouseOver/Page_/img'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyUpdate/Page_/a_Property images are coming soon_bid-left-menu'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Personal Detail  1st Owner'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Upload Documents'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/a_Attorney'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/label_Attorney Status'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Upload Documents'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/a_Property'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Area Details'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Upload Documents'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/a_Property Mortgage'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Mortgage Details'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Upload Documents_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/a_Property Rent'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Rental Details'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Upload Documents'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/a_Valuation'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/h5_Property Valuation'))

WebUI.click(findTestObject('Object Repository/Sanity Test/verifyPropertyDetailTabLocked/Page_/span_'))

WebUI.closeBrowser()
