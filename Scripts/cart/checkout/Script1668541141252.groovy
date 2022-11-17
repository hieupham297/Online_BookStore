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

WebUI.click(findTestObject('Object Repository/Page_Index/img_Welcome to online CSE bookstore_img-res_4519e7'))

WebUI.click(findTestObject('Object Repository/Page_Android Studio New Media Fundamentals/input_Price_cart'))

WebUI.click(findTestObject('Object Repository/Page_Your shopping cart/a_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Full Catalogs of Books/img_My Cart_img-responsive img-thumbnail'))

WebUI.click(findTestObject('Object Repository/Page_Doing Good By Doing Good/input_Price_cart'))

WebUI.click(findTestObject('Object Repository/Page_Your shopping cart/a_Go To Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checking out/input_Name_name'), 'hieu')

WebUI.setText(findTestObject('Object Repository/Page_Checking out/input_Address_address'), 'TB')

WebUI.setText(findTestObject('Object Repository/Page_Checking out/input_City_city'), 'Minh Chau')

WebUI.setText(findTestObject('Object Repository/Page_Checking out/input_Zip Code_zip_code'), '2907')

WebUI.setText(findTestObject('Object Repository/Page_Checking out/input_Country_country'), 'VN')

WebUI.click(findTestObject('Object Repository/Page_Checking out/input_Country_submit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Purchase/select_VISA                  MasterCard    _b53c2c'), 
    'MasterCard', true)

WebUI.setText(findTestObject('Object Repository/Page_Purchase/input_Number_card_number'), '0123456789')

WebUI.setText(findTestObject('Object Repository/Page_Purchase/input_PID_card_PID'), '1005')

WebUI.setText(findTestObject('Object Repository/Page_Purchase/input_Name_card_owner'), 'hieupham')

WebUI.click(findTestObject('Object Repository/Page_Purchase/button_Purchase'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Purchase Process/p_Your order has been processed sucessfully_7023db'), 
    'Your order has been processed sucessfully. Please check your email to get your order confirmation and shipping detail!. Your cart has been empty.')

WebUI.closeBrowser()

