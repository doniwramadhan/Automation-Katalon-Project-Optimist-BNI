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
import com.kms.katalon.core.testobject.ObjectRepository as OR
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.*
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.Robot
import java.awt.event.KeyEvent

//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.BASE_URL)
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('Object Repository/Page_FIS  e-Login/input_User Name_txtUsername'), GlobalVariable.Username)
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_FIS  e-Login/input_Password_txtPassword'), GlobalVariable.Password)
//
//WebUI.click(findTestObject('Object Repository/Page_FIS  e-Login/button_Log In'))
CustomKeywords.'pages.LoginPage.openBrowserAndNavigate'(GlobalVariable.BASE_URL)

CustomKeywords.'pages.LoginPage.login'(GlobalVariable.Username, GlobalVariable.Password)

WebUI.setText(findTestObject('Object Repository/Page_LENDIX/input_My Views (0)_filter-text-box'), GlobalVariable.Search_Company)

WebUI.sendKeys(findTestObject('Object Repository/Page_LENDIX/input_My Views (0)_filter-text-box'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/Page_LENDIX/div_PT DONI'))

WebUI.click(findTestObject('Object Repository/Page_LENDIX/div_Credit Assessment_1'))

WebUI.click(findTestObject('Object Repository/Page_LENDIX/a_Launch in Credit Assessment_1'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(20)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Credit Assessment/span_Whole Units IDRIDR_ag-icon ag-icon-tre_0576db'), 
    20)

CustomKeywords.'pages.CreditAssessmentPage.openBalanceSheet'()

CustomKeywords.'pages.CreditAssessmentPage.inputFinancialData'("Data Files/Data Testing 2")

CustomKeywords.'pages.CreditAssessmentPage.save'()

//WebUI.click(findTestObject('Object Repository/Page_Credit Assessment/span_Balance Sheet_ag-icon ag-icon-tree-closed'))
//
//WebUI.click(findTestObject('Object Repository/Page_Credit Assessment/span_Whole Units IDRIDR_ag-icon ag-icon-tre_0576db'))
//
//
//def data = findTestData("Data Files/Data Testing 2")
//
//def pasteWithRobot() {
//	Robot robot = new Robot()
//	robot.keyPress(KeyEvent.VK_CONTROL)
//	robot.keyPress(KeyEvent.VK_V)
//	robot.delay(200)
//	robot.keyRelease(KeyEvent.VK_V)
//	robot.keyRelease(KeyEvent.VK_CONTROL)
//	robot.delay(1000)   // tunggu paste selesai
//	
//}
//
//
//// =======================
//// COPY VALUE 1
//// =======================
//StringBuilder clipboard1 = new StringBuilder()
//
//for (int i = 1; i <= 112; i++) {
//	clipboard1.append(data.getValue("Value 1", i)).append("\n")
//}
//
//StringSelection selection1 = new StringSelection(clipboard1.toString())
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1, null)
//
//TestObject col1 = findTestObject('Field Excel/Cash and Cash Equivalents')
//
//WebUI.waitForElementClickable(col1, 10)
//WebUI.click(col1)
//WebUI.delay(1)   // tunggu focus benar
//
//pasteWithRobot()
//
//WebUI.delay(2)   // WAJIB supaya tidak loncat ke kolom 2
//
//
//// =======================
//// COPY VALUE 2
//// =======================
//StringBuilder clipboard2 = new StringBuilder()
//
//for (int i = 1; i <= 112; i++) {
//	clipboard2.append(data.getValue("Value 2", i)).append("\n")
//}
//
//StringSelection selection2 = new StringSelection(clipboard2.toString())
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2, null)
//
//TestObject col2 = findTestObject('Field Excel 2/Cash and Cash Equivalents')
//
//WebUI.waitForElementClickable(col2, 10)
//WebUI.click(col2)
//WebUI.delay(1)
//
//pasteWithRobot()
//
//// =======================
//// COPY VALUE 3
//// =======================
//StringBuilder clipboard3 = new StringBuilder()
//
//for (int i = 1; i <= 112; i++) {
//	clipboard3.append(data.getValue("Value 3", i)).append("\n")
//}
//
//StringSelection selection3 = new StringSelection(clipboard3.toString())
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection3, null)
//
//TestObject col3 = findTestObject('Field Excel 3/Cash and Cash Equivalents')
//
//WebUI.waitForElementClickable(col3, 10)
//WebUI.click(col3)
//WebUI.delay(1)
//
//pasteWithRobot()
//
//WebUI.click(findTestObject('Page_Credit Assessment/span_Save'))
//
//WebUI.delay(5)
//WebUI.refresh()
