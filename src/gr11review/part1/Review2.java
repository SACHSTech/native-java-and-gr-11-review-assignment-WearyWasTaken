package gr11review.part1;

import java.io.*;

/**
 * Shows a list of jokes and takes an input
 * Then prints a joke about the inputed option
 * If the number is not valid, it will respond with "Invalid menu option"
 * @author A. Wong
 */

 public class Review2{
    public static void main(String[] args) throws IOException{

        int numInput;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //List the options that the user can pick, then reads takes an input
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        numInput = Integer.parseInt(key.readLine());

        //Prints a joke based on the inputed number
        //If the number is not listed, it responds with "Invalid menu input"
        if (numInput == 0){

            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs.");

        }
        else if (numInput == 1){

                System.out.println("A giraffe can grow up to 18 feet");
                System.out.println("But they usually only have 4");


            }
            else if (numInput == 2){

                System.out.println("What is DNA's favourite pice of clothing?");
                System.out.println("Jeans");

            }
                else if (numInput == 3){

                    System.out.println("Why did the teacher go to the beach?");
                    System.out.println("To test the water");

                }
                else{

                    System.out.println("Invalid menu option");

                }



    }

 }