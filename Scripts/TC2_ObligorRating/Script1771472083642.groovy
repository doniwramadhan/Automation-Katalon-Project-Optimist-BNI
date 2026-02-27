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
import utils.RadioUtils


//Qualitative Question
CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Risk')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Obligor Rating')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Obligor Rating_mat-mdc-button-touch-target')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Create Standard Scorecard Assessment')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/div_Select a Risk Template_mat-mdc-select-a_33e681')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Oil  Gas Commercial Risk Template (4.0.0)')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/div_Select a Statement_mat-mdc-select-arrow_e3a48a')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/b_Statement 1')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/span_Start Assessment')

CustomKeywords.'utils.WebUtils.safeClick'('Qualitative Questions/span_Qualitative Questions')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button1')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button2')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button3')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button4')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button5')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button6')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button7')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button8')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button9')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button10')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button11')



RadioUtils radio = new RadioUtils()
//Button12
radio.clickYesNo(
	"SingleChoiceQuestionLabel_1_12",
	"Yes"
)

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button13')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button14')

radio.clickYesNo(
	"SingleChoiceQuestionLabel_1_15",
	"No"
)

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button16')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button17')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button18')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button19')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button20')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button21')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button22')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button23')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button24')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button25')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button26')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button27')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button28')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button29')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button30')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button31')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button32')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button33')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button34')

CustomKeywords.'utils.WebUtils.safeClick'('RadioButton/Button35')


//Financial Question
CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/span_currency')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/div_currency')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/span_IDR')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/div_satuanNeraca')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/span_01')

//Rating
CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/span_satuanNeraca')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/div_satuanNeraca2yes')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk2/span_Yes')

CustomKeywords.'utils.WebUtils.safeClick'('Page_Credit Assessment_Risk/Button_Save')