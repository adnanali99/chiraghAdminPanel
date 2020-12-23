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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver
import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector as LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.rmi.Remote

import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Home/a_Login'))

WebUI.setText(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Login/input_Username_un'), 
    GlobalVariable.userName)

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Login/input_Password_userPassword'), 
    'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Login/button_Log In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Home/a_HI chiragh1234'))

WebUI.delay(2)
EventFiringWebDriver driver = DriverFactory.getWebDriver()  // get the event driver (aka the katalon smartwait driver)

RemoteWebDriver driver = driver.getWrappedDriver()
driver.setFileDetector(new LocalFileDetector());
File file = new File(System.getProperty(GlobalVariable.fileUpload));

println("file exists: " + file.exists());

String imagePath = file.getAbsolutePath();
WebElement input = driver.findElement(By.xpath("//input[@name='file']"));
input.sendKeys(imagePath);

//WebUI.uploadFile(findTestObject('Object Repository/Front End Objects/ProfileImageChange/capture/Page_Chiragh - Dashborad Home/input_You have no new notifications at the moment_file'), GlobalVariable.fileUpload)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Dashborad Home/div_Profile image successfully updated'))
WebUI.click(findTestObject('Object Repository/Front End Objects/ProfileImageChange/Page_Chiragh - Dashborad Home/div_Profile image successfully updated'))

WebUI.delay(3)

WebUI.closeBrowser()

