package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that will input a sentence from the user and store it in a String variable called theSentence. Use the String methods to compute the following about the sentence: # of character,s spaces + letters, and taking the odd numbered characters in the senetnece produces the following string"---". 
* @author: T. Lee
*
*/ 

/*
javac -d bin src/gr11review/part1/Review7.java
java -classpath bin gr11review.part1.Review7
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review7Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review7Test
*/
public class Review7{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    String theSentence = key.readLine();

    int length = theSentence.length(); 
    int space = 0; 
    int letterA = 0; 
    String oddWord = ""; 
    char character;

    for (int i = 0; i < length; i++){
         
      character= theSentence.charAt(i);
      if(character== 'a'||character== 'A'){
        letterA++; 
      }else if(character==' '){
        space++;
      }

    }

    for (int n = 1; n<length; n=n+2){
      oddWord = oddWord + theSentence.charAt(n);
    }

    System.out.println("There are " +length+ " characters in the sentence. ");
    System.out.println("There are " +space+ " spaces in the sentence. ");
    System.out.println("There are " +letterA+ " letter a in the sentence. ");
    System.out.println("Taking the odd numbered characters in the sentence produces the following string " +oddWord );


  }
}
