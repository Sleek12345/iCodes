package tddProjects;

import java.util.Scanner;
    public class Numbers {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer x : ");
            int x = input.nextInt();

            System.out.print("Enter second integer y : ");
            int y = input.nextInt();

            System.out.print("Enter third integer z : ");
            int z = input.nextInt();

            System.out.print("Enter fourth integer a : ");
            int a = input.nextInt();

            System.out.println("Enter the fifth integer b : ");
            int b = input.nextInt();

            if (x > y && x > z && x >a && x >b ) {
                System.out.println("The largest number is x");
            }
            if (y > x && y > z && y >a && y >b) {
                System.out.println("The largest number is y");
            }
            if (z > x && z > y && z >a && z >b) {
                System.out.println("The largest number is z");
            }
            if (a > x && a > y && a >z && a >b) {
                System.out.println("The largest number is a");
            }
            if (b > x && b > y && b > z && b > a) {
                System.out.println("The largest number is b");
            }
        }




    }



