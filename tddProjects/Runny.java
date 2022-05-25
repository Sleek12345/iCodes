package tddProjects;

import java.util.Scanner;


public class Runny {
    // Pseudocode

    //User Inputs a score

    //If score >= 55
    // Output pass
    //If score <= 55
    // Output fail


    public static void main(String[]  args) {
        Scanner code = new Scanner(System.in);
        System.out.println("Enter score: ");

        int number1 = code.nextInt();
        if (number1 >= 55) {
            System.out.println("Pass");
        }

        if (number1 <= 54) {
            System.out.println("Fail");
        }
    }
}
