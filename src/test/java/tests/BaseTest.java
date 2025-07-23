package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;
import java.util.HashMap;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    AccountsPage accountsPage;
    LoginPage loginPage;
    MainPage mainPage;
    NewAccountModal newAccountModal;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        ChromeOptions options = getOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        accountsPage = new AccountsPage(driver);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        newAccountModal = new NewAccountModal(driver);
        accountPage = new AccountPage(driver);
    }

    private static ChromeOptions getOptions() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-infobars");
        return options;
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}
