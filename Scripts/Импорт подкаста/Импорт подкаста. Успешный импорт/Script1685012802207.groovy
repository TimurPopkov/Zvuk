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

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/Меню подкастов/Управление подкастами'))

WebUI.click(findTestObject('Object Repository/Меню подкастов/Перенести'))

WebUI.verifyElementText(findTestObject('Object Repository/Импорт/Перенос подкаста'), 'Перенос подкаста')

WebUI.verifyElementText(findTestObject('Object Repository/Импорт/Текст1'), 'Чтобы перенести свой подкаст в Студио для подкастеров, вставьте ссылку на RSS.')

WebUI.verifyElementText(findTestObject('Object Repository/Импорт/Текст3'), '01. Введите ссылку на RSS подкаста')

WebUI.verifyElementClickable(findTestObject('Object Repository/Импорт/Поле RSS'))

WebUI.setText(findTestObject('Object Repository/Импорт/Поле RSS'), 'https://st.zvuk.com/r/e2b42939-704c-4ac2-bded-4fd613aff39f/rss.xml')

WebUI.click(findTestObject('Object Repository/Импорт/Перенос подкаста'))

WebUI.verifyElementText(findTestObject('Object Repository/Импорт/Текст2'), 'Я обладаю всеми необходимыми правами для импорта данного подкаста')

WebUI.verifyElementVisible(findTestObject('Object Repository/Импорт/Обложка'))

WebUI.click(findTestObject('Object Repository/Импорт/Чекбокс'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Импорт/Разместить'))

WebUI.click(findTestObject('Object Repository/Импорт/Разместить'))

WebUI.navigateToUrl(GlobalVariable.emailServices)

WebUI.waitForPageLoad(2)

WebUI.doubleClick(findTestObject('Object Repository/Почтовый ресурс/Емеил'))

WebUI.sendKeys(findTestObject('Object Repository/Почтовый ресурс/Емеил'), 'timur_self')

WebUI.clickOffset(findTestObject('Object Repository/Почтовый ресурс/Заголовок'), 0, 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Почтовый ресурс/Подтверждение права на подкаст'))

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Подтверждение права на подкаст'))

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/ссылке'))

WebUI.switchToWindowTitle('Импорт подкаста - Newtest')

'abcdefghijklmnopqrstuvwxyz'
String chars = '0123456789'

GlobalVariable.nameMiniSite = randomString(chars, 10)

WebUI.setText(findTestObject('Object Repository/Форма создания подкаста/Название мини-сайта'), GlobalVariable.nameMiniSite)

WebUI.sendKeys(findTestObject('Object Repository/Форма создания подкаста/Название мини-сайта'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Импорт/Ваш подкаст импортируется'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Меню подкастов/Управление подкастами'), 'Newtest')

WebUI.click(findTestObject('Object Repository/Меню подкастов/Управление подкастами'))

WebUI.click(findTestObject('Object Repository/Меню подкастов/Созданый подкаст из списка'))

String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    String randName = 'site' + sb.toString()

    return randName
}

