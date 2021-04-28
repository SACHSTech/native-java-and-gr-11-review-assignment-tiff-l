package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that prompts for a yearly_amount, annual compound_interest_rate, and outputs the number of years . For compound interest, the interest rate is applied to the existing amount after each year.
*
*/ 

/* Compile commands
javac -d bin src/gr11review/part1/Review5.java
java -classpath bin gr11review.part1.Review5
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review5Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review5Test
*/


public class Review5{

  public static void main(String[] args) throws IOException{

    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Define + initalize variables 
    double yearly_amount; 
    double compound_interest_rate; 
    double target; 
    int years =0;
    double total =0; 

    //Record invested amount value as a double
    System.out.print("Enter the yearly invested amount: ");
    yearly_amount = Double.parseDouble(key.readLine());
    
    //Record compound interest rate as a double
    System.out.print("Enter the compound interest rate: ");
    compound_interest_rate = Double.parseDouble(key.readLine());

    //Record  target value as a double
    System.out.print("Enter the target amount: ");
    target = Double.parseDouble(key.readLine());   

    // While loop to count the number of years. (Note: only runs if the tatotal is less than the targer. )
    while (total < target){
      total = (total+yearly_amount)*(1+compound_interest_rate/100);
      years++; 
    }

    //Print the target years to the system.
    System.out.print("The target amount will be earned in " + years + " years.");

  }
}
