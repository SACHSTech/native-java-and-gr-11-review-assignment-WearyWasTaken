package gr11review.part1;

import java.io.*;

/**
 * Takes an input for a sentence
 * Counts the number of characters, spaces and "a"s in the sentence
 * Prints a dash for every odd letter in the sentence starting from 1
 * @author A. Wong
 */

public class Review7{
    public static void main(String[] args) throws IOException{

        String theSentence;
        int numCharacter = 0;
        int numSpaces = 0;
        int numA = 0;
        String oddCharacters = "";


        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Takes input for the sentence
        theSentence = key.readLine();

        char[] arrSentence = theSentence.toCharArray();

        for (int num1 = 0; num1 < arrSentence.length; num1++){
            //Checks if there is a space or an a and adds to the value counter accordingly
            switch(arrSentence[num1]){
                case ' ': 
                    numSpaces++;
                    break;

                case 'a': 
                    numA++;
                    break;

            }

            //Checks if there is an odd letter and adds a dash to the oddCharacters string
            if ((num1 + 1) % 2 != 0){

                oddCharacters += "-";

            }  
            
        }

        //Counts the number of characters in the string
        numCharacter = arrSentence.length;

        //Prints the results
        System.out.println("There are " + numCharacter + " characters in the sentence.");
        System.out.println("There are " + numSpaces + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        System.out.println(oddCharacters);

    }

}