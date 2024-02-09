package org.dc.java;

public class IranianRial implements Currency {

    // Implement the method for getting the exchange rate, 0.00003201976 CAD is 1 IRR, so return 0.00003201976.
    @Override
    public double getExchangeRate(){
        return 0.00003201976;
    }

    // Returns the currency code as "IRR".
    @Override
    public String getCurrencyCode(){
        return "IRR";
    }

    // Returns the full name as "Iranian Rial".
    @Override
    public String getFullName(){
        return "Iranian Rial";
    }

    // Set it to return the symbol as "", as the actual symbol breaks the text due to it flipping the writing direction.
    @Override
    public String getSymbol(){
        return "";
    }
}
