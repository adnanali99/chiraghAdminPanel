package com.chiragh.com

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

public class ChiraghOTP {

	@Keyword
	def generateOtp(String transactionType , String cuurencyId , otpNumber ){


		print('\n now i check '+ cuurencyId +' '+ ' transactionType ' + transactionType + ' NOW checking ' +  otpNumber);


		WebUI.navigateToUrl('http://test.chiragh.com/test-login')

		WebUI.waitForPageLoad(10)

		WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Username_un'), GlobalVariable.userName)

		WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Password_userPassword'), GlobalVariable.passWord)

		WebUI.click(findTestObject('Object Repository/CreateOTPLoginPage/Page_/button_Log In'))

		WebUI.delay(6)

		WebUI.setText(findTestObject('OTP_Creation/Page_/input_Transaction Type_un'), transactionType)
		
		if(transactionType !='registration'){
			
			print('\n now i check condition '+ cuurencyId +' '+ ' transactionType '+ transactionType + ' otp'+ otpNumber);
			WebUI.setText(findTestObject('Object Repository/CreateOTPLoginPage/Page_/input_Password_userPassword'), cuurencyId)
			
		}
		WebUI.setText(findTestObject('OTP_Creation/Page_/input_OTP_Create'), otpNumber)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/CreateOTPLoginPage/Page_/button_Proceed'))

		WebUI.delay(3)
	}
}
