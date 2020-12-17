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

public class Validation {

	@Keyword
	def isAlpha(String name) {

		print('\n name '+ name + ' '+ name.matches("[a-zA-Z]+")  +'\n');
		return name.matches("[a-zA-Z]+");
	}

	@Keyword
	def isNumeric(String num) {

		print('\n num '+ num + ' '+ num.matches("[0-9]+")  +'\n');
		return num.matches("[0-9]+");
	}

	@Keyword
	def isNumericAndDecimal(String num) {

		print('\n num '+ num + ' '+ num.matches("[0-9.]*")  +'\n');
		return num.matches("[0-9.]*");
	}

	@Keyword
	def isEmail(String email) {

		print('\n email '+ email + ' '+ email.matches(".+@.+\\.[a-z]+")  +'\n');
		return email.matches(".+@.+\\.[a-z]+");
	}
}
