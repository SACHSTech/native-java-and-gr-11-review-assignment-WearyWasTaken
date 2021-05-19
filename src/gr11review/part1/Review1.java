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
        System.out.print("Enter the month number: ");
        numMonth = Integer.parseInt(key.readLine());

        System.out.print("Enter the day number: ");
        numDay = Integer.parseInt(key.readLine());

        //Assuming what is mentioned above, calculates the amount of days in the year
        //The if system changes it's calculation based on whether how many 30 day months have passed
        if (numMonth < 2){

            numTotalDays = numDay;

            System.out.println(numTotalDays);

        }
            else if (numMonth == 2){

                numTotalDays = (numMonth - 1) * 31 + numDay;

                System.out.println(numTotalDays);

           }
                else if(2 < numMonth && numMonth < 5){

                    numTotalDays = (numMonth - 2) * 31 + numDay + 28;

                            System.out.println(numTotalDays);


                }
                    else if (4 < numMonth  && numMonth < 7){

                        numTotalDays = (numMonth - 2) * 31 + numDay + 28 - 1;

                        System.out.println(numTotalDays);
                    }
                        else if (6 < numMonth && numMonth < 10){

                            numTotalDays = (numMonth - 2) * 31 + numDay + 28 - 2;

                            System.out.println(numTotalDays);

                        }
                            else if (9 < numMonth && numMonth < 12){

                                numTotalDays = (numMonth - 2) * 31 + numDay + 28 - 3;

                                System.out.println(numTotalDays);

                            }
                                else{

                                    numTotalDays = (numMonth - 2) * 31 + numDay + 28 - 4;

                                    System.out.println(numTotalDays);

                                }

    }
}