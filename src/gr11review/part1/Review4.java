package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* Asks the user how many items he/she would like to purchase. The program then gets the prices for the items one by one. At the end of entering items, print out the total, the tax (13%) and the grand total.* @author: T. Lee
*
*/ 

//javac -d bin src/gr11review/part1/Review4.java
//java -classpath bin gr11review.part1.Review4


public class Review4{

  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int numOfItems;
    double subtotal =0; 
    double price;
    
    
    System.out.print("How many items do you want to buy? ");
    numOfItems = Integer.parseInt(key.readLine()); 

    for(int i = 1; i <= numOfItems; i++){
      System.out.print("Enter the price for item " +i+ ": ");
      price= Double.parseDouble(key.readLine());
      subtotal = subtotal + price;
    }

    double tax; 
    double total;

    tax = subtotal*.13;
    total = subtotal *1.13;

    System.out.println("Subtotal: $" + decimalFormat.format(subtotal));  
    System.out.println("Tax: $" + decimalFormat.format(tax));
    System.out.println("Total: $" + decimalFormat.format(total));        
  }
}
