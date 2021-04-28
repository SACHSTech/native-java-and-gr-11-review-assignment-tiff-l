package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that simulates 1000 pulls of a slot machine, such that 3 random numbers (between 0 and 8) are generated for each pull. Output the result of each pull on a single line (a space separating the 3 numbers) and the total count of the number times a triple (all 3 numbers equal) was pulled.
* @author: T. Lee
*
*/ 

/*
javac -d bin src/gr11review/part1/Review8.java
java -classpath bin gr11review.part1.Review8
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review8Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review8Test
*/
public class Review8{

  public static void main(String[] args) throws IOException{

  int triples;
  int pull[][];
  int i;
  int n;
  
  pull = new int[1000][3];

  triples = 0;

  for (i = 0; i < 1000; i++) {
    for (n = 0; n < 3; n++) {
      pull[i][n] = (int)(Math.random()*9);
      System.out.print(pull[i][n]+" ");
    }

    System.out.println("");

    if(pull[i][0] == pull[i][1] && pull[i][1] == pull[i][2]){
      triples++;
    }
  }
  System.out.println(triples);
  }
}
