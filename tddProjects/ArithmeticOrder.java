//package AssignmentsChapter2;

import java.util.Scanner;

public class ArithmeticOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the Third Number: ");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = firstNumber + secondNumber + thirdNumber / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.printf("The Sum is %d%nThe Average is %d%nThe Product is %d%n", sum, average, product);

        if (firstNumber >= secondNumber) {
            System.out.printf("The Largest number between the first number and the second number is %d%nThe Smallest number between the first number and the second number is %d%n", firstNumber, secondNumber);
        }
        if (firstNumber <= thirdNumber) {
            System.out.println("The Largest number between the first number and the third number is " + thirdNumber );
        }





    }
}
