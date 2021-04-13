package com.company;
//All code in Java is inside of a class
import java.util.Scanner;

public class Main {
//every legal java program has an entry point. The entry point is the main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //println() is a method call. It will print in a new line
        System.out.println("Hello, World!");
//        print() will simply print
        System.out.print("Hola, World!");
        System.out.println("What is your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName);
        System.out.printf("Goodbye %s!\n", firstName);
    }
}
