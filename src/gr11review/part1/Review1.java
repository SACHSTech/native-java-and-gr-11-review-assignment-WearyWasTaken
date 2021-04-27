package gr11review.part1;

import java.io.*;

/**
 * Counts the number of days this years has had
 * Depending on the numbers inputed
 * Assumes that it is not a leap year
 * And that all months other than February are 31 days
 */

public class Review1{
    public static void main(String[] args) throws IOException{

        int numMonth;
        int numDay;
        int numTotalDays;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the month number:");
        numMonth = Integer.parseInt(key.readLine());

        System.out.println("Enter the day number:");
        numDay = Integer.parseInt(key.readLine());

        numTotalDays = (numMonth - 2) * 31 + numDay + 28;

        System.out.println(numTotalDays);


    }
}