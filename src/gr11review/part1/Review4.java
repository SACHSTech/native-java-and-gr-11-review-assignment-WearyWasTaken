package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat.*;

public class Review4{
    public static void main(String[] args) throws IOException{

        int numInput;
        double numSubTotal = 0;
        double numTax;
        double numTotal;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");


        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));


        
        
        System.out.println("How many items do you want to buy? ");
        numInput = Integer.parseInt(key.readLine());

        for (int num1 = 1; num1 <= numInput; num1++){

            double numPrice;

            System.out.println("Enter the price for item " + num1);
            numPrice = Double.parseDouble(key.readLine());

            numSubTotal += numPrice;

        }

        numTax = numSubTotal * 0.13 * 100;
      
        String format = decimalFormat.format(numTax);
      
        numTotal = numSubTotal + numTax;


        System.out.println("Subtotal: $" + numSubTotal);
        System.out.println("Tax: $" + numTax);
        System.out.println("Total: $" + numTotal);


    }

}