package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappers.*;

import java.time.Duration;

public class NewAccountModal extends BasePage {

    private final String NEW_ACCOUNT_MODAL_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new";
    private WebElement saveButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public NewAccountModal open() {
        driver.get(NEW_ACCOUNT_MODAL_URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        return this;
    }

    public NewAccountModal createAccount(
            Account account) {
        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Phone").write(account.getPhone());
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new Checkbox(driver, "VIP Client").checkCheckbox();
        new Checkbox(driver, "TeachMeSkills").checkCheckbox();
        new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        return this;
    }

    public AccountsPage saveAccount() {
        new Button(driver, "Save").clickButton();
        return new AccountsPage(driver);
    }

    public AccountPage saveAccountAndCreateNew() {
        new Button(driver, "Save & New").clickButton();
        return new AccountPage(driver);
    }

    public AccountsPage cancelCreatingAccount() {
        new Button(driver, "Cancel").clickButton();
        return new AccountsPage(driver);
    }
}
