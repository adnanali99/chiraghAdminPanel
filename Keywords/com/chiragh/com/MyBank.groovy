package com.chiragh.com

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.junit.After

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

public class MyBank {
	
	@Keyword
	def createMyBankAccount(){
		
		for(def row=1; row<=3; row++){
			
			WebUI.openBrowser('')

			WebUI.navigateToUrl(GlobalVariable.Url)
			
			WebUI.waitForPageLoad(15)
			
			WebUI.maximizeWindow()
			
			print('\n now check row '+ String.valueOf(row));
			String num = String.valueOf(row)
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_Login'))
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Username_un'),
				'ahsan1234')
			
			WebUI.setEncryptedText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/input_Password_userPassword'),
				'RigbBhfdqOBDK95asqKeHw==')
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Login/button_Log In'))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_ENG_dropdownMenuLink'))
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Home/a_HI AutoChiragh'))
			
			WebUI.delay(3)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - Dashborad Home/b_Go to Wallet'))
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - User Account Summary/a_My Bank Accounts'))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/svg_My Bank Accounts_svg-inline--fa fa-plus_86c403'))
			
			print('\n now check num '+ num);
		
			WebUI.scrollToElement(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/label_Currency'),
				3)
			
			WebUI.selectOptionByValue(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/select_Select CurrencyUSDAEDEUR'),
				num, true)
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
				'Sharjah Platinum')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_IBAN_accIbanNumber'),
				'647489347389')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account No_accountNumber'),
				'6376376373')
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/div_Account Name'))
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Account Name_accountTitle'),
				'Emirati Bank')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Acct Holder Address_address'),
				'Dubai Town')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Name_bankName'),
				'Emirati Platinum')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Bank Branch Address_branchName'),
				'Dubai Town')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Swift Code_accSwiftCode'),
				'64637634')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Name_corresponding_bf0020'),
				'Dubai CB')
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_Correspondent Bank Swift Code_corresp_eefb27'),
				'53635')
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/button_Send OTP'))
			
			WebUI.delay(2)
			
			WebUI.executeJavaScript('window.open();', [])
			
			String currentWindow = WebUI.getWindowIndex()
			
			//Go in to new tab
			WebUI.switchToWindowIndex(currentWindow + 1)
			
			new ChiraghOTP().generateOtp('myaccounts', num, GlobalVariable.otpNo)
			
			WebUI.switchToWindowIndex(currentWindow)
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/label_SMS OTP'))
			
			WebUI.doubleClick(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_SMS OTP_smsOtp'))
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_SMS OTP_smsOtp'),
				GlobalVariable.otpNo)
			
			WebUI.setText(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/input_EMAIL OTP_emailOtp'),
				GlobalVariable.otpNo)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/button_Proceed'))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Front End Objects/MyBankAccount(Create)/Page_Chiragh - My Bank Accounts/h4_ACCOUNT CREATED SUCCESSFULLY'))
			
			WebUI.delay(3)
		
		}
		
		WebUI.closeBrowser()
		
		
	}
}
