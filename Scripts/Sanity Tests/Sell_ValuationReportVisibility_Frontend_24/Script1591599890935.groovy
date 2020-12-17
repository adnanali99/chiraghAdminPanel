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

// implement the property submit valuation
CustomKeywords.'com.sanitytest.com.PropertyReportValuation.propertySubmitFlow'()

// implement the flow of verification department 
CustomKeywords.'com.sanitytest.com.PropertyReportValuation.verificationDepartmentFlow'()

// implement the flow of brokerage department 
CustomKeywords.'com.sanitytest.com.PropertyReportValuation.brokerageDepartmentFlow'()

// now check the property report visiabilty

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/button_Log In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Home/a_HI ahsan1234'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Dashborad Home/p_Activity'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyReportValuation/Page_Chiragh - Dashborad Home/a_Sell'))

WebUI.mouseOver(findTestObject('Sanity Test/propertyUpdate/mouseOver/Page_/img'))

WebUI.click(findTestObject('Sanity Test/propertyReportValuation/Page_/a_Property images are coming soon_bid-bottom-menu'))

WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_Chiragh - Open House/a_Valuation Reports'))

WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/label_Chiragh Valuation Report'))

WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/label_3rd Party Valuation Report'))

WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/img'))

WebUI.click(findTestObject('Object Repository/Sanity Test/valuationPropertyReportView/Page_SideBar  Valuation/span_'))

WebUI.delay(3)

WebUI.closeBrowser()

