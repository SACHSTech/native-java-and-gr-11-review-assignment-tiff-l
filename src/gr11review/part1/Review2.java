package gr11review.part1;
import java.io.*;

/**
* A program that prints out a statement of options. Allow the user to select an option and react appropriately to the option selection using a switch case structure.
* @author: T. Lee
*
*/

/* Compile commands
javac -d bin src/gr11review/part1/Review2.java
java -classpath bin gr11review.part1.Review2
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review2Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review2Test
*/

public class Review2{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");

    System.out.print("Choose a menu option: ");

    //Declare variables
    int MenuNum; 

    MenuNum = Integer.parseInt(key.readLine());

    //if choice is 0, print joke about hair
    if(MenuNum == 0){
      System.out.println("Have no hair?");
      System.out.println("Because he didn't condition it.");

    //if choice is 1, print joke about feet
    }else if(MenuNum == 1){
      System.out.println("Why do Canadian cowboys have sticky feet?");
      System.out.println("Maple Stirrups.");

    //if choice is 2, print joke about clothes
    }else if(MenuNum == 2){
      System.out.println("What is DNA’s favourite piece of clothing ?");
      System.out.println("Jeans (genes)");

    //if choice is 3, print joke about teacher
    }else if(MenuNum == 3){
      System.out.println("How is an English teacher like a judge?");
      System.out.println("They both give out sentences.");

    //if none of the above, tell user invalid
    }else{
      System.out.println("Invalid menu option");
    }
        
  }
}