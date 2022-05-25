package tddProjects;

import java.util.Scanner;

public class ComparingIntegers {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer : ");
            int x = input.nextInt();

            int z = x * x;

            if (x < 100) {
                System.out.printf("%d < %d%n", x, 100);
            }

            if (z < 100) {
                System.out.printf("%d < %d%n", z, 100);
            }

            if (x == 100) {
                System.out.printf("%d == %d%n", x, 100);
            }

            if (z == 100) {
                System.out.printf("%d == %d%n", z, 100);
            }
            if (x != 100) {
                System.out.printf("%d != %d%n", x, 100);
            }

            if (z != 100) {
                System.out.printf("%d != %d%n", z, 100);
            }






        }





     }










