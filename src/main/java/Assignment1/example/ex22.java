/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex22
{
    public static void main( String[] args )
    {
        System.out.print( "Enter the first number: " );
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        System.out.print( "Enter the second number: " );
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        System.out.print( "Enter the third number: " );
        Scanner num3 = new Scanner(System.in);

        int c = num3.nextInt();

        if (number1 > number2 && number1 > c) {
            System.out.println("The largest number is " + number1);
        }
        else if(number2 > c) {
            System.out.println("The largest number is " + number2);
        }
        else {
            System.out.println("The largest number is " + c + ".");
        }
    }
}
