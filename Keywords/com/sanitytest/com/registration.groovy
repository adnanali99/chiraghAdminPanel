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

public class registration {
	@Keyword
	def accountActivation(String mesg){

		WebUI.navigateToUrl('https://getnada.com/')

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/nav_Temp InboxeslelukgetnadacomAdd Inbox'))

		WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/span_Add Inbox'))

		WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'))

		WebUI.setText(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/input_Add Inbox_user_name'),
				mesg)

		WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/a_Accept'))

		WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/div_Chiragh Reset Password At Mon Apr 06 07_2f7f77'))

		WebUI.switchToWindowTitle('Nada - temp mail - fast and free')

		WebUI.click(findTestObject('Object Repository/Sanity Test/registrationObject/Page_Nada - temp mail - fast and free/a_httptestchiraghcomactivateAccount06768942e6aac26f6c5a2df859a8d9294732'))

		WebUI.switchToWindowTitle('Chiragh - Login')


		//		WebUI.click(findTestObject('Object Repository/Front End Objects/ForgetPassword/Page_Nada - temp mail - fast and free/a_Reset Password'))

		WebUI.delay(1)

		WebUI.switchToWindowIndex(1)

		WebUI.delay(2)
	}
}
