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

switch (GlobalVariable.url) {
    case GlobalVariable.dev:
        GlobalVariable.urlAPM = GlobalVariable.urlAPMdev

        break
    case GlobalVariable.preprod:
        GlobalVariable.urlAPM = GlobalVariable.urlAPMpreprod

        break
    case GlobalVariable.prod:
        GlobalVariable.urlAPM = GlobalVariable.urlAPMprod

        break
}

WebUI.navigateToUrl(GlobalVariable.urlAPM)

WebUI.verifyElementVisible(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Вход'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Добро пожаловать'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Почта'))

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Пароль'))

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Войти'))

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Забыли пароль'))

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Забыли пароль'))

WebUI.verifyElementVisible(findTestObject('Object Repository/АРМ/АРМ. Восстановление пароля/Восстановление пароля'))

WebUI.verifyElementVisible(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Введите адрес электронной почты'))

WebUI.verifyElementClickable(findTestObject('Object Repository/АРМ/АРМ. Восстановление пароля/Сбросить пароль'))

WebUI.setText(findTestObject('Object Repository/АРМ/АРМ. Авторизация/Почта'), GlobalVariable.emailAdm)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/АРМ/АРМ. Восстановление пароля/Сбросить пароль'))

WebUI.verifyElementPresent(findTestObject('Восстановление пароля/Перейдите по ссылке из письма'), 30)

WebUI.navigateToUrl(GlobalVariable.emailServices)

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('Object Repository/Почтовый ресурс/Емеил'))

WebUI.sendKeys(findTestObject('Object Repository/Почтовый ресурс/Емеил'), GlobalVariable.emailAdm -= '@mailto.plus')

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Заголовок'))

WebUI.verifyElementPresent(findTestObject('Почтовый ресурс/Сброс пароля'), 360)

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Сброс пароля'))

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Восстановить пароль'))

WebUI.switchToWindowTitle('Log in to podcast-admin-realm')

WebUI.click(findTestObject('Object Repository/Кейклоак/Нажмите здесь, чтобы продолжить'))

'abcdefghijklmnopqrstuvwxyz'
String chars = '0123456789'

GlobalVariable.passwordAdm = randomString(chars, 10)

WebUI.setText(findTestObject('Object Repository/Кейклоак/Новый пароль'), GlobalVariable.passwordAdm)

WebUI.setText(findTestObject('Object Repository/Кейклоак/Повторите пароль'), GlobalVariable.passwordAdm)

WebUI.click(findTestObject('Object Repository/Кейклоак/Подтвердить'))

WebUI.verifyElementText(findTestObject('Object Repository/Кейклоак/Ваша учетная запись успешно обновлена'), 'Ваша учетная запись успешно обновлена.')

String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    String userPass = '!Password' + sb.toString()

    return userPass
}

