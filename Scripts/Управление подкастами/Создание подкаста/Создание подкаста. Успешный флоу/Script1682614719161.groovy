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


WebUI.click(findTestObject('Object Repository/Меню подкастов/Управление подкастами'))

WebUI.click(findTestObject('Object Repository/Меню подкастов/Создать новый'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/01. Информация о подкасте'))

WebUI.setText(findTestObject('Object Repository/Форма создания подкаста/Название подкаста'), GlobalVariable.name)

WebUI.sendKeys(findTestObject('Object Repository/Форма создания подкаста/Описание'), 'Новое описание')

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/02. Обложка'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Форма создания подкаста/Загрузить изображение'), dirName + GlobalVariable.picture)

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/Сохранить'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/04. Категории'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/Категории'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/КатегорияБизнес'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/Подкатегория'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/ПодкатегорияИнвестиции'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/05. Владелец'))

WebUI.setText(findTestObject('Object Repository/Форма создания подкаста/ИмяАвтора'), 'Тимур')

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/06. Прочее'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/Сохранить и посмотреть'))

WebUI.click(findTestObject('Object Repository/Форма создания подкаста/Создать подкаст'))

WebUI.verifyElementText(findTestObject('Object Repository/Форма создания подкаста/Вы добавили подкаст'), ((('Вы добавили подкаст:' + 
    '\n') + '«') + GlobalVariable.name) + '»')

WebUI.verifyElementClickable(findTestObject('Object Repository/Форма создания подкаста/Добавить эпизод'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Форма создания подкаста/Не сейчас'))

