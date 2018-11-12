package BbcSite;
import BbcSite.BbcPages.BbcHomePage;
import BbcSite.BbcPages.BbcLogInPage;
import org.openqa.selenium.WebDriver;
public class BbcSite {

    private WebDriver driver;
    public BbcLogInPage logInPage;
    public BbcHomePage homePage;

    public BbcHomePage homePage(){
        return new BbcHomePage(driver);
    }
    public BbcSite(WebDriver driver){
        this.driver = driver;
        this.logInPage = new BbcLogInPage(driver);
        this.homePage = new BbcHomePage(driver);
    }
    public void getURL(){
        driver.getCurrentUrl();
    }
    public void close(){
        driver.close();
    }
}
