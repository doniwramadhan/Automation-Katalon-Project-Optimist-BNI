package pages

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


import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

class CreditAssessmentPage {

	private void pasteWithRobot() {
		Robot robot = new Robot()
		robot.keyPress(KeyEvent.VK_CONTROL)
		robot.keyPress(KeyEvent.VK_V)
		robot.delay(200)
		robot.keyRelease(KeyEvent.VK_V)
		robot.keyRelease(KeyEvent.VK_CONTROL)
		robot.delay(1000)
	}

	@Keyword
	def openBalanceSheet() {
		WebUI.click(findTestObject('Object Repository/Page_Credit Assessment/span_Balance Sheet_ag-icon ag-icon-tree-closed'))
		WebUI.click(findTestObject('Object Repository/Page_Credit Assessment/span_Whole Units IDRIDR_ag-icon ag-icon-tre_0576db'))
	}

	@Keyword
	def inputFinancialData(String dataFilePath) {

		def data = findTestData("Data Files/Data Testing 2")

		inputColumn(data, "Value 1",
			'Field Excel/Cash and Cash Equivalents')

		inputColumn(data, "Value 2",
			'Field Excel 2/Cash and Cash Equivalents')

		inputColumn(data, "Value 3",
			'Field Excel 3/Cash and Cash Equivalents')
	}

	private void inputColumn(def data, String columnName, String objectPath) {

		StringBuilder clipboard = new StringBuilder()

		for (int i = 1; i <= data.getRowNumbers(); i++) {
			clipboard.append(data.getValue(columnName, i)).append("\n")
		}

		StringSelection selection = new StringSelection(clipboard.toString())
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null)

		def col = findTestObject(objectPath)

		WebUI.waitForElementClickable(col, 10)
		WebUI.click(col)
		WebUI.delay(1)

		pasteWithRobot()

		WebUI.delay(2)
	}

	@Keyword
	def save() {
		WebUI.click(findTestObject('Page_Credit Assessment/span_Save'))
		WebUI.delay(5)
		WebUI.refresh()
	}
}