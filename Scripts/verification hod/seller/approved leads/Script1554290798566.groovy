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

WebUI.click(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/div_Username'))

WebUI.setText(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/input_Admin Panel_userName'), 
    'arsalankhalid')

WebUI.setEncryptedText(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/input_Username_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/a_Approved Leads'))

WebUI.delay(15)

//WebUI.waitForElementClickable('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/th_Assignee', 10)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/th_Assignee'),4) && (WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/approved leads tab/Page_Chiragh.com Admin/span_Approved'),4)))
{
	WebUI.closeBrowser()
}



