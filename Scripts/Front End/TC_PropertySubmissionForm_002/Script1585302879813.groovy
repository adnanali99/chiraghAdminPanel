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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.rmi.Remote as Remote
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration

Faker faker = new Faker()

String projectname = faker.address().streetName()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(15)

WebUI.maximizeWindow()

WebUI.delay(15)

WebUI.click(findTestObject('Page_Chiragh - Home/a_LIST'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Chiragh - Home/a_SALE LISTING'))

WebUI.delay(3)

url = WebUI.getUrl()
println(url)

WebUI.setText(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/input_Username_un'), GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/input_Password_userPassword'), 
    GlobalVariable.passWord)

WebUI.click(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Login/button_Log In'))

//OWNER//
WebUI.delay(10)

//WebUI.setText(findTestObject('Page_Chiragh - Sell Your Property/input_Passport Number_passportNo'), '234234234233432')
//WebUI.click(findTestObject('Page_Chiragh - Sell Your Property/input_Passport Expiry Date_passportExpiryDate'))
//WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))
//WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_2029'))
//WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/month'))
//WebUI.click(findTestObject('Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_21'))
//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input_ID Card Number_idCardNo'), 
    '3294723889')
url = WebUI.getUrl()
println(url)
WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/ID card expiry'))

WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_Mar 2020'))

WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_2029'))

WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/month'))

WebUI.click(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/span_21'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Chiragh - Sell Your Property/input_Email_email'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Chiragh - Sell Your Property/input_Email_email'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Chiragh - Sell Your Property/input_Email_email'), Keys.chord(Keys.BACK_SPACE))

//WebUI.clearText(findTestObject('Object Repository/Page_Chiragh - Sell Your Property/input_Email_email'), 5)
WebUI.sendKeys(findTestObject('Page_Chiragh - Sell Your Property/input_Email_email'), 'abc@gmail.com')

WebUI.delay(3)

//WebUI.sendKeys(null, projectname)(findTestObject('Object Repository/Page_Chiragh - Sell Your Property/input_Email_email'), 5)
WebUI.scrollToElement(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/div_Scanned Passport Copy'), 
    5)

WebUI.delay(4)
//String dirName = RunConfiguration.getProjectDir()
//println("Project Dir:", dirName)

WebUI.uploadFile(findTestObject('Property submission/owner/Scanned Passport Copy'), GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/owner form/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/div_Scanned ID Copy  (UAE or c'), 
    GlobalVariable.fileUpload)

WebUI.delay(15)

WebUI.click(findTestObject('Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(5)

url = WebUI.getUrl()
println(url)
//CustomKeywords.'com.sanitytest.com.js_click.clickUsingJS'(findTestObject('Property submission/owner/Page_Chiragh - Sell Your Property/button_Next'), 
//  20)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Property submission/owner/Page_Chiragh - Sell Your Property/div_Owner details added succes'), 
//  4)
//POA//
WebUI.click(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/div_POA Status_ng-input'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'), 
    'No')
url = WebUI.getUrl()
println(url)
WebUI.sendKeys(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(4)

//CustomKeywords.com.example.WebUIKeywords.clickUsingJS(findTestObject('Page_LeadershipMicroStar Logistic/a_Learn More 1′), 30)
WebUI.click(findTestObject('Object Repository/Property submission/POA/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(4)

//Property form//
WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'), 
    'Completed')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property status/input_Title Deed Number_titleD'), 
    '348236327')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'), 
    'Freehold')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Type of area/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'), 
    'Villa')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Property Type/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Project Name/Page_Chiragh - Sell Your Property/input_Project Name_projectName'), 
    projectname)

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Building name/Page_Chiragh - Sell Your Property/input_Building Name_bulidingNa'), 
    'Ajman Tower')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Net Area_netArea'), 
    '2100')

WebUI.delay(5)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'), 
    'sqm')

WebUI.sendKeys(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'), 
    'sqm')

WebUI.sendKeys(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Unit_ng-star-inserted'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Area/Page_Chiragh - Sell Your Property/input_Gross Area_grossArea'), 
    '2300')

WebUI.delay(4)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Address/Page_Chiragh - Sell Your Property/input_Address_address'), 
    'United Arab Emirates')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'), 
    'Dubai')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/City/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Page_Chiragh - Sell Your Property/input_Location Map_mapLocation'), 'Burj Khalifa - Sheikh Mohammed bin Rashid Boulevard - Dubai - United Arab Emirates')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Developer Name/Page_Chiragh - Sell Your Property/input_Developer Name_developer'), 
    'DEV')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'), 
    'Residential')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Present Use/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Approx Age/Page_Chiragh - Sell Your Property/input_Property Approx. Age_pro'), 
    '2 years')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Beds/Page_Chiragh - Sell Your Property/input_Bedrooms_noOfBedrooms'), 
    '6')

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Baths/Page_Chiragh - Sell Your Property/input_Bathrooms_noOfBaths'), 
    '4')

//WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Covered Parking'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Car Parkings/input_car_parkings'), 
    '2')

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Driver Room'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Fully Fitted Kitchen'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Features/Page_Chiragh - Sell Your Property/label_Fully Furnished'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_Beach Access'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_Bank ATM Facility'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Facilities/Page_Chiragh - Sell Your Property/label_24 Hours Maintenance'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Mosques'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Schools'))

WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Neighbourhoods/Page_Chiragh - Sell Your Property/label_Shopping Malls'))

WebUI.scrollToElement(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Description/Page_Chiragh - Sell Your Property/div_Description _ngx-editor-textarea'), 
    5)

WebUI.setText(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Description/Page_Chiragh - Sell Your Property/div_Description _ngx-editor-textarea'), 
    'Villa for sale')

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'), 
    5)

WebUI.uploadFile(findTestObject('Property submission/Property form/Page_Chiragh - Sell Your Property/Scanned Title Deed/Scanned Title Deed'), 
    GlobalVariable.fileUpload)

WebUI.delay(7)

WebUI.uploadFile(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/SPA/SPA'), 
    GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Page_Chiragh - Sell Your Property/div_Property Picures'), GlobalVariable.fileUpload)

WebUI.delay(10)
url = WebUI.getUrl()
println(url)
WebUI.click(findTestObject('Object Repository/Property submission/Property form/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

//mortgage//
WebUI.setText(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'), 
    'No')
url = WebUI.getUrl()
println(url)
WebUI.sendKeys(findTestObject('Object Repository/Property submission/Mortgage/Mortgage Status/Page_Chiragh - Sell Your Property/input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Property submission/Mortgage/Next/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(10)

//rental//
WebUI.scrollToElement(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), 
    5)

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), 'No')

WebUI.sendKeys(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/input'), Keys.chord(
        Keys.ENTER))
url = WebUI.getUrl()
println(url)
WebUI.click(findTestObject('Object Repository/Property submission/Rental/Page_Chiragh - Sell Your Property/Next/Page_Chiragh - Sell Your Property/button_Next'))

WebUI.delay(5)
url = WebUI.getUrl()
println(url)
//WebUI.scrollToElement(findTestObject('Property submission/ValuationCompany/button_SUBMIT'), 5)

WebUI.click(findTestObject('Property submission/ValuationCompany/button_SUBMIT'))

WebUI.delay(8)

WebUI.verifyElementPresent(findTestObject('Object Repository/Property submission/Done/Page_Chiragh - Sell Your Property/h3_Thank You'), 
    5)

WebUI.closeBrowser()

