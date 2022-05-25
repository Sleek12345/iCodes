//package FirstCodes;

import java.util.Scanner;

public class Interest {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the balance : ");
            int  balance = input.nextInt();

            System.out.print("Enter the annual interest rate in percentage: ");
            int annualInterestRate = input.nextInt();


            int Interest = balance * (1 + annualInterestRate/1200);


            System.out.printf("Interest is %d%n", Interest);

        }

    }












