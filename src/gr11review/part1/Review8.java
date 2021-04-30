package gr11review.part1;

import java.io.*;

/**
 * Simulates 1000 pulls of a slot machine
 * Prints the results and how many times a triple was achieved
 * @author A. Wong
 */

public class Review8{
    public static void main(String[] args) throws IOException{

        int slot1;
        int slot2;
        int slot3;
        int numTriple = 0;

        //Sets the range for the Math.random function
        int randMax = 8;
        int randMin = 1;
        int randRange = randMax - randMin + 1;
        
        for (int num1 = 0; num1 < 1000; num1++){

            //Generates a random number between 1 and 8
            slot1 = (int)(Math.random() * randRange) + randMin;
            slot2 = (int)(Math.random() * randRange) + randMin;
            slot3 = (int)(Math.random() * randRange) + randMin;

            //Prints the results
            System.out.print(slot1 + " ");
            System.out.print(slot2 + " ");
            System.out.println(slot3);

            //Checks if there was a triple
            if (slot1 == slot2 && slot1 == slot3 && slot2 == slot3){

                numTriple++;

            }

        }

        //Prints the number of triples
        System.out.println(numTriple);

    }

}