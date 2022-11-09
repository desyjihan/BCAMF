package BCAMF.step_definitions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BCAMF.drivers.DriverSingleton;
import BCAMF.utils.Constants;
import BCAMF.utils.TestScenarios;
import BCAMF.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/extent-reports.html");
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		TestScenarios[] tests = TestScenarios.values();
		extentTest = reports.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" " , "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
		
//		delay(3);
//		DriverSingleton.closeObjectInstance();
	}
	
	@AfterAll
	public static void closeBrowser() {
	delay(2);
	DriverSingleton.closeObjectInstance();
}
		

static void delay(int detik) {
	try {
		Thread.sleep(1000*detik);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

static void scroll(int vertical) {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("window.scrollBy(0,"+vertical+")");
}

}
