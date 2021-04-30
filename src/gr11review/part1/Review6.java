package gr11review.part1;

import java.io.*;
import java.text.NumberFormat;
import java.text.*;

/**
 * Takes the price of inputed numbers and adds them together
 * to calculate tax and total
 * Ends when 0 is inputed
 * @author A. Wong
 */

public class Review6{
    public static void main(String[] args) throws IOException{

        double numPrice = 1;
        double numSubTotal = 0;
        double numTax;
        double numTotal;
        int numCounter = 1;

        NumberFormat numberFormat = new DecimalFormat("###,###0.00");

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Checks if inputed number is 0
        //If it isn't, it ask for more input
        //If it is, it finishes the calculations
        while (numPrice != 0){

                System.out.print("Enter the price for an item: ");
                numPrice = Double.parseDouble(key.readLine());

                numSubTotal += numPrice;
                numCounter++;

        }

        //Calculating for tax
        numTax = numSubTotal * 0.13;

        //Fixes taxes format
        String format = numberFormat.format(numTax);

        numTotal = numSubTotal + numTax;

        //Prints the result
        System.out.println("Subtotal: $" + numberFormat.format(numSubTotal));
        System.out.println("Tax: $" + numberFormat.format(numTax));
        System.out.println("Total: $" + numberFormat.format(numTotal));


    }

}