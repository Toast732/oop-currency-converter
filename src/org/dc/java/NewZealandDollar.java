package org.dc.java;

public class NewZealandDollar implements Currency {

    // Implement the method for getting the exchange rate, 0.8231 NZD is 1 CAD, so return 0.8231.
    @Override
    public double getExchangeRate(){
        return 0.8231;
    }

    // Returns the currency code as "NZD".
    @Override
    public String getCurrencyCode(){
        return "NZD";
    }

    // Returns the full name as "New Zealand Dollar".
    @Override
    public String getFullName(){
        return "New Zealand Dollar";
    }
}
