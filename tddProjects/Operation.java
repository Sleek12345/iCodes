package tddProjects;//package FirstCodes;

public class Operation {
   public static void main(String[] args) {
//
//            //Creating a Scanner object
//                java.util.Scanner input = new java.util.Scanner(System.in);
//
//                System.out.print("Enter firstNumber: "); // Prompt user for the first input
//                int firstNumber = input.nextInt();
//
//                System.out.print("Enter secondNumber: "); // Prompt user for the second input
//                int secondNumber = input.nextInt();
//
//                int Sum = firstNumber + secondNumber;
//
//                int Product = firstNumber * secondNumber;
//
//                int Division = firstNumber / secondNumber;
//
//                int Difference = firstNumber - secondNumber;
//
//                System.out.printf("Sum is %d%nProduct is %d%nDivision is %d%nDifference is %d%n", Sum, Product, Division, Difference);
//


                int x = -2;
                int total = 0;

                while (x <= 10) {
                    int y = x + 2;
                    x++;
                    total += y;
                    System.out.printf("Y is: %d and total is %d\n", y, total);
                    }// end while


   }// end main
 }




