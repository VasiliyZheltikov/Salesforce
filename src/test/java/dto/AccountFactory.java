package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String rating, String type, String ownership, String industry) {
        Faker faker = new Faker();
        return new Account(
                faker.company().name(),
                faker.phoneNumber().phoneNumber(),
                rating,
                faker.phoneNumber().phoneNumber(),
                faker.number().digits(5),
                faker.internet().domainName(),
                faker.internet().domainName(),
                faker.stock().nsdqSymbol(),
                type,
                ownership,
                industry,
                faker.number().digits(2),
                faker.number().digits(7),
                faker.number().digits(5),
                faker.address().streetAddress(),
                faker.address().streetAddress()
                );
    }
}
