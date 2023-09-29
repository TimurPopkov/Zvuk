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
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import org.openqa.selenium.WebElement as WebElement

WebUI.verifyElementVisible(findTestObject('Object Repository/Мини-сайт/Обложка подкаста'))

WebUI.verifyElementText(findTestObject('Object Repository/Мини-сайт/Имя подкаста'), GlobalVariable.name)

WebUI.verifyElementText(findTestObject('Object Repository/Мини-сайт/Параграф'), 'Автор: ТимурКатегория: Бизнес: Инвестиции')

WebUI.waitForElementVisible(findTestObject('Object Repository/Мини-сайт/Скопировать RSS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Мини-сайт/Cвязаться со мной'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Мини-сайт/От новых к старым'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Мини-сайт/Списокэпизодов'), 1)

WebUI.delay(120)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Мини-сайт/Эпизод_Deffered'), 360)

WebUI.verifyElementPresent(findTestObject('Мини-сайт/Эпизод_Published'), 360)

WebUI.refresh()

