package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getNotificationText() {
        return String.valueOf(js.executeScript("return arguments[0].textContent;",
                driver.findElement(By.xpath("//div[contains(text(), 'Success')]"))));
    }
}
