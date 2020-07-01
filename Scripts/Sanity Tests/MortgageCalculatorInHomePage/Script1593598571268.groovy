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

CustomKeywords.'com.chiragh.com.MortageCalculator.mortgageCalculatorFunctionality'()

WebUI.click(findTestObject('Sanity Test/MortgageCalculatorEnhancement/homePageButton/Page_Chiragh - Home/input_Loan Term_loanYear'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice'))

WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input'), 
    'Principle')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/span_Principle  Interest'))
WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Down Payment_downPayment'), 
    '75,000')

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice'))

WebUI.delay(2)

//WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice_1'),
//    '10,000.00')
//
//WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice_1_2'),
//    '000.00')
//
//WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice_1_2_3'),
//    '3,000.00')
//
//WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice_1_2_3_4'),
//    '37,000.00')
WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Purchase Price_purchasedPrice_1_2_3_4_5'), 
    '375,000.00')

WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Interest Rate()_interestRate'), 
    '2.75')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input_Loan Term_loanYear'), 
    '25')

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/button_Calculate'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/p_Monthly Payment'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/h6_AED 138393'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/p_Loan Amount'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/h5_AED 30000000'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/a_Amortization Schedule'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/th_Balance'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/td_29930357'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/td_138393'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/a_Summary'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input'), 
    'Interest Only')

WebUI.sendKeys(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/input'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/div_Interest Only'))
WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/p_Monthly Payment (during interest-only)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/h6_AED 68750'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/p_Monthly Payment (post interest-only)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/h6_AED 142411'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/h5_AED 30000000'))
WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/a_Amortization Schedule'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/td_30000000'))
WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/a_Summary'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/img'))

WebUI.click(findTestObject('Object Repository/Sanity Test/MortgageCalculatorEnhancement/Page_Chiragh - Property Detail/a_Finance Options'))

WebUI.closeBrowser()

