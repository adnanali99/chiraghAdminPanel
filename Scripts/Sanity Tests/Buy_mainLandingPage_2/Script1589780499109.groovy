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
//WebUI.navigateToUrl(GlobalVariable.Url)
//
//WebUI.waitForPageLoad(15)
//
//WebUI.maximizeWindow()
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h2_Current Auctions'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h6_Active auctions in process'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h6_PROPERTY ID 39474'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/button_View More (1)'), FailureHandling.OPTIONAL)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h6_PROPERTY ID 38609'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h2_Upcoming Auction'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h6_No upcoming auctions are available at th_0ef46d'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/html_pac-containerbackground-colorfffpositi_2539dd'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h4_When its time to sell you are in control_bf89f4'))
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/mainLandingPage/Page_Chiragh - Home/h5_Check your mortgage eligibility'))
//
//WebUI.delay(3)
//
//WebUI.closeBrowser()


WebUI.openBrowser('')

WebUI.navigateToUrl('http://test.chiragh.com/')

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ARA(UAE)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/svg_Guest_svg-inline--fa fa-user fa-w-16'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))


WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h1_Dubais Leading Online Real Estate Auction'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Connecting Global Investment Community'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h3_Advance Search'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Type of Area'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Type of Property'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Status'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_City'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Bed(min)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Bed(max)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Bath(min)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Bath(max)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Kitchen'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Car Parking'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Rent Status'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Furnished'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Currency'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Price(min)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/label_Price(max)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/a_'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Dubai Land Dept Regulated'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Verified Properties'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Third Party Valuation'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Transparent Bidding'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Open House Facility'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h2_Current Auctions'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_Active auctions in process'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_PROPERTY ID 38965'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_5Days07Hours31Minutes16Seconds'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/b_230000  sqm'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_6 Beds'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_4 Baths'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_2 Parkings'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/span_Bids  7'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_PROPERTY ID 39651'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_3Days07Hours30Minutes39Seconds'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/b_230000  sqm'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_6 Beds'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_4 Baths'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_2 Parkings'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/span_Bids  3'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_PROPERTY ID 39640'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/b_230000  sqm'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/b_6'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/b_4'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_2 Parkings'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/img_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/button_View More (6)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h2_Upcoming Auction'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_Stand by and mark your favourite properties'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_No upcoming auctions are available at th_0ef46d'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h4_When its time to sell you are in control_bf89f4'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h4_Financial Partners'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_Check your mortgage eligibility'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h6_Convenient Multi-currency'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h2_Auction Deposit  withdrawal'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_Depositing or withdrawing money is simpl_b81dd9'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h3_Help center'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h4_How it works'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_How to buy'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_How to sell'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_Our Partners'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/h5_How can we Assist'))

//WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Whatsapp'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Request a Call'))
//
//WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Email Us'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_About Us'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Our mission is to provide a user-friend_97e858'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Quick Links'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Newsletter'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Dont miss a chance to get a best deal S_65e1a0'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Contact'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_109-110 Building  6 Emaar Gold  Diamond_c60f27'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_971 4338 8823 Sunday to Thursday 900 am_906058'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Copyright  Chiraghcom'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_Licensed by Dubai Land Department (DLD)'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_109-110 Building  6 Emaar Gold  Diamond_c60f27'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_971 4338 8823 Sunday to Thursday 900 am_906058'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Sunday to Thursday 900 am to 600 pm'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/p_Saturdays 930 am to 500 pm'))

WebUI.click(findTestObject('Object Repository/Sanity Test/ChiraghHomeUIpages/Page_Chiragh - Home/div_971 4338 8823 Sunday to Thursday 900 am_906058'))

WebUI.closeBrowser()

