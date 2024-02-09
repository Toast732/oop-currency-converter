package org.dc.java;

public class JapaneseYen implements Currency {

    // Implement the method for getting the exchange rate, 0.009 CAD is 1 JPY, so return 0.009.
    @Override
    public double getExchangeRate(){
        return 0.009;
    }

    // Returns the currency code as "JPY".
    @Override
    public String getCurrencyCode(){
        return "JPY";
    }

    // Returns the full name as "Japanese Yen".
    @Override
    public String getFullName(){
        return "Japanese Yen";
    }

    // Set it to return the symbol as "¥"
    @Override
    public String getSymbol(){
        return "¥";
    }
}
