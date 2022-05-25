//package FirstCodes;

import java.util.Scanner;


public class FutureInvestmentValue{

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the investment amount : ");
            int investmentAmount = input.nextInt();

            System.out.print("Enter the annual interest rate in percentage: ");
            int annualInterestRate = input.nextInt();

            System.out.print("Enter the number of years : ");
            int numberOfYears = input.nextInt();

            int FutureInvestmentValue = investmentAmount * (1 + annualInterestRate)^  numberOfYears *  12;


            System.out.printf("FutureInvestmentPlan is %d%n", FutureInvestmentValue);

        }

    }


