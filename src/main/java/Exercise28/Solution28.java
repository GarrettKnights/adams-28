/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise28;

//Imports all java util
import java.util.*;

public class Solution28 {
    public static void main (String[] args)
    {
        //Defines the variables that we will be using
        double Counter = 0;
        double Total = 0;
        double UserNum;

        //Sets up the Scanner
        Scanner ScanWord = new Scanner(System.in);
        //While the counter is less than or equal 4, (starts at 0, counts to 4 for a total of 5)
        while(Counter <= 4){
            //Prompts user for input
            System.out.println("Enter a number: ");
            //Scans user input to UserNum
            UserNum =ScanWord.nextDouble();
            //Sets the total to the total + the user input
            Total = Total + UserNum;
            //Counter ticks up 1
            Counter = Counter + 1;
        }
        //Prints out the total of the numbers after the loop is finished
        System.out.println("The total is " + Total + ".");
    }
}

