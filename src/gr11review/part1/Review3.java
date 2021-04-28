package gr11review.part1;
import java.io.*;


/**
* A program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in decreasing order.
* @author: T. Lee
*
*/ 

//javac -d bin src/gr11review/part1/Review3.java
//java -classpath bin gr11review.part1.Review3


public class Review3{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    

    for(int i = 21; i <= 100; i = i + 2){
      System.out.println(i);
    }
    
    for(int n = 29; n >= 2; n--){
      System.out.println(n);
    }
        
  }
}