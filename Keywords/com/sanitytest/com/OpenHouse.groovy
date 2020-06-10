package com.sanitytest.com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class OpenHouse {

	@Keyword
	def verifyOpenHousePopup(String mesg){

		if(mesg){

			WebUI.delay(3)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Mon'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Tue'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Wed'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Thu'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Fri'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Sat'))

			WebUI.delay(1)

			WebUI.click(findTestObject('Sanity Test/PropertyBiddingOpenHouse/timeConverstion/Page_Chiragh - Property Detail/a_Sun'))

			WebUI.delay(1)

			String sund = WebUI.getText(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/b_0100 PM - 0500 PM'),
					FailureHandling.OPTIONAL).substring(0, 9)

			WebUI.delay(2)

			WebUI.setText(findTestObject('Sanity Test/PropertyBiddingOpenHouse/inputtime/Page_Chiragh - Property Detail/input_Select date_scheduleTime'),
					sund)

			WebUI.delay(2)


			WebUI.click(findTestObject('Object Repository/Sanity Test/PropertyOpenHouseBiddingExample/Page_Chiragh - Property Detail/a_Proceed'))

			WebUI.closeBrowser()
		}
	}
}
