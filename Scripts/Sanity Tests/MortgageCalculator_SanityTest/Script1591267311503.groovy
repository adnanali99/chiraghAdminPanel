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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/h6_Active auctions in process'), 
    2)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/button_Check Eligibility'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Date of Birth _date_Birth'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/span_Apr 2020'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/svg'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/span_2000'))

WebUI.click(findTestObject('Object Repository/Fron+t End Objects/Mortage_calculators/Page_Chiragh - Home/span_Feb'))

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/span_1'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input'), 'Salaried')

WebUI.sendKeys(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input'), Keys.chord(
        Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/div_Salaried'))
WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Monthly Fixed Income _monthlyFix'), 
    '6899')

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Additional Income - Monthly_additionalIncome'), 
    '688')

//implement the add the incomes of monthly and additional 

CustomKeywords.'com.chiragh.com.MortageCalculator.incomes'('6899', '688')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/button_Next'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Auto Finance _auto_Finance'), 
    '1268')

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Personal Finance _personal_Finance'), 
    '886')

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Home Finance _home_Finance'), 
    '568899')

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Other Installments_others'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Other Installments_others'), 
    '68')

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Credit Card Limit _credit_CardLimit'), 
    '8900')

//Pre Qualification Check

CustomKeywords.'com.chiragh.com.MortageCalculator.incomes'('1268', '886', '568899','68', '8900' )

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/button_Next'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input'), 'I want to Buy')

WebUI.sendKeys(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_Full Name_full'), 
    'Amjad Ali')

WebUI.delay(2)

WebUI.setText(findTestObject('Front End Objects/MortageCalculatorsObject/countryCode/Page_Chiragh - Home/input_Country Code_ng-star-inserted'), 
    'Pak')

WebUI.sendKeys(findTestObject('Front End Objects/MortageCalculatorsObject/countryCode/Page_Chiragh - Home/input_Country Code_ng-star-inserted'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_(93)_mobile'), 
    '338089966')

WebUI.setText(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/input_E-mail Address_emailAddress'), 
    'Amjad@gmail.com')

WebUI.click(findTestObject('Front End Objects/Mortage_calculators/inputcommercial/Page_Chiragh - Home/span_Select Banks'))

WebUI.click(findTestObject('Front End Objects/Mortage_calculators/inputcommercial/Page_Chiragh - Home/label_Commercial Bank of Dubai'))

WebUI.click(findTestObject('Front End Objects/Mortage Calculator/recaptcha/Page_Chiragh - Home/iframe_Bank Saderat Iran_a-f34w0fjdnxq6'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/button_Next'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/article_Congratulations'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/h5_AED 223530000'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/h5_600 months'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/h5_AED 223530000'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/h5_600 months'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Front End Objects/Mortage_calculators/Page_Chiragh - Home/article_Congratulations'), 
    FailureHandling.OPTIONAL)

WebUI.closeBrowser()

