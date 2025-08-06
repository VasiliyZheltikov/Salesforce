package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final String MAIN_PAGE_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home";

    public MainPage open() {
        driver.get(MAIN_PAGE_URL);
        return this;
    }
}
