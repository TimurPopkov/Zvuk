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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import com.kms.katalon.core.configuration.RunConfiguration as RC

String dirName = RC.getProjectDir()

// Создаем объект Calendar и устанавливаем текущую дату и время
Calendar calendar = Calendar.getInstance()

// Добавляем 1,3 минуты к текущему времени
calendar.add(Calendar.MINUTE, 1)

calendar.add(Calendar.SECOND, 20)

// Получаем новую дату и время после добавления одной минуты
String formattedDate = new SimpleDateFormat('dd.MM.yyyy HH:mm').format(calendar.time)

WebUI.verifyElementClickable(findTestObject('Дашбоард/Добавить эпизод'))

WebUI.click(findTestObject('Дашбоард/Добавить эпизод'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/Форма создания эпизода/Загрузить аудиодорожку'), dirName + 
    GlobalVariable.audio)

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Имя эпизода'), 'Deffered')

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Номер сезона'), '1')

WebUI.setText(findTestObject('Object Repository/Форма создания эпизода/Номер эпизода'), '2')

WebUI.setText(findTestObject('Форма создания эпизода/Опубликовать позже'), formattedDate)

WebUI.verifyElementClickable(findTestObject('Object Repository/Форма создания эпизода/Далее'))

WebUI.click(findTestObject('Object Repository/Форма создания эпизода/Далее'))

WebUI.click(findTestObject('Object Repository/Форма создания эпизода/Опубликовать эпизод'))

WebUI.verifyElementText(findTestObject('Список эпизодов/Отложен'), 'Отложен')

