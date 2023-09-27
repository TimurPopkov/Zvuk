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

WebUI.click(findTestObject('Object Repository/Лендинг/Принять'))

WebUI.click(findTestObject('Object Repository/Лендинг/Войти'))

WebUI.click(findTestObject('Object Repository/Авторизация/Забыли пароль'))

WebUI.setText(findTestObject('Object Repository/Авторизация/Почта'), 'recoverpassword@mailto.plus')

WebUI.click(findTestObject('Object Repository/Восстановление пароля/Сбросить пароль'))

WS.sendRequestAndVerify(findTestObject('Web Service Request/GET_a_auth_passwordRecover'))

WebUI.navigateToUrl('https://tempmail.plus/en/#!')

WebUI.doubleClick(findTestObject('Почтовый ресурс/Емеил'))

WebUI.sendKeys(findTestObject('Почтовый ресурс/Емеил'), 'recoverpassword')

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Заголовок'))

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Сброс пароля'))

WebUI.click(findTestObject('Object Repository/Почтовый ресурс/Восстановить пароль'))

WebUI.switchToWindowTitle('Log in to podcast-realm')

WebUI.click(findTestObject('Object Repository/Кейклоак/Нажмите здесь, чтобы продолжить'))

'abcdefghijklmnopqrstuvwxyz'
String chars = '0123456789'

String password1 = randomString(chars, 10)

String password2 = randomString(chars, 10)

WebUI.setText(findTestObject('Object Repository/Кейклоак/Новый пароль'), password1)

WebUI.setText(findTestObject('Object Repository/Кейклоак/Повторите пароль'), password2)

String randomString(String chars, int length) {
	Random rand = new Random()

	StringBuilder sb = new StringBuilder()

	for (int i = 0; i < length; i++) {
		sb.append(chars.charAt(rand.nextInt(chars.length())))
	}
	
	String userName = '!Password' + sb.toString()

	return userName
}
