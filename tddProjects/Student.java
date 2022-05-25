package tddProjects;

public class Student {
    private  double score;
    private String name;

    //constructor initializes instance variables
    public Student(String name, double score) {
        this.name = name;

        if (score > 0.0 && score <= 100.0) {
         this.score = score;
      }
    }


    public String getLetterGrade() {
        //initialized to empty string
          String grade = null;
        if (score >= 90.0 && score <= 100) grade = "Grade A";
        else if (score >= 80.0) grade = "Grade B";
        else if (score >= 70.0) grade = "Grade C";
        else if (score >= 60.0) grade = "Grade D";
        else
             grade = "Grade F";
        return grade;
    }

    public String getName(){
        return name;
    }

    public double getScore() {
        return score;
    }
}
   // The class contains an instance variable name of type String to store a student's name
//instance variable of type double to store  a student's average in a course
//A constructor that initializes the instance variables
//Methods set and getName to set and  get the student's name
//Methods setAverage and getAverage to set and get the student's average
//Method getLetterGrade which uses nested if...else statements to determine the Student's letter grade based on
// the Student's average