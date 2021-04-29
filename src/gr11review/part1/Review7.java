package gr11review.part1;

import java.io.*;

public class Review7{
    public static void main(String[] args) throws IOException{

        String theSentence;
        int numCharacter = 0;
        int numSpaces = 0;
        int numA = 0;
        String oddCharacters = "";


        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a sentence: ");
        theSentence = key.readLine();

        char[] arrSentence = theSentence.toCharArray();

        for (int num1 = 0; num1 < arrSentence.length; num1++){
            switch(arrSentence[num1]){
                case ' ': 
                    numSpaces++;
                    break;

                case 'a': 
                    numA++;
                    break;

            }

            if ((num1 + 1) % 2 != 0){

                oddCharacters += "-";

            }  
            
        }

        numCharacter = arrSentence.length - numSpaces;

        System.out.println("There are " + numCharacter + " characters in the sentence.");
        System.out.println("There are " + numSpaces + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        System.out.println("Taking the odd numbered characters in the sentence produces the following string '" + oddCharacters + "'");

    }

}