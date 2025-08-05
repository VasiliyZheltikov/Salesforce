package tests;

import com.github.javafaker.Faker;
import dto.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount(){
        Faker faker = new Faker();
        Account account = Account.builder()
                .name(faker.company().name())
                .phone(faker.phoneNumber().phoneNumber())
                .rating("Hot")
                .fax(faker.phoneNumber().phoneNumber())
                .accountNumber(faker.number().digits(5))
                .website(faker.internet().domainName())
                .accountSite(faker.internet().domainName())
                .tickerSymbol(faker.stock().nsdqSymbol())
                .type("Customer - Direct")
                .ownership("Subsidiary")
                .industry("Media")
                .employees(faker.number().digits(2))
                .annualRevenue(faker.number().digits(7))
                .sicCode(faker.number().digits(5))
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .build();
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