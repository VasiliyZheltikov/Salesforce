package tests;

import dto.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

import static dto.AccountFactory.getAccount;


public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount(){
        Account account = getAccount(
                "Warm",
                "Customer - Direct",
                "Subsidiary",
                "Media");
        loginPage.open()
                .login("tborodich@tms.sandbox", "Password003!")
                .open();
        newAccountModal.open()
                .createAccount(account)
                .saveAccount();
        Assert.assertTrue(
                accountPage.getNotificationText().contains(String.format("Account %s was created.", account.getName())),
                "Ошибка при создании аккаунта");
    }
}