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

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Login/input_Email_un'), 'testbcm11%2bac@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Home/a_LIST'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Home/a_SALE LISTING'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'), 
    '8798898778')

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/input_ID Card Expiry Date_idCardExpiration'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/span_30'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/input_Attorney Status_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_No'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_'))

WebUI.rightClick(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/input_Upload Property Pictures_custom-file-input'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.doubleClick(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_Property Picures'))

WebUI.click(findTestObject('Object Repository/Sanity Test/upload10/Page_Chiragh - Sell Your Property/div_'))

WebUI.closeBrowser()

