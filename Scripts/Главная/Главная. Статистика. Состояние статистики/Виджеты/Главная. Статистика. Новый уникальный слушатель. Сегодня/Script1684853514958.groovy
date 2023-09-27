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

WebUI.navigateToUrl(GlobalVariable.url + '/w/dashboard')

not_run: WebUI.click(findTestObject('Object Repository/Меню подкастов/Управление подкастами'))

not_run: WebUI.click(findTestObject('Object Repository/Меню подкастов/Созданый подкаст из списка'))

checkUpdateStatistic = WebUI.getText(findTestObject('Дашбоард/Статистика/Виджеты/Аудитория'))

if (checkUpdateStatistic == '0') {
    WebUI.delay(60)
}

WebUI.verifyElementText(findTestObject('Дашбоард/Статистика/Виджеты/Аудитория'), '3')

WebUI.verifyElementText(findTestObject('Дашбоард/Статистика/Виджеты/Уникальные прослушивания'), '4', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Дашбоард/Статистика/Виджеты/Всего прослушиваний'), '6', FailureHandling.CONTINUE_ON_FAILURE)

