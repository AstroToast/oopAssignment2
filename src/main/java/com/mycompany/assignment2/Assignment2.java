/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;
import java.util.*;

/**
 *
 * @author pickn
 */
public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("This is the selction menu to choose which assignment question to run.");
        
        while (true) {
            
        
            System.out.println("Please enter a number from 1-4 for the assignment (3 is broken down into a-c) or type 0 to end the program: ");


            switch(input.nextInt()) {
                case 0:
                    break;
                case 1:
                    question1();
                    continue;
                case 2:
                    question2();
                    continue;
                case 3:
                    while (true) {
                            System.out.println("Please enter the NUMBER of the part of question 3 to execute or 0 to quit:");
                            switch(input.nextInt()) {
                                case 0:
                                    break;
                                case 1:
                                    question3a();
                                    break;
                                case 2:
                                    question3b();
                                    break;
                                case 3:
                                    question3c();
                                    break;
                                default:
                                    System.out.println("Sorry that was out of bounds for question 3, enter a number from 1-3, or 0 to exit question 3");
                                    continue;
                            }
                            break;
                    }
                    continue;
                case 4:
                    question4(input);
                    continue;
                default:
                    System.out.println("Please enter a number from 1-4 or 0 to quit.");
                    continue;

            } 
            break;
        
        }
        
    }
    
    
    
    public static void question1() {
        System.out.println("Here are all numbers from 1-10,000 that are prime numbers:");
        int i = 1, num = 2;
        System.out.println("2"); 
        while (num <= 10000) {
            while (i < num) {
                if (num%i == 0) {
                    break;
                } else if (i+1 == num) {
                    System.out.println(num);
                }
                i++;
            }
            num++;
            i = 2;
        }
    }
    
    public static void question2() {
        System.out.println("Here are all numbers from 1-10,000 that are prime numbers:");
        System.out.println("2"); 
        int hasDivisor = 0;
        for (int num = 2; num <= 10000; num++) {
            for (int i = 2; i < num; i++) {
                switch (num%i) {
                    case 0:
                        hasDivisor = 1;
                        break;
                    default:
                        switch (num -(i+1)) {
                            case (0):
                            switch (hasDivisor) {
                                case (0):
                                    System.out.println(num);
                            }  
                        }
                }
            }
            hasDivisor = 0;
        }
    }
    
    
    public static void question3a() {
        int y = 8;
        int x =5;
        
        if ( y == 8 )
        if ( x == 5 ) {
        System.out.println( "@@@@@" );
        } else {
            System.out.println( "#####" ); 
        }
        System.out.println( "$$$$$" );
        System.out.println( "&&&&&" );
    }
    
    public static void question3b() {
        int y = 8;
        int x =5;
        
        if ( y == 8 )
        if ( x == 5 ) {
            System.out.println( "@@@@@" );
        } else {
            System.out.println( "#####" ); 
            System.out.println( "$$$$$" );
            System.out.println( "&&&&&" );
        }
    }
    
    public static void question3c() {
        int y = 7;
        int x =5;
        
        if ( y == 8 ) {
        if ( x == 5 ) {
            System.out.println( "@@@@@" );
        }} else {
            System.out.println( "#####" ); 
            System.out.println( "$$$$$" );
            System.out.println( "&&&&&" );
        }
    }
    
    
    public static void question4(Scanner input ) { // I'm passing a scanner since it's more effecient in memory
        int num1 = 0, num2;
        
        System.out.println("This program adds 2 numbers until told to stop.");
        while(true) { 
            System.out.println("Please enter a number (0 to exit): ");
            num2 = input.nextInt();
            if (num2 == 0) {
                break;
            } else {
                num1+=num2;
            }
            
            
        }
        System.out.println("The sum of the inputted numbers is: " + num1);
    }
}
