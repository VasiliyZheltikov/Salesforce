package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private final String LOGIN_PAGE_URL = "https://tms9-dev-ed.develop.my.salesforce.com/";
    private WebElement header = driver.findElement(By.cssSelector(".slds-global-header__item.slds-global-header__item_search"));

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(LOGIN_PAGE_URL);
        return this;
    }

    public MainPage login(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(header));
        return new MainPage(driver);
    }
}
