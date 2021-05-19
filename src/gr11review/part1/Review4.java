package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* Asks the user how many items he/she would like to purchase. The program then gets the prices for the items one by one. At the end of entering items, print out the total, the tax (13%) and the grand total.* @author: T. Lee
*
*/ 
 
/* Compile commands
javac -d bin src/gr11review/part1/Review4.java
java -classpath bin gr11review.part1.Review4
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review4Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review4Test
*/

public class Review4{

  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //Declare + initalize variables (if applicable)
    int numOfItems;
    double subtotal =0; 
    double price;
    double tax; 
    double total;

    //Record # of items user wants
    System.out.print("How many items do you want to buy? ");
    numOfItems = Integer.parseInt(key.readLine()); 

    /*For loop that counts from 1-#ofitems user requested above. 
    * Adds the subtotal
    */
    for(int i = 1; i <= numOfItems; i++){
      System.out.print("Enter the price for item " + i + ": ");
      price= Double.parseDouble(key.readLine());
      subtotal = subtotal + price;
    }

    //Calculate tax + total
    tax = subtotal*.13;
    total = subtotal *1.13;

    System.out.println("Subtotal: $" + decimalFormat.format(subtotal));  
    System.out.println("Tax: $" + decimalFormat.format(tax));
    System.out.println("Total: $" + decimalFormat.format(total));        
  }
}
