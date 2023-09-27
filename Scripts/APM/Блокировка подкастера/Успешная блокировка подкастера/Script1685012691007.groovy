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

WebUI.navigateToUrl(GlobalVariable.urlAPM)

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Подкастеры'))

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Подкастеры'))

WebUI.setText(findTestObject('АРМ/АРМ. Подкастеры/Строка поиска'), GlobalVariable.name)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Контекстное меню'))

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Контекстное меню Заблокировать'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Заблокировать подкаст'))

WebUI.verifyElementText(findTestObject('АРМ/АРМ. Подкастеры/Имя подкастера'), GlobalVariable.name)

WebUI.verifyElementText(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Почта подкастера'), GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Причина блокировки'))

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Причина блокировки Другое'))

WebUI.setText(findTestObject('АРМ/АРМ. Подкастеры/Комментарий к блокировке'), 'АвтоТестовая блокировка')

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Имя подкастера'))

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Заблокировать подкаст'))

WebUI.verifyElementPresent(findTestObject('Object Repository/АРМ/АРМ. Подкастеры/Статус Заблокирован'), 60)

