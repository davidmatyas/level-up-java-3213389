package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App 
{
public static boolean isEven(int n){
    return n % 2 == 0;
}
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        System.out.println("Is number even " + isEven(number));
        scanner.close();
    }
}
