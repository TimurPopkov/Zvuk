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

String dirName = System.getProperty('user.dir')

WebUI.verifyElementClickable(findTestObject('Дашбоард/Добавить эпизод'))

WebUI.click(findTestObject('Дашбоард/Добавить эпизод'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Форма создания эпизода/Загрузить аудиодорожку'), dirName + GlobalVariable.audio)

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Имя эпизода'), 'Published')

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Номер сезона'), '1')

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Номер эпизода'), '1')

WebUI.verifyElementClickable(findTestObject('Object Repository/Форма создания эпизода/Далее'))

WebUI.click(findTestObject('Object Repository/Форма создания эпизода/Далее'))

WebUI.click(findTestObject('Object Repository/Форма создания эпизода/Опубликовать эпизод'))

WebUI.verifyElementText(findTestObject('Форма создания эпизода/Вы добавили эпизод'), 'Вы добавили эпизод!')

WebUI.verifyElementText(findTestObject('Форма создания эпизода/Параграф'), 'Теперь вы можете опубликовать подкаст на различных площадках.')

WebUI.click(findTestObject('Форма создания эпизода/Настроить дистрибуцию'))

