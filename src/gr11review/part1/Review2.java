package gr11review.part1;
import java.io.*;

/**
* A program that prints out a statement of options. Allow the user to select an option and react appropriately to the option selection using a switch case structure.
* @author: T. Lee
*
*/

//javac -d bin src/gr11review/part1/Review2.java
//java -classpath bin gr11review.part1.Review2


public class Review2{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("0 - Print a joke about your hair");
    System.out.println("1 - Print a joke about your feet");
    System.out.println("2 - Print a joke about your clothes");
    System.out.println("3 - Print a joke about your teacher");

    System.out.print("Choose a menu option: ");

    int MenuNum = Integer.parseInt(key.readLine());

    if(MenuNum==0){
      System.out.println("Have no hair?");
      System.out.println("Because he didn't condition it.");
    }else if(MenuNum==1){
      System.out.println("Why do Canadian cowboys have sticky feet?");
      System.out.println("Maple Stirrups.");
    }else if(MenuNum==2){
      System.out.println("What is DNA’s favourite piece of clothing ?");
      System.out.println("Jeans (genes)");
    }else if(MenuNum==3){
      System.out.println("How is an English teacher like a judge?");
      System.out.println("They both give out sentences.");
    }else{
      System.out.println("Invalid menu option");
    }
        
  }
}