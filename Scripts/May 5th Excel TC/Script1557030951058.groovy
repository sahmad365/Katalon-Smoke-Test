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

WebUI.navigateToUrl('https://ondemand.ca.com/web/portal/login?TYPE=33554433&REALMOID=06-000ef9db-0146-19ef-9589-0194ac184032&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-U2oxHNw%2fhwkS9d8eFxBR4kd609FfW4%2b3jBM0jHQpPFSdBOnBEsclAUJfVaZnAfcL&TARGET=-SM-https%3a%2f%2fondemand%2eca%2ecom%2fweb%2fselect%2fdestination')

WebUI.setText(findTestObject('Object Repository/Shakil Login Test Excel/Page_Sign In - cacom/input_Email Address__58_login'), 
    varEmailAddress)

WebUI.setText(findTestObject('Object Repository/Shakil Login Test Excel/Page_Sign In - cacom/input_Password__58_password'), 
    varPassword)

WebUI.click(findTestObject('Object Repository/Shakil Login Test Excel/Page_Sign In - cacom/input_My Preferred Page_goToPrefPageChoiceCheckbox'))

