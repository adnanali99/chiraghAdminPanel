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

public class MortageCalculator {

	@Keyword
	def incomes(String salary, String otherIncome){

		String sum = salary + otherIncome;
		String percentage50 = sum / 2 ;

		print(percentage50);
	}

	@Keyword
	def installments(String mortage , String auto , String personal ,String credits ,  String other){

		String creditsCard3Percentage = credits * 3%

				print('check the credit card percentage', creditsCard3Percentage);

		String sumInstallment = mortage + auto  + personal + credits + other;

		print('check the su of innstallments', sumInstallment);
	}

	@Keyword
	def calculate(){
	}
}
