package org.dc.java;

public class Euro implements Currency {

    // Implement the method for getting the exchange rate, 1.4507 CAD is 1 EUR, so return 1.4507.
    @Override
    public double getExchangeRate(){
        return 1.4507;
    }

    // Returns the currency code as "EUR".
    @Override
    public String getCurrencyCode(){
        return "EUR";
    }

    // Returns the full name as "Euro".
    @Override
    public String getFullName(){
        return "Euro";
    }

    // Set it to return the symbol as "€"
    @Override
    public String getSymbol(){
        return "€";
    }
}
