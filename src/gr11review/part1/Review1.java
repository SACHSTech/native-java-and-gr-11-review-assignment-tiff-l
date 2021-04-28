package gr11review.part1;
import java.io.*;

/**
* A program that asks the user to enter a month number and day and then prints the day of the year.
* @author: T. Lee
*
*/

//javac -d bin src/gr11review/part1/Review1.java
//java -classpath bin gr11review.part1.Review1

public class Review1{

  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Enter a month number: ");
    int monthNum = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    int dayNum = Integer.parseInt(key.readLine());


    if(monthNum==1){
      monthNum=0;
    } else if(monthNum==2){
      monthNum=31;
    }else if(monthNum==3){
      monthNum=59;
    }else if(monthNum==4){
      monthNum=90;
    }else if(monthNum==5){
      monthNum=120;
    }else if(monthNum==6){
      monthNum=151;
    }else if(monthNum==7){
      monthNum=181;
    }else if(monthNum==8){
      monthNum=212;
    }else if(monthNum==9){
      monthNum=243;
    }else if(monthNum==10){
      monthNum=273;
    }else if(monthNum==11){
      monthNum=304;
    }else if(monthNum==12){
      monthNum=334;
    }

    int dayYr = monthNum+dayNum;
    System.out.println(dayYr);        
  }
}