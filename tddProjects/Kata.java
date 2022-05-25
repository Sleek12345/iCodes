package tddProjects;

public class Kata {


    //get a number
    //count from 1 to x
    //if count mod x returns 0, increment factors
    //return factors
    public static int noOfFactorsOf(int number) {
        int factors = 0;
        for (int i = 1;i <= number;i++)
            if (number % i == 0) factors++;
        return  factors;

    }

    public static boolean isPrime(int number) {
        return noOfFactorsOf(number) == 2;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        if (secondNumber > firstNumber) difference = secondNumber - firstNumber;

        return difference;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }

    public String enterNumber(int score) {

        String grade = null;

        if (score >= 90 && score <= 100) grade = "Grade A";

        if (score >= 80 && score < 90) grade = "Grade B";

        if (score >= 70 && score < 80) grade = "Grade C";

        if (score >= 60 && score < 70) grade = "Grade D";

        if (score < 60) grade = "Grade F";

        return grade;

    }
    

    
}


