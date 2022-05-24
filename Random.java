package ChapterFive;

import java.util.Scanner;
import java.lang.Math;
public class Random {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userAnswer;
        int check;

        int random1 = (int)(Math.random() * 20 );
        int random2 = (int)(Math.random() * 20 );

        System.out.println("How many questions do you want?");
        userAnswer = input.nextInt();

           for (int i = 0;i < 5;i++) {
              for (int j = 1;j < 5;j++) {
                  if (userAnswer == j) {
                      System.out.printf(random1 +  "+"  + random2 +  "=");

                      int userAnswer2 = input.nextInt();
                      check = random1 + random2;

                      if (userAnswer2 == check) {
                          System.out.println("The answer is correct");
                      } else {
                          System.out.println("The answer is wrong");
                      }
                  }
              }
          }
        }
    }










