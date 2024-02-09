import org.dc.java.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList to contain all of the currencies.
        List<Currency> currencies = new ArrayList<>();

        // Create the scanner.
        Scanner scan = new Scanner(System.in);

        /*
            Adding Currencies.
        */

        // Add the Canadian Dollar to the list.
        currencies.add(new CanadianDollar());

        // Add the United States Dollar to the list.
        currencies.add(new UnitedStatesDollar());

        // Add the Euro to the list.
        currencies.add(new Euro());

        // Add the Japanese Yen to the list.
        currencies.add(new JapaneseYen());

        // Add the Pound Sterling to the list.
        currencies.add(new PoundSterling());

        // Add the New Zealand Dollar to the list.
        currencies.add(new NewZealandDollar());

        // Add the Iranian Rial to the list.
        currencies.add(new IranianRial());

        /*
            Print all of the available currencies.
        */

        // Print the info for what the following output is for
        System.out.println("Available currencies:");

        // Iterate through each of the currencies.
        for (Currency currency : currencies) {
            // Print the currency's name and code.
            System.out.println("\t" + currency.getFullName() + " Available as \"" + currency.getCurrencyCode() + "\"");
        }

        /*
            User Input
        */

        // Get the currency the user wants to convert from.
        Currency convertFromCurrency = getDesiredCurrencyFromUser(currencies, "Input the currency code of the currency you'd like to convert from");

        // Get the currency the user wants to convert to.
        Currency convertToCurrency = getDesiredCurrencyFromUser(currencies, "Input the currency code of the currency you'd like to convert to");

        // Get the amount of currency in the currency to convert from to convert.
        double amount = getDoubleFromUser("Input the amount of currency you'd like to convert from " + convertFromCurrency.getCurrencyCode() + " to " + convertToCurrency.getCurrencyCode());

        double convertedCurrency = convertToCurrency.convertCurrency(convertFromCurrency, amount);

        System.out.println("\033[92m" + convertFromCurrency.getSymbol() + amount + " " + convertFromCurrency.getCurrencyCode() + " Is Worth " + convertToCurrency.getSymbol() + convertedCurrency + " " + convertToCurrency.getCurrencyCode() + "\033[0m");

        /*
            Have the program not instantly close, close once the user presses enter.
        */

        // Prompt to the user
        System.out.println("\n\033[93mPress enter to exit the program\033[0m");

        // Have it end when the user presses enter.
        scan.nextLine();
    }

    /*
        Gets the desired currency from the user's input, automatically re-prompts if the user inputs invalid input.

        currencies is the list of currencies to search from.
        message is the message to print to the user, ie: "Input the code of the currency you'd like to convert from".
    */
    static public Currency getDesiredCurrencyFromUser(List<Currency> currencies, String message){

        // Print the message.
        System.out.println(message);

        // Create the scanner.
        Scanner scan = new Scanner(System.in);

        // Get the user's input for the desired currency code.
        String desiredCurrencyCode = scan.nextLine();

        // Search for the currency in the list from the user's code.
        for (Currency currency : currencies) {
            // If the inputted currency code matches this one, return it.
            if(desiredCurrencyCode.equalsIgnoreCase(currency.getCurrencyCode())){
                // Print the user's selected currency.
                System.out.println("\033[94mSelected currency code: " + currency.getCurrencyCode() + "\033[0m");

                // Return this currency, as it's the one the user specified.
                return currency;
            }
        }

        // Tell the user that it's invalid.
        System.out.println("\033[91mInvalid currency code. Please input a valid currency code.\033[0m");

        // Otherwise, the inputted currency code does not match any ones we offer, so re-prompt the user.
        return getDesiredCurrencyFromUser(currencies, message);
    }

    static double getDoubleFromUser(String message){

        // Create the scanner
        Scanner scan = new Scanner(System.in);

        // Print the message to the user
        System.out.println(message);

        // Define the user input variable
        double user_input;

        // Open try statement, in order to validate that their input is a double and prevent an error.
        try {
            // Get the double from the user.
            user_input = scan.nextDouble();
        } catch (Exception e) {
            // Print the error to the user.
            System.out.println("\033[91mYour input must be a number!\033[0m");

            // Reprompt the user by calling this function again.
            return getDoubleFromUser(message);
        }

        // Return the user's input
        return user_input;
    }
}
