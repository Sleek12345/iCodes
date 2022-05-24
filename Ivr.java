package ChapterFive;

import com.sun.source.tree.AssignmentTree;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        menuPage();
    }








    private static void menuPage() {
        Scanner input = new Scanner(System.in);

        String prompt = """
                 ------------------
                 |1 -> for English|
                 |2 -> for Igbo   |
                 |3 -> for French |
                 |4 -> for Yoruba |
                 ------------------
                """;
        System.out.println(prompt);

        System.out.print("Enter a number between 1 and 4 to display the options under each number: ");
        int counter = input.nextInt();
        System.out.println();

        if (counter == 1) englishMenu(input);
        if (counter == 2) igboMenu(input);
        if (counter == 3) frenchMenu(input);
        if (counter == 4) yorubaMenu(input);

    }












    private static void yorubaMenu(Scanner input) {
        String prompt;
        prompt = """
                Yoruba
               1 -> To display Ewa
               2 -> To display Agoyin
               0 -> To menu
               """;
        System.out.println(prompt);
        int number4 = input.nextInt();
        System.out.println();
        switch (number4) {
            case 1 -> {
                System.out.println("EWA");
                System.out.println("Enter 0 to go back");
                number4 = input.nextInt();
                if (number4 == 0) yorubaMenu(input);
            }
            case 2 -> {
                System.out.println("AGOYIN");
                System.out.println("Enter 0 to go back");
                number4 = input.nextInt();
                if (number4 == 0) yorubaMenu(input);
            }
            case 0 -> menuPage();
        }
    }

    private static void frenchMenu(Scanner input) {
        String prompt;
        prompt = """
                 French
                1 -> To display Egg
                2 -> To display Champagne
                0 -> To menu
                """;
        System.out.println(prompt);
        int number3 = input.nextInt();
        System.out.println();
        switch (number3) {
            case 1 -> {
                System.out.println("EGG");
                System.out.println("Enter 0 to go back");
                number3 = input.nextInt();
                if (number3 == 0) frenchMenu(input);
            }
            case 2 -> {System.out.println("CHAMPAGNE");
                System.out.println("Enter 0 to go back");
                number3 = input.nextInt();
                if (number3 == 0) frenchMenu(input);
            }
            case 0 -> menuPage();

        }
    }

    private static void igboMenu(Scanner input) {
        String prompt;
        prompt = """
                 Igbo
                1 -> To display Sharing
                2 -> To display Caring
                0 -> To menu
                """;
        System.out.println(prompt);
        int number2 = input.nextInt();
        System.out.println();
        switch (number2) {
            case 1 ->{
            System.out.println("SHARING");
                System.out.println("Enter 0 to go back");
                number2 = input.nextInt();
                if (number2 == 0) igboMenu(input);
            }
            case 2 -> {
                System.out.println("CARING");
                System.out.println("Enter 0 to go back");
                number2 = input.nextInt();
                if (number2 == 0) igboMenu(input);
            }
            case 0 -> menuPage();
        }
    }


    private static void englishMenu(Scanner input) {
        String prompt;
        prompt = """
                  English
                1 -> To display Data
                2 -> To display Transfer
                0 -> To menu
                """;
        System.out.println(prompt);

        int number1 = input.nextInt();
        System.out.println();
        switch (number1) {

            case 1 -> {
                System.out.println("DATA");
            System.out.println("Enter 0 to go back");
            number1 = input.nextInt();
            if (number1 == 0) englishMenu(input);
            }
            case 2 -> {
                System.out.println("TRANSFER");
                System.out.println("Enter 0 to go back");
                number1 = input.nextInt();
                if (number1 == 0) englishMenu(input);
            }
            case 0 -> menuPage();
        }
    }
}




