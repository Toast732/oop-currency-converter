package org.dc.java;

public class UnitedStatesDollar implements Currency {

    // Implement the method for getting the exchange rate, $1.3488 USD is $1 CAD, so return 1.3488.
    @Override
    public double getExchangeRate(){
        return 1.3488;
    }

    // Returns the currency code as "USD".
    @Override
    public String getCurrencyCode(){
        return "USD";
    }

    // Returns the full name as "United States Dollar".
    @Override
    public String getFullName(){
        return "United States Dollar";
    }
}
