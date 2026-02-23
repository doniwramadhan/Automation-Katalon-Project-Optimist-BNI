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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Risk'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Obligor Rating'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Obligor Rating_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Create Standard Scorecard Assessment'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/div_Select a Risk Template_mat-mdc-select-a_33e681'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Oil  Gas Commercial Risk Template (4.0.0)'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/div_Select a Statement_mat-mdc-select-arrow_e3a48a'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/b_Statement 1'))

WebUI.click(findTestObject('Page_Credit Assessment_Risk/span_Start Assessment'))

WebUI.click(findTestObject('Qualitative Questions/span_Qualitative Questions'))

WebUI.delay(5)


