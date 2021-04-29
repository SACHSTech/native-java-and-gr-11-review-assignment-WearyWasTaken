package gr11review.part1;

import java.io.*;

/**
 * Calculates compound interest
 * 
 * @author A. Wong
 */

 public class Review5{
    public static void main(String[] args) throws IOException{

        double numInvest;
        double numRate;
        double numTarget;
        int numYears = 0;
        double numAmount = 0;
        
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the yearly invested amount: ");
        numInvest = Double.parseDouble(key.readLine());

        System.out.println("Enter the compound interest rate: ");
        numRate = Double.parseDouble(key.readLine());

        System.out.println("Enter the target amount: ");
        numTarget = Double.parseDouble(key.readLine());

        while (numAmount < numTarget){

            numAmount = (numAmount + numInvest);
            numAmount += (numAmount * (numRate / 100));

            numYears++;

        }

        System.out.println("The target amount will be earned in " + numYears + " years.");


    }

 }