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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://test.chiragh.com/')
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_HI Guest'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_Login'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Login/input_Username_un'))
//
//WebUI.setText(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Login/input_Username_un'), 
//    'AUTOCHIRAGH')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Login/input_Password_userPassword'), 
//    'RigbBhfdqOBDK95asqKeHw==')
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Login/path'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Login/button_Log In'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
//
//WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/input_Username_un'),
	GlobalVariable.userName)

WebUI.setText(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/input_Password_userPassword'),
	GlobalVariable.passWord)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Login/button_Log In'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ChangePasswordObject/Page_Chiragh - Home/a_HI AutoChiragh'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Dashborad Home/h2_Hi Auto Chiragh'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Dashborad Home/a'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Dashborad Home/a_ Exit profile'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/h1_Dubais Leading Online Real Estate Auction'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ExitsProfile/Page_Chiragh - Home/a_Logout'))

WebUI.delay(2)

WebUI.closeBrowser()

