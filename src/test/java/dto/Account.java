package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Account {

    @Builder.Default
    String name = "Test";
    @Builder.Default
    String phone = null;
    @Builder.Default
    String rating = "Warm";
    @Builder.Default
    String fax = null;
    @Builder.Default
    String accountNumber = null;
    @Builder.Default
    String website = null;
    @Builder.Default
    String accountSite = null;
    @Builder.Default
    String tickerSymbol = null;
    @Builder.Default
    String type = "Customer - Direct";
    @Builder.Default
    String ownership = "Subsidiary";
    @Builder.Default
    String industry = "Media";
    @Builder.Default
    String employees = null;
    @Builder.Default
    String annualRevenue = null;
    @Builder.Default
    String sicCode = null;
    @Builder.Default
    String billingStreet = null;
    @Builder.Default
    String shippingStreet = null;

}
