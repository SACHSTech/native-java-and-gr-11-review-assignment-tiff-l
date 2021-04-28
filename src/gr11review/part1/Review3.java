package gr11review.part1;
import java.io.*;


/**
* A program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in decreasing order.
* @author: T. Lee
*
*/ 

/*
javac -d bin src/gr11review/part1/Review3.java
java -classpath bin gr11review.part1.Review3
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review3Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review3Test
*/


public class Review3{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    

    for(int i = 21; i <= 100; i = i + 2){
      System.out.println(i);
    }

    System.out.println("");
    
    for(int n = 29; n >= 2; n--){
      System.out.println(n);
    }
        
  }
}