package BCAMF.pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BCAMF.drivers.DriverSingleton;



public class Home {

	private static WebDriver driver;
	
	public Home() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu-item-1513\"]/a")
	private WebElement Home;
	
	@FindBy(xpath = "//*[@id=\"Tools\"]")
	private WebElement expertiseTools;
	
	@FindBy(xpath = "//*[@id=\"Trainings\"]")
	private WebElement expertiseTrainings;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[1]/a/img")
	private WebElement Company1;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[2]/a/img")
	private WebElement Company2;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[3]/a/img")
	private WebElement Company3;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[4]/a/img")
	private WebElement Company4;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[5]/a/img")
	private WebElement Company5;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[6]/a/img")
	private WebElement Company6;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[7]/a/img")
	private WebElement Company7;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[8]/a/img")
	private WebElement Company8;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[9]/a/img")
	private WebElement Company9;
	
	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[1]/a/div/div[1]/div[3]")
	private WebElement Training1;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[5]/div/div/div/p[2]/a/img")
	private WebElement Training1_LinkedIn;
	
	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[2]/a/div/div[1]/div[3]")
	private WebElement Training2;
	
	@FindBy(xpath = "//*[@id=\"Course Content\"]")
	private WebElement trainingCourseContent;
	
	@FindBy(xpath = "//*[@id=\"Joining Benefits\"]")
	private WebElement trainingJoiningBenefits;
	
	@FindBy(xpath = "//*[@id=\"Batch Schedule\"]")
	private WebElement trainingBatchSchedule;
	
	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[3]/a/div/div[1]/div[3]")
	private WebElement Training3;
//	
	@FindBy(xpath = "//*[@id=\"previous-slide\"]/i")
	private WebElement slideSebelum;
	
	@FindBy(xpath = "//*[@id=\"next-slide\"]/i")
	private WebElement slideSesudah;
	
	@FindBy(xpath = "//*[@id=\"fullscreen\"]/i")
	private WebElement Fullscreen;
	
	@FindBy(xpath = "//*[@id=\"player-toolbar-left-actions\"]/button/i")
	private WebElement Share;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[4]/div/div/div/div[1]/div/div/div[3]")
	private WebElement Training_next;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[4]/div/div/div/div[1]/div/div/div[2]")
	private WebElement Training_before;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[3]/div/div/div[1]/div/div/div[3]/div/div[1]/ul/li[5]/a")
	private WebElement enrollNowWeekendBatch;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[3]/div/div/div[1]/div/div/div[3]/div/div[2]/ul/li[5]/a")
	private WebElement enrollNowWeekdayBatch;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[3]/div/div/div[1]/div/div/div[3]/div/div[3]/ul/li[5]/a")
	private WebElement enrollNowFastTrack;
	
	@FindBy(xpath = "//*[@id=\"Request for Demo\"]")
	private WebElement trainingRequestForDemo;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/button/span")
	private WebElement buttonAddToCart;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[3]/button")
	private WebElement buttonBuyNow;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/form/div[1]/div[1]/div[1]")
	private WebElement btnFirstName;
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	private WebElement inputFirstName;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/form/div[1]/div[2]/div[1]")
	private WebElement btnLastName;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	private WebElement inputLastName;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/form/div[2]/div[1]")
	private WebElement btnEmail;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement inputEmail;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/form/div[3]/div[1]/input")
	private WebElement inputNoHP;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/form/div[3]/div[1]")
	private WebElement btnNoHP;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div/div/button[1]")
	private WebElement buttonReviewPay;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div[4]/div[1]/div[2]/button[1]")
	private WebElement buttonMakeaPayment;
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'m12.288 23')]")
	private WebElement buttonClosePayment;
	
	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[4]/a/div/div[1]/div[3]")
	private WebElement Training4;
	
	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[5]/a/div/div[1]/div[3]")
	private WebElement Training5;
	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[6]/a/div/div[1]/div[3]")
