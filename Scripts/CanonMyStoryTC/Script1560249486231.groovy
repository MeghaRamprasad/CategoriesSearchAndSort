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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://snapshotstaging.havasstaging.com/india/en')

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/a_my canon story'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/a_inspirations'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/a_my canon story'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/span_upload image'))

WebUI.setText(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/input_Sign in with Canon ID_email'), 
    'megha.ramprasad@ekino.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/input_Sign in with Canon ID_password'), 
    '33YpLWRH5+1iHasUK4u8Kg==')

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/button_Sign in'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/span_upload image'))

WebUI.setText(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/input_Submit A Story_Mystoriestitle'), 
    'Automation Uploading 1')

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/label_Maximum number of characters should not exceed 65_getFile1_img'))

WebUI.setText(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/input_Submit A Story_Mystoriestitle'), 
    'Automation Uploading 1')

WebUI.setText(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/textarea_Exposure Compensation_Mystoriescontent'), 
    'Tell your story in the story box')

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/span_Maximum number of characters should not exceed 3000_checkmark'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/span_Maximum number of characters should not exceed 3000_checkmark'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/button_preview'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/span_Maximum number of characters should not exceed 3000_checkmark'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_SNAPSHOT - Photography  photo articles brought to you by Canon/button_preview'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_Automation Uploading 1/h1_Automation Uploading 1'))

WebUI.click(findTestObject('Object Repository/CanonMyStory/Page_Automation Uploading 1/p_Tell your story in the story box'))

