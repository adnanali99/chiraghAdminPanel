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

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/h2_Upcoming Auction'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Estimate_search_input ng-untouched ng_bd3070'), 
    'Dubai Land')

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/a_Estimate_search_icon estimatTab'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), 'Apart')

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_Apartment'))
WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), Keys.chord(
        Keys.ENTER))

//WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), 'Reside')


//WebUI.setText(findTestObject('Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/input'), 'Reside')
//
//WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Present Use_ng-input'), 
//    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_Residential'))
//WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), 'Abu D')
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Select City_ng-input'), 
    'Abu D')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Select City_ng-input'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_Abu Dhabi'))
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Abu Dhabi_building'), 
    'Dubai La')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Abu Dhabi_building'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_Dubai Land'))
//WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), '3')
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Bedrooms_ng-input'), 
    '3')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Bedrooms_ng-input'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_3'))
//WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), '4')
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Bathrooms_ng-input'), 
    '3')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_Bathrooms_ng-input'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_4'))
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Bathrooms_areaSize'), 
    '120')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Bathrooms_areaSize'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_sqm_ng-input'))
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_sqm_ng-input'), 
    'sqm')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/inputfield/Page_Chiragh - Home/div_sqm_ng-input'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_sqm'))
WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/button_Countinue'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/span_Covered Parking'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/span_Gymnasium'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/span_Swimming Pool'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/span_Balcony'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_Terace'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Provide us your Details_userName'), 
    'Ahsan')

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_Provide us your Details_userEmail'), 
    'Ahsankalim@bestercapitalmedia.com')

WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), '(+92')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input'), Keys.chord(
        Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/div_(92) Pakistan'))
WebUI.setText(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/input_(92) Pakistan_mobilecode'), 
    '33589677895')

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/button_Get Estimate Now'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/h5_Your Market Value Estimate Result'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/p_Minimum AED 60000000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/p_Maximum AED 410000000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/propertyEvaluationGagdget/Page_Chiragh - Home/span_AED 191600000'))