//	private WebElement Training6;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[7]/a/div/div[1]/div[3]")
//	private WebElement Training7;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[8]/a/div/div[1]/div[3]")
//	private WebElement Training8;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[9]/a/div/div[1]/div[3]")
//	private WebElement Training9;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[5]/div/div/div/h2/span")
	private WebElement Achieve;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[6]/div/div/h2/span")
	private WebElement News;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[6]/div/div/div[2]/div/div[3]")
	private WebElement nextSlideNews;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[6]/div/div/div[2]/div/div[2]")
	private WebElement prevSlideNews;
	
	@FindBy(xpath = "//*[@id=\"posts_carousel_2caf24b0fd3beec885a518a2505cca04\"]/li[3]/div[3]/h4/a")
	private WebElement chooseNews;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[7]/div/div/div[2]/div[2]/div/div[3]")
	private WebElement nextSlideTestimonial;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[7]/div/div/div[2]/div[2]/div/div[2]")
	private WebElement prevSlideTestimonial;
	
	@FindBy(xpath = "//*[@id=\"dismiss-button\"]/div/span")
	private WebElement closeAds;
	
	@FindBy(xpath = "//*[@id=\"dismiss-button\"]")
	private WebElement closeAds2;
	
	
	public void clickHome() {
		Home.click();
	}
	
	public void clickExpertiseTools() {
		expertiseTools.click();
	}
	
	public void clickExpertiseTrainings() {
		expertiseTrainings.click();
	}
	
	public void clickCompany1() {
		Company1.click();
	}
	
	public void clickCompany2() {
		Company2.click();
	}
	
	public void clickCompany3() {
		Company3.click();
	}
	
	public void clickCompany4() {
		Company4.click();
	}
	
	public void clickCompany5() {
		Company5.click();
	}
	
	public void clickCompany6() {
		Company6.click();
	}
	
	public void clickCompany7() {
		Company7.click();
	}
	
	public void clickCompany8() {
		Company8.click();
	}
	
	public void clickCompany9() {
		Company9.click();
	}
	
	public void clickTraining1() {
		Training1.click();
	}
	
	public void clickSlideSebelum() {
		slideSebelum.click();
	}
	
	public void clickSlideSesudah() {
		slideSesudah.click();
	}
	
	public void clickFullscreen() {
		Fullscreen.click();
	}
	
	public void clickShare() {
		Share.click();
	}
	
	public void clickTraining_next() {
		Training_next.click();
	}
	
	public void clickTrainingBefore() {
		Training_before.click();
	}
	
	public void clickCourseContent() {
		trainingCourseContent.click();
	}
	
	public void clickJoiningBenefits() {
		trainingJoiningBenefits.click();
	}
	
	public void clickBatchSchedule() {
		trainingBatchSchedule.click();
	}
	
	public void clickEnrollNowWeekendBatch() {
		enrollNowWeekendBatch.click();
	}
	
	public void clickEnrollNowWeekdayBatch() {
		enrollNowWeekdayBatch.click();
	}
	
	public void clickEnrollNowFastTrack() {
		enrollNowFastTrack.click();
	}
	
	public void buttonAddToCart() {
		buttonAddToCart.click();
	}
	
	public void buttonBuyNow() {
		buttonBuyNow.click();
	}
	
	public void firstName() {
		inputFirstName.sendKeys("Global");
	}
	
	public void lastName() {
		inputLastName.sendKeys("SQA");
	}
	
	public void inputEmail() {
		inputEmail.sendKeys("test@test.com");
	}
	
	public void inputNoHP() {
		inputNoHP.sendKeys("4321567887");
	}
	
	public void buttonReviewPay() {
		buttonReviewPay.click();
	}
	
	public void buttonMakeaPayment() {
		buttonMakeaPayment.click();
	}
	
	public void buttonClosePayment() {
		buttonClosePayment.click();
	}
	
	public void clickTraining2() {
		Training2.click();
	}
		
	public void clickTraining3() {
		Training3.click();
	}	
	
	public void clickTraining4() {
		Training4.click();
	}
	
	public void clickTraining5() {
		Training5.click();
	}
	
//	public void clickTraining6() {
//		Training6.click();
//	}
//	
//	public void clickTraining7() {
//		Training7.click();
//	}
//	
//	public void clickTraining8() {
//		Training8.click();
//	}
//	
//	public void clickTraining9() {
//		Training9.click();
//	}
	
	public void Achieve() {
		Achieve.isDisplayed();
	}
	
	public void News() {
		News.isDisplayed();
	}
	
	public void clickNextSlideNews() {
		nextSlideNews.click();
	}
	
	public void clickPrevSlideNews() {
		prevSlideNews.click();
	}
	
	public void chooseNews() {
		chooseNews.click();
	}
	
	public void clickNextSlideTestimonial() {
		nextSlideTestimonial.click();
	}
	
	public void clickPrevSlideTestimonial() {
		prevSlideTestimonial.click();
	}
	
	public void closeAds() {
//		closeAds.click();
		WebElement ads = closeAds;;
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", ads);
	}
	
	public void closeAds2() {
//		closeAds2.click();
		WebElement locatornyaAds = closeAds;
		WebElement ads = locatornyaAds;
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", ads);
	}
	
}
