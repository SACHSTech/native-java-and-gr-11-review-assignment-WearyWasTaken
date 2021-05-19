package gr11review.part1;

import java.io.*;

/**
 * Prints all the odd numbers between 20 and 100
 * Prints all the numbers counting down from 29 to 2
 * @author A. Wong
 */

 public class Review3{
    public static void main(String[] args) throws IOException{


        //Prints all the odd numbers between 20 and 100
        for (int num1 = 21; num1 <= 100; num1+=2){

            System.out.println(num1);

        }

        //Creates a line between the two number sequences
        System.out.println("");

        //Prints all the numbers counting down from 29 to 2
        for (int num2 = 29; num2 >= 2; num2--){

            System.out.println(num2);

        }

    }

 }