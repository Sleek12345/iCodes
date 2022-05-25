package tddProjects;//package ClassWorks;
//initialize a mystery number
  //      ask the user to guess the number
    //    too low, tell him/her too low
      //  higher, tell him/her too high
        //correct,tell him/her correct
import java.util.Scanner;

public class Mystery {
    public static void main(String[] args) {

        Scanner mysteryNumber = new Scanner(System.in);

//        System.out.print("Please Enter a number: ");
//            int UserGuess = mysteryNumber.nextInt();
//
//            int number = 15;
//
//        if ( UserGuess > number ) {
//            System.out.println("The answer is too high");
//        }
//        if (UserGuess < number) {
//            System.out.println("The answer is too low");
//        }
//        if (UserGuess == number) {
//            System.out.println("The answer is correct");
//        }
        int x = -2;
        int total = 0;

        while (x <= 10) {
            int y = x + 2;
            x++;
            total += y;
            System.out.printf("Y is %d%n and the new total is %d%n ",y,total);
        }



    }


}
