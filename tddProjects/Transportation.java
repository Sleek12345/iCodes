package tddProjects;

import java.util.Scanner;

public class Transportation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter input 0 or 1: ");
        int userInput = input.nextInt();

        if (userInput == 0) {
            System.out.println("1");
        }
        if (userInput == 1) {
            System.out.println("0");
        }
   }
}