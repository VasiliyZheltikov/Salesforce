package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() throws InterruptedException {
        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        newAccountModal.open();
        newAccountModal.createAccount(
                "Burt Shelby",
                "+1-737-522-9437",
                "Warm",
                "+1-215-411-8133",
                "12345",
                "ornaretesting.org",
                "nec.luctus.net",
                "BSL",
                "Customer - Direct",
                "Subsidiary",
                "Media",
                "20",
                "$1000000",
                "38057516",
                "Ap #775-8758 Quisque Road",
                "P.O. Box 637, 7094 Ante Avenue"
        );
        newAccountModal.saveAccount();
        Assert.assertTrue(
                accountPage.getNotificationText().contains("Account \"Burt Shelby\" was created."),
                "Ошибка при создании аккаунта");
    }
}