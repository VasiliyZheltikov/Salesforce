package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount(){
        String accountName = "Burt Shelby";
        loginPage.open()
                .login("tborodich@tms.sandbox", "Password003!")
                .open();
        newAccountModal.open()
                .createAccount(accountName,
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
                        "P.O. Box 637, 7094 Ante Avenue")
                .saveAccount();
        Assert.assertTrue(
                accountPage.getNotificationText().contains(String.format("Account %s was created.", accountName)),
                "Ошибка при создании аккаунта");
    }
}