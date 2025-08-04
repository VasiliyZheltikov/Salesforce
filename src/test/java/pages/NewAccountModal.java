package pages;

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
            String name,
            String phone,
            String rating,
            String fax,
            String accountNumber,
            String website,
            String accountSite,
            String tickerSymbol,
            String type,
            String ownership,
            String industry,
            String employees,
            String annualRevenue,
            String sicCode,
            String billingStreet,
            String shippingStreet) {
        new Input(driver, "Account Name").write(name);
        new Input(driver, "Phone").write(phone);
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new Checkbox(driver, "VIP Client").checkCheckbox();
        new Checkbox(driver, "TeachMeSkills").checkCheckbox();
        new Textarea(driver, "Billing Street").write(billingStreet);
        new Textarea(driver, "Shipping Street").write(shippingStreet);
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
