package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    WebDriver driver;
    String label;
    JavascriptExecutor js;

    public Checkbox(WebDriver driver, String label) {
        this.label = label;
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void clickJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void checkCheckbox() {
        clickJS(driver.findElement(By.xpath(String.
                format("//span[text()='%s']//ancestor::lightning-input//input", label))));
    }
}
