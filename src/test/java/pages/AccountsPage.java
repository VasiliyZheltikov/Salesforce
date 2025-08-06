package pages;

import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    private final String ACCOUNTS_PAGE_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list";

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage open() {
        driver.get(ACCOUNTS_PAGE_URL);
        return this;
    }
}
