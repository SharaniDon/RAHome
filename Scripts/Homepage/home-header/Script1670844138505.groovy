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

WebUI.navigateToUrl('https://redappleapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple/a_About'))

WebUI.click(findTestObject('Object Repository/Page_About - Redapple/img_Home_nocss'))

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple/a_Blog'))

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple Digital Health Blog/img_Twitter_tdb-logo-img td-retina-data td-_b1101f'))

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_Contact - Redapple/img_Home_nocss'))

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple/a_Schedule a Demo'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - RED APPLE DIGITAL HEALTH/a_Go to App'))

WebUI.click(findTestObject('Object Repository/Page_Home - Redapple/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Redapple Digital Health/div_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Redapple Digital Health/img'))

WebUI.closeBrowser()

