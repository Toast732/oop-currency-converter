package org.dc.java;

public class PoundSterling implements Currency {

    // Implement the method for getting the exchange rate, 1.6983 CAD is 1 GBP, so return 1.6983.
    @Override
    public double getExchangeRate(){
        return 1.6983;
    }

    // Returns the currency code as "GBP".
    @Override
    public String getCurrencyCode(){
        return "GBP";
    }

    // Returns the full name as "Pound Sterling".
    @Override
    public String getFullName(){
        return "Pound Sterling";
    }

    // Set it to return the symbol as "£"
    @Override
    public String getSymbol(){
        return "£";
    }
}
