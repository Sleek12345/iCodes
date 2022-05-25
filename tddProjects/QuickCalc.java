package tddProjects;

import java.util.Scanner;

public class QuickCalc {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int integer1 = input.nextInt();

        System.out.print("Enter integer 2: ");
        int integer2 = input.nextInt();

        int quotient = integer1     /   integer2;
        int remainder = integer1    %   integer2;
        System.out.printf("The quotient is %d%nAnd the remainder is %d%n", quotient, remainder);

    }
}
