package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
*A cash register program similar to the one above, except instead of prompting for the number items, the user is able to keep entering item prices until the enter 0. Import and use the java.text.DecimalFormat class to output the information in currency format (0.00)
* @author: T. Lee
*
*/ 

/* Compile commands
javac -d bin src/gr11review/part1/Review6.java
java -classpath bin gr11review.part1.Review6
javac -d bin src/gr11review/part1/Review6.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review6Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review6Test
*/

//Note - Test is wrong, question states "Enter the price for item #: " The test expects, output to be "Enter the price for an item: "

public class Review6{

  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Declare + initialize variables
    int numOfItems;
    double subtotal = 0; 
    double price = 1;
    double tax; 
    double total;
    
    //Runs until the price entered equals 0. 
    while (price != 0){
      System.out.print("Enter the price for an item: ");
      price= Double.parseDouble(key.readLine());
      subtotal = subtotal + price;
      
    }

    //Calculate tax (13%) + total
    tax = subtotal*.13;
    total = subtotal *1.13;

    System.out.println("Subtotal: $" + decimalFormat.format(subtotal));  
    System.out.println("Tax: $" + decimalFormat.format(tax));
    System.out.println("Total: $" + decimalFormat.format(total));        
  }
}
