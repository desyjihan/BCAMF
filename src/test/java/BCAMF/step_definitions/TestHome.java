package BCAMF.step_definitions;

import java.util.ArrayList;

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
		System.out.println("Expertise Trainings");
		delay(4);
		extentTest.log(LogStatus.PASS, "Click expertise trainings");
	}
	
	@And("Click expertise tools")
	public void click_expertise_tools() {
		home.clickExpertiseTools();
		System.out.println("Expertise Tools");
		delay(3);
		extentTest.log(LogStatus.PASS, "Click expertise tools");
	}
	
	@And("Click company 1")
	public void click_company_1() {
		scroll(500);
		delay(3);
		home.clickCompany1();
		delay(7);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    System.out.println(driver.getTitle());
	    System.out.println("skydiving");
		extentTest.log(LogStatus.PASS, "Click company 1");
	}
	
	@And("Click company 2")
	public void click_company_2() {
		delay(3);
		home.clickCompany2();
		delay(7);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    System.out.println(driver.getTitle());
	    System.out.println("basck");
		extentTest.log(LogStatus.PASS, "Click company 2");
	}
	
//	@And("Click company 3")
//	public void click_company_3() {
//		delay(3);
//		home.clickCompany3();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("CWS");
//		extentTest.log(LogStatus.PASS, "Click company 3");
//	}
//	
//	@And("Click company 4")
//	public void click_company_4() {
//		delay(3);
//		home.clickCompany4();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("PedalWorks");
//		extentTest.log(LogStatus.PASS, "Click company 4");
//	}
//	
//	@And("Click company 5")
//	public void click_company_5() {
//		delay(3);
//		home.clickCompany5();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("BrokersDirect");
//		extentTest.log(LogStatus.PASS, "Click company 5");
//	}
//	
//	@And("Click company 6")
//	public void click_company_6() {
//		delay(3);
//		home.clickCompany6();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("DeskPro");
//		extentTest.log(LogStatus.PASS, "Click company 6");
//	}
//	
//	@And("Click company 7")
//	public void click_company_7() {
//		delay(3);
//		home.clickCompany7();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("Skiplex");
//		extentTest.log(LogStatus.PASS, "Click company 7");
//	}
//	
//	@And("Click company 8")
//	public void click_company_8() {
//		delay(3);
//		home.clickCompany8();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("AntonyUsher");
//		extentTest.log(LogStatus.PASS, "Click company 8");
//	}
//	
//	@And("Click company 9")
//	public void click_company_9() {
//		delay(3);
//		home.clickCompany9();
//		delay(7);
//		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(1));
//		System.out.println(driver.getTitle());
//		driver.close();
//	    driver.switchTo().window(tabs2.get(0));
//	    System.out.println(driver.getTitle());
//	    System.out.println("glossom");
//		extentTest.log(LogStatus.PASS, "Click company 9");
//	}
	
	
	@When("Click training 1")
	public void click_training_1() {
		scroll(400);
		delay(3);
		home.clickTraining1();
		delay(3);
	}
	
	@Then("Click training joining benefits 1")
	public void click_training_joining_benefits_1() {
		scroll(450);
		home.clickJoiningBenefits();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training joining benefits 1");
	}
	
	@And("Click training course content 1")
	public void click_training_course_content_1() {
		home.clickCourseContent();
		delay(3);
//		home.clickSlideSesudah();
//		delay(2);
//		home.clickSlideSebelum();
//		delay(2);
//		home.clickFullscreen();
//		delay(2);
//		driver.findElement(By.cssSelector("img[src='https://i2.wp.com/globalsqa.com//wp-content/uploads/2013/12/logo-3.png?w=940']']")).sendKeys(Keys.ESCAPE);
		extentTest.log(LogStatus.PASS, "Click training course content 1");
	}
	
	@And("Click training batch schedule 1")
	public void click_training_batch_schedule_1() {
		home.clickBatchSchedule();
		delay(3);
		extentTest.log(LogStatus.PASS, "Click training batch schedule 1");
	}
	
	@And("Click enroll now weekend batch 1")
	public void click_enroll_now_weekend_batch_1() {
		home.clickEnrollNowWeekendBatch();
		delay(10);
		ArrayList<String> training1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training1.get(1));
		System.out.println(driver.getTitle());
		delay(2);
		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training1.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekend batch 1");
	}
	
	@And("Click enroll now weekday batch 1")
	public void click_enroll_now_weekday_batch_1() {
	    home.clickEnrollNowWeekdayBatch();
	    delay(10);
		ArrayList<String> training1_2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training1_2.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training1_2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekday batch 1");
	}
	
	@And("Click enroll now fast track 1")
	public void click_enroll_now_fast_track_1() {
	    home.clickEnrollNowFastTrack();
	    delay(10);
		ArrayList<String> training1_3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training1_3.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training1_3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    home.clickHome();
	    extentTest.log(LogStatus.PASS, "Click enroll now fast track 1");
	}
	
	@And("Close Ads")
	public void close_ads() {
		delay(2);
		home.closeAds();
		delay(3);
	}
	
	@When("Click training 2")
	public void click_training_2() {
		scroll(600);
		delay(3);
		home.clickTraining2();
		delay(3);
	}
	
	@Then("Click training joining benefits 2")
	public void click_training_joining_benefits_2() {
		scroll(450);
		home.clickJoiningBenefits();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training joining benefits 2");
	}
	
	@And("Click training course content 2")
	public void click_training_course_content_2() {
		home.clickCourseContent();
		delay(3);
//		home.clickSlideSesudah();
//		delay(2);
//		home.clickSlideSebelum();
//		delay(2);
//		home.clickFullscreen();
//		delay(2);
//		driver.findElement(By.cssSelector("img[src='https://i2.wp.com/globalsqa.com//wp-content/uploads/2013/12/logo-3.png?w=940']']")).sendKeys(Keys.ESCAPE);
		extentTest.log(LogStatus.PASS, "Click training course content 2");
	}
	
	@And("Click training batch schedule 2")
	public void click_training_batch_schedule_2() {
		home.clickBatchSchedule();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training batch schedule 2");
	}
	
	@And("Click enroll now weekend batch 2")
	public void click_enroll_now_weekend_batch_2() {
		home.clickEnrollNowWeekendBatch();
		delay(10);
		ArrayList<String> training2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training2.get(1));
		System.out.println(driver.getTitle());
		delay(2);
		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekend batch 2");
	}
	
	@And("Click enroll now weekday batch 2")
	public void click_enroll_now_weekday_batch_2() {
	    home.clickEnrollNowWeekdayBatch();
	    delay(10);
		ArrayList<String> training2_2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training2_2.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training2_2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekday batch 2");
	}
	
	@And("Click enroll now fast track 2")
	public void click_enroll_now_fast_track_2() {
	    home.clickEnrollNowFastTrack();
	    delay(10);
		ArrayList<String> training2_3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training2_3.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training2_3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now fast track 2");
	}
	
	@When("Click training 3")
	public void click_training_3() {
		scroll(400);
		delay(3);
		home.clickTraining3();
		delay(3);
	}
	
	@Then("Click training joining benefits 3")
	public void click_training_joining_benefits_3() {
		scroll(450);
		home.clickJoiningBenefits();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training joining benefits 3");
	}
	
	@And("Click training course content 3")
	public void click_training_course_content_3() {
		home.clickCourseContent();
		delay(3);
//		home.clickSlideSesudah();
//		delay(2);
//		home.clickSlideSebelum();
//		delay(2);
//		home.clickFullscreen();
//		delay(2);
//		driver.findElement(By.cssSelector("img[src='https://i2.wp.com/globalsqa.com//wp-content/uploads/2013/12/logo-3.png?w=940']']")).sendKeys(Keys.ESCAPE);
		extentTest.log(LogStatus.PASS, "Click training course content 3");
	}
	
	@And("Click training batch schedule 3")
	public void click_training_batch_schedule_3() {
		home.clickBatchSchedule();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training batch schedule 3");
	}
	
	@And("Click enroll now weekend batch 3")
	public void click_enroll_now_weekend_batch_3() {
		home.clickEnrollNowWeekendBatch();
		delay(10);
		ArrayList<String> training3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training3.get(1));
		System.out.println(driver.getTitle());
		delay(2);
		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekend batch 3");
	}
	
	@And("Click enroll now weekday batch 3")
	public void click_enroll_now_weekday_batch_3() {
	    home.clickEnrollNowWeekdayBatch();
	    delay(10);
		ArrayList<String> training3_2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training3_2.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training3_2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekday batch 3");
	}
	
	@And("Click enroll now fast track 3")
	public void click_enroll_now_fast_track_3() {
	    home.clickEnrollNowFastTrack();
	    delay(10);
		ArrayList<String> training3_3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training3_3.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training3_3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now fast track 3");
	}
	
	@When("Click training 4")
	public void click_training_4() {
		scroll(400);
		delay(3);
		home.clickTraining4();
		delay(3);
	}
	
	@Then("Click training joining benefits 4")
	public void click_training_joining_benefits_4() {
		scroll(450);
		home.clickJoiningBenefits();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training joining benefits 4");
	}
	
	@And("Click training course content 4")
	public void click_training_course_content_4() {
		home.clickCourseContent();
		delay(3);
//		home.clickSlideSesudah();
//		delay(2);
//		home.clickSlideSebelum();
//		delay(2);
//		home.clickFullscreen();
//		delay(2);
//		driver.findElement(By.cssSelector("img[src='https://i2.wp.com/globalsqa.com//wp-content/uploads/2013/12/logo-3.png?w=940']']")).sendKeys(Keys.ESCAPE);
		extentTest.log(LogStatus.PASS, "Click training course content 4");
	}
	
	@And("Click training batch schedule 4")
	public void click_training_batch_schedule_4() {
		home.clickBatchSchedule();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training batch schedule 4");
	}
	
	@And("Click enroll now weekend batch 4")
	public void click_enroll_now_weekend_batch_4() {
		home.clickEnrollNowWeekendBatch();
		delay(10);
		ArrayList<String> training4 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training4.get(1));
		System.out.println(driver.getTitle());
		delay(2);
		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training4.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekend batch 4");
	}
	
	@And("Click enroll now weekday batch 4")
	public void click_enroll_now_weekday_batch_4() {
	    home.clickEnrollNowWeekdayBatch();
	    delay(10);
		ArrayList<String> training4_2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training4_2.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training4_2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekday batch 4");
	}
	
	@And("Click enroll now fast track 4")
	public void click_enroll_now_fast_track_4() {
	    home.clickEnrollNowFastTrack();
	    delay(10);
		ArrayList<String> training4_3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training4_3.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training4_3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now fast track 4");
	}
	
	@When("Click training 5")
	public void click_training_5() {
		scroll(400);
		delay(3);
		home.clickTraining1();
		delay(3);
	}
	
	@Then("Click training joining benefits 5")
	public void click_training_joining_benefits_5() {
		scroll(450);
		home.clickJoiningBenefits();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training joining benefits 5");
	}
	
	@And("Click training course content 5")
	public void click_training_course_content_5() {
		home.clickCourseContent();
		delay(3);
//		home.clickSlideSesudah();
//		delay(2);
//		home.clickSlideSebelum();
//		delay(2);
//		home.clickFullscreen();
//		delay(2);
//		driver.findElement(By.cssSelector("img[src='https://i2.wp.com/globalsqa.com//wp-content/uploads/2013/12/logo-3.png?w=940']']")).sendKeys(Keys.ESCAPE);
		extentTest.log(LogStatus.PASS, "Click training course content 5");
	}
	
	@And("Click training batch schedule 5")
	public void click_training_batch_schedule_5() {
		home.clickBatchSchedule();
		delay(2);
		extentTest.log(LogStatus.PASS, "Click training batch schedule 5");
	}
	
	@And("Click enroll now weekend batch 5")
	public void click_enroll_now_weekend_batch_5() {
		home.clickEnrollNowWeekendBatch();
		delay(10);
		ArrayList<String> training5 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training5.get(1));
		System.out.println(driver.getTitle());
		delay(2);
		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training5.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekend batch 5");
	}
	
	@And("Click enroll now weekday batch 5")
	public void click_enroll_now_weekday_batch_5() {
	    home.clickEnrollNowWeekdayBatch();
	    delay(10);
		ArrayList<String> training5_2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training5_2.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training5_2.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now weekday batch 5");
	}
	
	@And("Click enroll now fast track 5")
	public void click_enroll_now_fast_track_5() {
	    home.clickEnrollNowFastTrack();
	    delay(10);
		ArrayList<String> training5_3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(training5_3.get(1));
		System.out.println(driver.getTitle());
//		home.buttonAddToCart();
		delay(2);
		home.buttonBuyNow();
		delay(2);
		home.firstName();
		delay(2);
		home.lastName();
		delay(2);
		home.inputEmail();
		delay(2);
		home.inputNoHP();
		delay(2);
		home.buttonReviewPay();
		delay(2);
		home.buttonMakeaPayment();
		delay(10);
		home.buttonClosePayment();
		delay(3);
		driver.close();
	    driver.switchTo().window(training5_3.get(0));
	    System.out.println(driver.getTitle());
	    delay(3);
	    extentTest.log(LogStatus.PASS, "Click enroll now fast track 5");
	}
	
	@And("Show achieve")
	public void show_achieve() {
		scroll(600);
		delay(3);
		home.Achieve();
		delay(3);
		scroll(400);
		extentTest.log(LogStatus.PASS, "Show achieve");
	}
	
	@And("Lates news")
	public void lates_news() {
		delay(3);
		home.News();
		delay(3);
		home.clickNextSlideNews();
		delay(3);
		home.clickPrevSlideNews();
		delay(3);
		home.chooseNews();
		scroll(200);
		home.clickHome();
		extentTest.log(LogStatus.PASS, "Lates news");
	}
	
	@And("Show Testimonial")
	public void show_testimonial() {
		delay(2);
		scroll(700);
		delay(3);
		home.clickNextSlideTestimonial();
		delay(3);
		home.clickPrevSlideTestimonial();
		delay(3);
		extentTest.log(LogStatus.PASS, "Show Testimonial");
	}
	
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
