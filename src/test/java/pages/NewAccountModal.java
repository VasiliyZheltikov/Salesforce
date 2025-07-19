package pages;

import org.openqa.selenium.WebDriver;
import wrappers.*;

public class NewAccountModal extends BasePage {

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
    }

    public void createAccount(
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
    }

    public void saveAccount() {
        new Button(driver, "Save").clickButton();
    }

    public void saveAccountAndCreateNew() {
        new Button(driver, "Save & New").clickButton();
    }

    public void cancelCreatingAccount() {
        new Button(driver, "Cancel").clickButton();
    }
}
