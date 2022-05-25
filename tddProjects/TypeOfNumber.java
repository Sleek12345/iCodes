package tddProjects;

import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args) {
        Scanner newNumber = new Scanner(System.in);
           System.out.print("Please enter any number: ");

                int userGuess = newNumber.nextInt();
                if (userGuess%2 == 1 ){
                    System.out.println("The number is an odd number");
                }
               if (userGuess%2 == 0 ) {
                   System.out.println("The number is an even number");

               }
        }






    }


