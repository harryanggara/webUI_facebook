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

WebUI.navigateToUrl('https://id-id.facebook.com/')

WebUI.setText(findTestObject('Object Repository/login menggunakan akun yang tidak terdaftar/Page_Facebook - Masuk atau Daftar/input_Facebook membantu Anda terhubung dan _d8519f'), 
    'notaslimboy11@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login menggunakan akun yang tidak terdaftar/Page_Facebook - Masuk atau Daftar/input_Facebook membantu Anda terhubung dan _cfe51c'), 
    'mO2eEtolEvnyeBLuKz/tAw==')

WebUI.click(findTestObject('Object Repository/login menggunakan akun yang tidak terdaftar/Page_Facebook - Masuk atau Daftar/button_Masuk'))

WebUI.click(findTestObject('Object Repository/login menggunakan akun yang tidak terdaftar/Page_Masuk Facebook/div_Email yang Anda masukkan tidak terhubun_7920f6'))
