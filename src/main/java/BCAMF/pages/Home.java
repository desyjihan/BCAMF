package BCAMF.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BCAMF.drivers.DriverSingleton;



public class Home {

	private WebDriver driver;
	
	public Home() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu-item-1513\"]/a")
	private WebElement Home;
	
	@FindBy(xpath = "//*[@id=\"Tools\"]")
	private WebElement Expertise_Tools;
	
	@FindBy(xpath = "//*[@id=\"Trainings\"]")
	private WebElement Expertise_Trainings;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[1]/a/img")
	private WebElement Company1;
	
	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[2]/a/img")
	private WebElement Company2;
	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[3]/a/img")
//	private WebElement Company3;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[4]/a/img")
//	private WebElement Company4;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[5]/a/img")
//	private WebElement Company5;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[6]/a/img")
//	private WebElement Company6;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[7]/a/img")
//	private WebElement Company7;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[8]/a/img")
//	private WebElement Company8;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[3]/div/div/div/div[2]/div[2]/div[9]/a/img")
//	private WebElement Company9;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[1]/a/div/div[1]/div[3]")
//	private WebElement Training1;
//	
//	@FindBy(xpath = "//*[@id=\"wrapper\"]/div/div[5]/div/div/div/p[2]/a/img")
//	private WebElement Training1_LinkedIn;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[2]/a/div/div[1]/div[3]")
//	private WebElement Training2;
//	
//	@FindBy(xpath = "//*[@id=\"Course Content\"]")
//	private WebElement Training_Course_Content;
//	
//	@FindBy(xpath = "//*[@id=\"Joining Benefits\"]")
//	private WebElement Training_Joining_Benefits;
//	
//	@FindBy(xpath = "//*[@id=\"Batch Schedule\"]")
//	private WebElement Training_Batch_Schedule;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[3]/a/div/div[1]/div[3]")
//	private WebElement Training3;
//	
//	@FindBy(xpath = "//*[@id=\"previous-slide\"]/i")
//	private WebElement Slide_sebelum;
//	
//	@FindBy(xpath = "//*[@id=\"next-slide\"]/i")
//	private WebElement Slide_sesudah;
//	
//	@FindBy(xpath = "//*[@id=\"fullscreen\"]/i")
//	private WebElement Fullscreen;
//	
//	@FindBy(xpath = "//*[@id=\"player-toolbar-left-actions\"]/button/i")
//	private WebElement Share;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[4]/div/div/div/div[1]/div/div/div[3]")
//	private WebElement Training_next;
//	
//	@FindBy(xpath = "//*[@id=\"post-1397\"]/div[4]/div/div/div/div[1]/div/div/div[2]")
//	private WebElement Training_before;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[4]/a/div/div[1]/div[3]")
//	private WebElement Training4;
//	
//	@FindBy(xpath = "//*[@id=\"portfolio_carousel_aa82d93d0394e1dc6ca39bffcf44f5ad\"]/li[5]/a/div/div[1]/div[3]")
//	private WebElement Training5;
//	
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
	
	public void clickHome() {
		Home.click();
	}
	
	public void clickExpertiseTools() {
		Expertise_Tools.click();
	}
	
	public void clickExpertiseTrainings() {
		Expertise_Trainings.click();
	}
	
	public void clickCompany1() {
		Company1.click();
	}
	
	public void clickCompany2() {
		Company2.click();
	}
	
//	public void clickCompany3() {
//		Company3.click();
//	}
//	
//	public void clickCompany4() {
//		Company4.click();
//	}
//	
//	public void clickCompany5() {
//		Company5.click();
//	}
//	
//	public void clickCompany6() {
//		Company6.click();
//	}
//	
//	public void clickCompany7() {
//		Company7.click();
//	}
//	
//	public void clickCompany8() {
//		Company8.click();
//	}
//	
//	public void clickCompany9() {
//		Company9.click();
//	}
//	
//	public void clickTraining1() {
//		Training1.click();
//	}
//	
//	public void clickSlideSebelum() {
//		Slide_sebelum.click();
//	}
//	
//	public void clickSlideSesudah() {
//		Slide_sesudah.click();
//	}
//	
//	public void clickFullscreen() {
//		Fullscreen.click();
//	}
//	
//	public void clickShare() {
//		Share.click();
//	}
//	
//	public void clickTraining_next() {
//		Training_next.click();
//	}
//	
//	public void clickTrainingBefore() {
//		Training_before.click();
//	}
//	
//	public void clickTraining4() {
//		Training4.click();
//	}
//	
//	public void clickTraining5() {
//		Training5.click();
//	}
//	
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
	
	
	
	
}
