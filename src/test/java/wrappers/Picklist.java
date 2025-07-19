package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Picklist {

    WebDriver driver;
    String label;
    JavascriptExecutor js;

    public Picklist(WebDriver driver, String label) {
        this.label = label;
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void clickJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-picklist//" +
                "button", label))).click();
        clickJS(driver.findElement(By.xpath(String.format("//label[text()='%s']//ancestor::lightning-picklist//" +
                "lightning-base-combobox-item//span[text()='%s']", label, option))));
    }
}
