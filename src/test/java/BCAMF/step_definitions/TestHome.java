package BCAMF.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BCAMF.pages.Home;
import BCAMF.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestHome {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private Home home = new Home();
	
	public TestHome() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	// Dashboard Home
	@When("User go to Dashboard Home")
	public void User_go_to_dashboard_home() {
		driver.get(Constants.URL);
		delay(3);
		scroll(600);
		extentTest.log(LogStatus.PASS, "User go to Dashboard Home");
	}
	
	@Then("Click expertise trainings")
	public void click_expertise_trainings() {
		home.clickExpertiseTrainings();
		delay(4);
		extentTest.log(LogStatus.PASS, "Click expertise trainings");
	}
	
	@And("Click expertise tools")
	public void click_expertise_tools() {
		home.clickExpertiseTools();
		delay(3);
		extentTest.log(LogStatus.PASS, "Click expertise tools");
	}
	
	@And("Click company 1")
	public void click_company_1() {
		scroll(250);
		delay(3);
		home.clickCompany1();
		delay(3);
		scroll(350);
		extentTest.log(LogStatus.PASS, "Click company 1");
	}
	
	@And("Click company 2")
	public void click_company_2() {
		
//		delay(3);
		home.clickCompany2();
		delay(3);
		extentTest.log(LogStatus.PASS, "Click company 2");
	}
	
//	@And("Click company 3")
//	public void click_company_3() {
//		home.clickCompany3();
//		extentTest.log(LogStatus.PASS, "Click company 3");
//	}
//	
//	@And("Click company 4")
//	public void click_company_4() {
//		home.clickCompany4();
//		extentTest.log(LogStatus.PASS, "Click company 4");
//	}
//	
//	@And("Click company 5")
//	public void click_company_5() {
//		home.clickCompany5();
//		extentTest.log(LogStatus.PASS, "Click company 5");
//	}
//	
//	@And("Click company 6")
//	public void click_company_6() {
//		home.clickCompany6();
//		extentTest.log(LogStatus.PASS, "Click company 6");
//	}
//	
//	@And("Click company 7")
//	public void click_company_7() {
//		home.clickCompany1();
//		extentTest.log(LogStatus.PASS, "Click company 7");
//	}
//	
//	@And("Click company 8")
//	public void click_company_8() {
//		home.clickCompany1();
//		extentTest.log(LogStatus.PASS, "Click company 8");
//	}
//	
//	@And("Click company 9")
//	public void click_company_9() {
//		home.clickCompany9();
//		extentTest.log(LogStatus.PASS, "Click company 9");
//	}
	
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void scroll(int vertikal) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertikal+")");
	}
}
