package gr11review.part1;

import java.io.*;
import java.text.NumberFormat;
import java.text.*;

/**
 * Asks for an input to know how many inputs to count
 * Takes inputed prices to calculate tax and total
 * @author A. Wong
 */

public class Review4{
    public static void main(String[] args) throws IOException{

        int numInput;
        double numSubTotal = 0;
        double numTax;
        double numTotal;
        NumberFormat numberFormat = new DecimalFormat("##.##");


        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));


        
        //Ask for the first input
        System.out.println("How many items do you want to buy? ");
        numInput = Integer.parseInt(key.readLine());

        //Keeps asking for input based on the inputed number earlier
        for (int num1 = 1; num1 <= numInput; num1++){

            double numPrice;

            System.out.println("Enter the price for item " + num1);
            numPrice = Double.parseDouble(key.readLine());

            numSubTotal += numPrice;

        }

        //Calculating for tax
        numTax = numSubTotal * 0.13;
      
        //Fixes taxes format
        String format = numberFormat.format(numTax);
      
        numTotal = numSubTotal + numTax;

        //Prints the result
        System.out.println("Subtotal: $" + numSubTotal);
        System.out.println("Tax: $" + numTax);
        System.out.println("Total: $" + numTotal);


    }

}