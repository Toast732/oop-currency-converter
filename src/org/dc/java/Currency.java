package org.dc.java;

public interface Currency {

    // Gets the exchange rate compared to CAD. Defined as how much 1 of this currency is worth in CAD.
    double getExchangeRate();

    // Gets the currencies' short name (ie: CAD)
    String getCurrencyCode();

    // Gets the currencies' full name (ie: Canadian Dollar)
    String getFullName();

    // Gets the currencies' symbol (ie: $). Defaulted, as many currencies will use the same symbol.
    default String getSymbol(){
        return "$";
    };

    // Convert the specified currency to this currency.
    default double convertCurrency(Currency sourceCurrency, double sourceAmount){
        // Convert the inputted amount to CAD, via applying the source currencies' exchange rate.
        double amountCAD = sourceCurrency.getExchangeRate() * sourceAmount;

        // Convert to this currency
        double amountThis = amountCAD / this.getExchangeRate();

        // If the converted amount is less than 0.01 (absolute value), then just return it as is.
        if(Math.abs(amountThis) < 0.01){
            // Return as is.
            return amountThis;
        }

        // Otherwise, floor to two decimals and return, floor to 2 decimals to prevent inaccuracies in the math.
        return Math.floor(amountCAD / this.getExchangeRate() * 100)/100;
    }
}
