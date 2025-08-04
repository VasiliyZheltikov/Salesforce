package dto;

public class Account {

    String name;
    String phone;
    String rating;
    String fax;
    String accountNumber;
    String website;
    String accountSite;
    String tickerSymbol;
    String type;
    String ownership;
    String industry;
    String employees;
    String annualRevenue;
    String sicCode;
    String billingStreet;
    String shippingStreet;

    public Account(String name, String phone, String rating, String fax, String accountNumber, String website,
                   String accountSite, String tickerSymbol, String type, String ownership, String industry,
                   String employees, String annualRevenue, String sicCode, String billingStreet, String shippingStreet) {
        this.name = name;
        this.phone = phone;
        this.rating = rating;
        this.fax = fax;
        this.accountNumber = accountNumber;
        this.website = website;
        this.accountSite = accountSite;
        this.tickerSymbol = tickerSymbol;
        this.type = type;
        this.ownership = ownership;
        this.industry = industry;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.sicCode = sicCode;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getRating() {
        return rating;
    }

    public String getFax() {
        return fax;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getType() {
        return type;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getIndustry() {
        return industry;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getSicCode() {
        return sicCode;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }
}
