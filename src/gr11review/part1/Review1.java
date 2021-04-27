package gr11review.part1;

import java.io.*;

/**
 * Counts the number of days this years has had
 * Depending on the numbers inputed
 * Assumes that it is not a leap year
 * And that all months other than February are 31 days
 * @author: A. Wong
 */

public class Review1{
    public static void main(String[] args) throws IOException{

        int numMonth;
        int numDay;
        int numTotalDays;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));


        //Ask about the month and day, then records the answer
        System.out.println("Enter the month number:");
        numMonth = Integer.parseInt(key.readLine());

        System.out.println("Enter the day number:");
        numDay = Integer.parseInt(key.readLine());

        //Assuming what is mentioned above, calculates the amount of days in the year
        //The if system changes it's calculation based on whether it is January or February
        if (numMonth < 2){

            numTotalDays = numDay;

            System.out.println(numTotalDays);

        }
            else if (numMonth == 2){

                numTotalDays = (numMonth - 1) * 31 + numDay;

                System.out.println(numTotalDays);

        }
                 else{

                    numTotalDays = (numMonth - 2) * 31 + numDay + 28;

                    System.out.println(numTotalDays);
                 }

    }
}