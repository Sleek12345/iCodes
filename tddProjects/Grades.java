import java.util.Scanner;

public class Grades {
    //Pseudocode

    //Prompt the user to enter a score
    //The user enters a score
    //If the score  is greater than or equal to 90 or equal to 100
    //Print  Grade A
    //If the score  is greater than or  equal to 80 or is less than 90
    //Print  Grade B
    //If the score  is greater than or equal to 70 or is less than 80
    //Print  Grade C
    //If the score  is greater than or equal to  60 or is  less than 70
    //Print  Grade D
    //If the score is less than 60
    //Print  Grade F



    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter number: ");
        int score = grade.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        }

        if (score >= 80 && score < 90) {
            System.out.println("Grade B");
        }

        if (score >= 70 && score < 80) {
            System.out.println("Grade C");
        }

        if (score >= 60 && score < 70) {
            System.out.println("Grade D");
        }

        if (score < 60  ) {
            System.out.println("Grade F");
        }
    }






}
