package com.company;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String name= "John";
        String position;
        String hiredDate;
        int salary;
        float rating;

        Scanner input= new Scanner(System.in);

        System.out.println("Title");
        position= input.nextLine();

        System.out.println("Employee hiring date (mm/dd/yyyy): ");
        hiredDate= input.nextLine();

        System.out.println("Employee Salary: ");
        salary= input.nextInt();

        System.out.println("Employee Rating: ");
        rating= input.nextFloat();
    }
}
