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

WebUI.click(findTestObject('Object Repository/Page_Index/a_Publisher'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_List Of Publishers/p_List of Publisher'), 'List of Publisher')

WebUI.click(findTestObject('Object Repository/Page_List Of Publishers/a_Wrox'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Books Per Publisher/p_Publishers  Wrox'), 'Publishers > Wrox')

WebUI.click(findTestObject('Object Repository/Page_Books Per Publisher/a_Publishers'))

WebUI.click(findTestObject('Object Repository/Page_List Of Publishers/a_Wiley'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Books Per Publisher/p_Publishers  Wiley'), 'Publishers > Wiley')

WebUI.closeBrowser()

