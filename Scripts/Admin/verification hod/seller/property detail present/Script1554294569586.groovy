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

WebUI.waitForPageLoad(8)

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/form_Admin PanelUsernamePasswo'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.setEncryptedText(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/input_Username_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/a_In Process'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/a_Murazik Manors 6 Beds Villa'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Edwin'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Last Name'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Owners'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_POAs'))

/*WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_POA Status'),4))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_POA Status'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Yes'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_POA StatusYesPersonal Deta'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_POA Number'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_7525320'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/h3_Nothing here yet .....'),4)*/

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Property Details'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Project Name'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Murazik Manors'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Mortgage'))

/*WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Mortgage Status'),4)

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/span_Yes1'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_9217334.00'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Mortgage Initial Amount'))*/

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Rental'))

/*WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Yes2'),4)
{
WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Property Rented'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Ejari Number'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_488950'))
}
else if(WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/h3_Nothing here yet .....'),4))
{ 
	WebUI.closeBrowser()
}*/
    WebUI.closeBrowser()


/*WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/h3_Nothing here yet .....'),4)

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Property Details'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Project Name'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Murazik Manors'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Mortgage'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Mortgage Status'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/span_Yes1'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_9217334.00'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Mortgage Initial Amount'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/div_Rental'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Yes2'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Property Rented'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_Ejari Number'))

WebUI.click(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/span_488950'))

WebUI.closeBrowser()*/

