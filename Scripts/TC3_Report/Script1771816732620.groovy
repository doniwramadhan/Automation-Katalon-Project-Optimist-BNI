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
import utils.WebUtils


CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Report/span_Reports')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Report/mat-icon_General Reports_mat-icon notransla_1b9d0d')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Report/span_Balance Sheet - Detailed')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Report/span_Balance Sheet - Detailed_mat-mdc-butto_4daba1')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Report/span_Print to PDF')

WebUI.refresh()
