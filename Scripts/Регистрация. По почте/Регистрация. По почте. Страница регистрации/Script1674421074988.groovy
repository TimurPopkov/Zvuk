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

WebUI.click(findTestObject('Лендинг/Зарегистрироваться'))

WebUI.scrollToElement(findTestObject('Лендинг/Заголовок Регистрация'), 0)

WebUI.verifyElementText(findTestObject('Лендинг/Заголовок Регистрация'), 'Регистрация')

WebUI.verifyElementText(findTestObject('Лендинг/Текст Регистрация'), 'Зарегистрируйтесь и загружайте свои подкасты бесплатно.')

WebUI.verifyElementClickable(findTestObject('Лендинг/Почта'))

WebUI.verifyElementClickable(findTestObject('Лендинг/Имя'))

WebUI.verifyElementClickable(findTestObject('Лендинг/Пароль'))

WebUI.verifyElementClickable(findTestObject('Лендинг/ПовторПароля'))

WebUI.verifyElementText(findTestObject('Лендинг/Минимум 10 символов'), 'Минимум 10 символов')

WebUI.verifyElementText(findTestObject('Лендинг/Хотя бы 1 цифру'), 'Хотя бы 1 цифру')

WebUI.verifyElementText(findTestObject('Лендинг/Хотя бы 1 спец. символ'), 'Хотя бы 1 спец. символ')

WebUI.verifyElementText(findTestObject('Лендинг/Одну заглавную букву'), 'Одну заглавную букву')

WebUI.verifyElementText(findTestObject('Лендинг/ТекстЧекбокса1'), 'Я ознакомился с офертой и согласен на обработку персональных данных')

WebUI.verifyElementClickable(findTestObject('Лендинг/Чекбокс1'))

WebUI.verifyElementText(findTestObject('Лендинг/ТекстЧекбокса2'), 'Я согласен на получение новой информации о продуктах и услугах')

WebUI.verifyElementClickable(findTestObject('Лендинг/Чекбокс2'))

WebUI.verifyElementText(findTestObject('Лендинг/Присоединиться'), 'Присоединиться')

WebUI.verifyElementNotClickable(findTestObject('Лендинг/Присоединиться'))

WebUI.verifyElementText(findTestObject('Лендинг/Уже есть аккаунт'), 'Уже есть аккаунт?')

WebUI.verifyElementClickable(findTestObject('Лендинг/Войти'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

