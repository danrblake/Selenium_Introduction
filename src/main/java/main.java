import BbcSite.BbcPages.BbcLogInPage;
import BbcSite.BbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\TECH-W84.LAPTOP-FCCNLJDE\\Documents\\Engineering18\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         BbcSite bbcSite = new BbcSite(driver);
         bbcSite.logInPage.goToSignInPage();
         bbcSite.logInPage.enterUsername("hello123@gmail.com");
        bbcSite.logInPage.enterPassword("password");
        bbcSite.logInPage.pressSubmit();
        System.out.println(bbcSite.logInPage.getPasswordErrorText());
        bbcSite.logInPage.assertCurrentURLIsSignInPage();

    }
}
