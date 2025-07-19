package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {

    WebDriver driver;
    String buttonName;
    JavascriptExecutor js;

    public Button(WebDriver driver, String buttonName) {
        this.driver = driver;
        this.buttonName = buttonName;
        this.js = (JavascriptExecutor) driver;
    }

    public void clickJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void clickButton() {
        clickJS(driver.findElement(By.xpath(String.
                format("//button[text()='%s']", buttonName))));
    }
}
