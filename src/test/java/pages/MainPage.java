package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home");
    }
}
