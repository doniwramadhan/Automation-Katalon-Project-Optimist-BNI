package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.ConditionType
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

public class RadioUtils {
	
	@Keyword
	def clickYesNo(String questionId, String answer) {
	
		String xpath =
			"//*[@id='${questionId}']" +
			"/ancestor::*[.//label[normalize-space()='${answer}']][1]" +
			"//label[normalize-space()='${answer}']"
	
		TestObject obj = new TestObject()
		obj.addProperty("xpath", ConditionType.EQUALS, xpath)
	
		WebUI.waitForElementVisible(obj, 10)
		WebUI.scrollToElement(obj, 5)
		WebUI.waitForElementClickable(obj, 10)
	
		WebUI.click(obj)
	}

}
