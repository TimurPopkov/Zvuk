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

WebUI.click(findTestObject('Лендинг/Принять'))

String chars = 'abcdefghijklmnopqrstuvwxyz0123456789'

String emailName = randomString(chars, 10)

GlobalVariable.email = (emailName + '_self@mailto.plus')

WebUI.setText(findTestObject('Лендинг/Почта'), GlobalVariable.email)

WebUI.setText(findTestObject('Лендинг/Имя'), emailName)

GlobalVariable.name = emailName

WebUI.setText(findTestObject('Лендинг/Пароль'), GlobalVariable.password)

WebUI.setText(findTestObject('Лендинг/ПовторПароля'), GlobalVariable.password)

WebUI.click(findTestObject('Лендинг/Чекбокс1'))

WebUI.click(findTestObject('Лендинг/Присоединиться'))

String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    String userName = sb.toString()

    return userName
}

