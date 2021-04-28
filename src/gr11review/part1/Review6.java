package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
*A cash register program similar to the one above, except instead of prompting for the number items, the user is able to keep entering item prices until the enter 0. Import and use the java.text.DecimalFormat class to output the information in currency format (0.00)
* @author: T. Lee
*
*/ 

//javac -d bin src/gr11review/part1/Review6.java
//java -classpath bin gr11review.part1.Review6


public class Review6{

  public static DecimalFormat decimalFormat = new DecimalFormat("0.00");

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int numOfItems;
    double subtotal =0; 
    double price =1;
    int i =0;
    
    while (price!=0){
      i++;
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
