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

WebUI.click(findTestObject('Object Repository/Page_Index/a_My Cart'))

WebUI.verifyElementText(findTestObject('Page_Your shopping cart/p_Your cart is empty Please make sure you a_c3a7e9'), 'Your cart is empty! Please make sure you add some books in it!')

WebUI.click(findTestObject('Object Repository/Page_Your shopping cart/a_CSE Bookstore'))

WebUI.click(findTestObject('Object Repository/Page_Index/img_Welcome to online CSE bookstore_img-res_4519e7'))

WebUI.click(findTestObject('Object Repository/Page_C 6.0 in a Nutshell, 6th Edition/input_Price_cart'))

WebUI.verifyElementText(findTestObject('Page_Your shopping cart/td_C 6.0 in a Nutshell, 6th Edition by Jose_8714a3'), 'C# 6.0 in a Nutshell, 6th Edition by Joseph Albahari, Ben Albahari')

WebUI.click(findTestObject('Object Repository/Page_Your shopping cart/a_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Full Catalogs of Books/img_My Cart_img-responsive img-thumbnail'))

WebUI.click(findTestObject('Object Repository/Page_Learning Mobile App Development/input_Price_cart'))

WebUI.verifyElementText(findTestObject('Page_Your shopping cart/td_Learning Mobile App Development by Jakob_9fe3b4'), 'Learning Mobile App Development by Jakob Iversen, Michael Eierman')

WebUI.closeBrowser()

