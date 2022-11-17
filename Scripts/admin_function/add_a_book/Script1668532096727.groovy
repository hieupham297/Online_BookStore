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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/Online_BookStore/index.php')

WebUI.click(findTestObject('Object Repository/Page_Index/a_Admin Login'))

WebUI.setText(findTestObject('Object Repository/Page_Administration section/input_Name_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administration section/input_Pass_pass'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Administration section/input_Pass_submit'))

WebUI.click(findTestObject('Object Repository/Page_List book/a_Add new book'))

WebUI.setText(findTestObject('Object Repository/Page_Add new book/input_ISBN_isbn'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Add new book/input_Title_title'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Add new book/input_Author_author'), 'hieupham')

WebUI.setText(findTestObject('Object Repository/Page_Add new book/textarea_Description_descr'), 'hello world')

WebUI.setText(findTestObject('Object Repository/Page_Add new book/input_Price_price'), '10.00')

WebUI.setText(findTestObject('Object Repository/Page_Add new book/input_Publisher_publisher'), 'hieupham')

WebUI.click(findTestObject('Object Repository/Page_Add new book/input_Publisher_add'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_List book/td_test'), 'test')

WebUI.closeBrowser()

