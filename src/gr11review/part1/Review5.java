package gr11review.part1;

import java.io.*;

/**
 * Calculates the amount of time for compound interest
 * to reach the target amount based on inputed information
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

        //Printes out the questions and takes inputs
        System.out.println("Enter the yearly invested amount: ");
        numInvest = Double.parseDouble(key.readLine());

        System.out.println("Enter the compound interest rate: ");
        numRate = Double.parseDouble(key.readLine());

        System.out.println("Enter the target amount: ");
        numTarget = Double.parseDouble(key.readLine());

        //Calculates the amount gained per year and how many years required
        while (numAmount < numTarget){

            numAmount = (numAmount + numInvest);
            numAmount += (numAmount * (numRate / 100));

            numYears++;

        }

        //Outputs the required amount of years
        System.out.println("The target amount will be earned in " + numYears + " years.");


    }

 }