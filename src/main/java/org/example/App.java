package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        double euros = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchangerate = sc.nextDouble();
        double euroconverted = exchangerate * euros;
        System.out.println(euros + " euros at an exchange rate of " + exchangerate + " is ");
        System.out.println(Math.round(euroconverted*100)/100.0 + " U.S. dollars.");
    }
}
