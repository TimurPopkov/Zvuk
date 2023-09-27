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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Лендинг/Принять'))

WebUI.setText(findTestObject('Лендинг/Почта'), 'test@mail')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'testtest.com')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'te st@mail.com')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'test@ma il.com')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), '@mail.com')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'te')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'test')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), 'testreallylonnlonglonglonglonglongsy64symbolsemailaddress@mail.ru')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаПочты'), errorEmail)

WebUI.setText(findTestObject('Лендинг/Почта'), '')

WebUI.clickOffset(findTestObject('Лендинг/Текст Регистрация'), 0, 0)

WebUI.verifyElementText(findTestObject('Лендинг/ОшибкаВведитеЕмейл'), noneEmail)

WebUI.closeBrowser()

