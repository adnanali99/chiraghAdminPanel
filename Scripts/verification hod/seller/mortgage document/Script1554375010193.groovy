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

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/div_Mortgage'))

if(WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/div_Mortgage StatusYes'),4))
{
	WebUI.click(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/a_Property Mortgage Details_at'))

	WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/div_Scanned NOC Form'),4)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/p_Scanned NOC Form'),4)
	
	WebUI.click(findTestObject('Object Repository/verification hod/mortgage documents/Page_Chiragh.com Admin/p_Scanned NOC Form'))
	
	WebUI.closeBrowser()
	
}
else if(WebUI.verifyElementPresent(findTestObject('Object Repository/verification hod/property details present/Page_Chiragh.com Admin/Page_Chiragh.com Admin/h3_Nothing here yet .....'),4))
{
	WebUI.closeBrowser()
}
