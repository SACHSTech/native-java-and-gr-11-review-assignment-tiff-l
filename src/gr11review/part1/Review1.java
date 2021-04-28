package gr11review.part1;
import java.io.*;

/**
* A program that asks the user to enter a month number and day and then prints the day of the year.
* @author: T. Lee
*
*/

/* Compile commands
javac -d bin src/gr11review/part1/Review2.java
java -classpath bin gr11review.part1.Review2
javac -d bin src/gr11review/part1/Review1.java; javac -d bin -sourcepath src -classpath lib/junit-platform-console-standalone-1.7.0-M1.jar src/gr11review/test1/Review1Test.java
java -jar lib/junit-platform-console-standalone-1.7.0-M1.jar --class-path bin -c gr11review.test1.Review1Test
*/

public class Review1{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    //Define variables
    int monthNum
    int dayNum 
    int dayYr

    System.out.print("Enter the month number: ");
    monthNum = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    dayNum = Integer.parseInt(key.readLine());

    //if statements, accordingly adds the number of days passed at the start of each month (#s 1-9 correlate with the months: Jan - Dec)

    if(monthNum == ){
      monthNum = 0;
    } else if(monthNum == 2){
      monthNum = 31;
    }else if(monthNum == 3){
      monthNum = 59;
    }else if(monthNum == 4){
      monthNum=90;
    }else if(monthNum == 5){
      monthNum =120;
    }else if(monthNum == 6){
      monthNum = 151;
    }else if(monthNum == 7){
      monthNum = 181;
    }else if(monthNum == 8){
      monthNum = 212;
    }else if(monthNum == 9){
      monthNum = 243;
    }else if(monthNum==10){
      monthNum=273;
    }else if(monthNum == 11){
      monthNum = 304;
    }else if(monthNum == 12){
      monthNum = 334;
    }

    //Calculate + print the day of the yr
    dayYr = monthNum + dayNum;
    System.out.println(dayYr);        
  }
}