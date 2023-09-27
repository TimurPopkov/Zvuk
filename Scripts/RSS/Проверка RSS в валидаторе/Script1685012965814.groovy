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
import org.eclipse.persistence.jpa.jpql.Assert.AssertException as AssertException
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Левая панель/Настройка подкаста'))

WebUI.click(findTestObject('Object Repository/Дистрибуция/Дистрибуция'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Дистрибуция/RSS вашего подкаста'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Дистрибуция/Ссылка RSS'))

GlobalVariable.linkRSS = WebUI.getAttribute(findTestObject('Object Repository/Дистрибуция/Ссылка RSS'), 'Value')

switch (GlobalVariable.url) {
    case GlobalVariable.dev:
        def originalUrl = GlobalVariable.linkRSS

        modifyAndSetLinkRSS(originalUrl)

        break
    case GlobalVariable.preprod:
        def originalUrl = GlobalVariable.linkRSS

        modifyAndSetLinkRSS(originalUrl)

        break
    case GlobalVariable.prod:
        linkRSS = WebUI.getAttribute(findTestObject('Object Repository/Дистрибуция/Ссылка RSS'), 'Value')

        break
}

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.rssValidator + linkRSS)

WebUI.switchToWindowTitle('Podbase - Podcast Validator')

WebUI.click(findTestObject('Podbase - Podcast Validator/button_Go'))

WebUI.verifyElementPresent(findTestObject('Podbase - Podcast Validator/button_Done'), 30)

WebUI.verifyEqual(WebUI.findWebElements(findTestObject('Object Repository/Podbase - Podcast Validator/Галочка'), 2).findAll().size(), 
    15)

WebUI.verifyEqual(WebUI.findWebElements(findTestObject('Object Repository/Podbase - Podcast Validator/Крестик'), 2).findAll().size(), 
    2)

def modifyAndSetLinkRSS(def originalUrl) {
    def modifiedUrl = originalUrl.replace('zvq.me', 'zvooq.ru')

    linkRSS = modifiedUrl
}

