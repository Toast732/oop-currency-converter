package org.dc.java;

public class CanadianDollar implements Currency {

    // Implement the method for getting the exchange rate, $1 CAD is $1 CAD, so return 1.
    @Override
    public double getExchangeRate(){
        return 1;
    }

    // Returns the currency code as "CAD".
    @Override
    public String getCurrencyCode(){
        return "CAD";
    }

    // Returns the full name as "Canadian Dollar".
    @Override
    public String getFullName(){
        return "Canadian Dollar";
    }
}
