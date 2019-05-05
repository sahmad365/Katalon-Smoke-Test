import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ondemand.ca.com/web/portal/login?TYPE=33554433&REALMOID=06-000ef9db-0146-19ef-9589-0194ac184032&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-9E%2bt4IHKcHnn%2bd%2bnKb%2fe%2fBV%2b8a53t6HsZ4LuYkUqi7z9NNaOn5eD65JE4VZt9pLT&TARGET=-SM-https%3a%2f%2fondemand%2eca%2ecom%2fweb%2fselect%2fdestination')

WebUI.setText(findTestObject('Object Repository/Login-CurtContractor/Page_Sign In - cacom/input_Email Address__58_login'), 
    'Curt.Contractor@disney.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login-CurtContractor/Page_Sign In - cacom/input_Password__58_password'), 
    'UJmjB4vZ9jiXq6ejA9SnaQ==')

WebUI.click(findTestObject('Object Repository/Login-CurtContractor/Page_Sign In - cacom/input'))

WebUI.click(findTestObject('Object Repository/Login-CurtContractor/Page_My Places - cacom/a_WDPR Tomorrowland - Test'))

WebUI.click(findTestObject('Object Repository/Login-CurtContractor/Page_PPM - Last Refreshed on 4222019  Overview General/a_Logout'))

