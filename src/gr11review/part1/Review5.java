package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that prompts for a yearly_amount, annual compound_interest_rate, and outputs the number of years . For compound interest, the interest rate is applied to the existing amount after each year.
*
*/ 

/*
javac -d bin src/gr11review/part1/Review5.java
java -classpath bin gr11review.part1.Review5
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review5Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review5Test
*/


public class Review5{

  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    double yearAmount; 
    double interest; 
    double target; 
    int years =0;
    double total =0; 

    System.out.print("Enter the yearly invested amount: ");
    yearAmount = Double.parseDouble(key.readLine());
    System.out.print("Enter the compound interest rate: ");
    interest = Double.parseDouble(key.readLine());
    System.out.print("Enter the target amount: ");
    target = Double.parseDouble(key.readLine());   

    while (total < target){
      total = (total+yearAmount)*(1+interest/100);
      years++; 
    }

    System.out.print("The target amount will be earned in " + years + " years.");

  }
}
