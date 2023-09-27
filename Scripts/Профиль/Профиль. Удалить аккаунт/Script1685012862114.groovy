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

WebUI.click(findTestObject('Дашбоард/Аккаунт2'))

WebUI.click(findTestObject('Object Repository/Дашбоард/Профиль/Профиль'))

WebUI.mouseOver(findTestObject('Object Repository/Удаление аккаунта/Заголовок Удалить аккаунт'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.click(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Удаление аккаунта/Вы уверены, что хотите удалить свой аккаунт'), 
    'Вы уверены, что хотите удалить свой аккаунт?При удалении аккаунта удалятся все ваши подкасты и эпизоды')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Удаление аккаунта/В течение 30 дней'), 'В течение 30 дней вы сможете обратиться в службу поддержки для восстановления аккаунта (в этот период у вас не будет возможности зарегистрировать новый аккаунт на эту же почту)')

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Отмена'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.click(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.verifyElementText(findTestObject('Object Repository/Удаление аккаунта/Возможно мы можем вам помочь'), 'Возможно мы можем вам помочь?')

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Отмена'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Далее'))

WebUI.click(findTestObject('Object Repository/Удаление аккаунта/Далее'))

WebUI.click(findTestObject('Object Repository/Удаление аккаунта/Далее'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.setText(findTestObject('Object Repository/Удаление аккаунта/Напишите УДАЛИТЬ'), 'УДАЛИТЬ')

WebUI.verifyElementClickable(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.click(findTestObject('Object Repository/Удаление аккаунта/Удалить аккаунт'))

WebUI.verifyElementText(findTestObject('Object Repository/Лендинг/Заголовок Регистрация'), 'Регистрация')

