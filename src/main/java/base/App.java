package base;

import  java.util.Scanner;
import java.util.Calendar;

/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int year = myApp.getYear();

        int age = myApp.getAge();
        int retirementAge = myApp.getRetirementAge();

        int yearsTillRetirement = retirementAge - age;
        int retirementYear = year + yearsTillRetirement;

        myApp.printOutput(year, yearsTillRetirement, retirementYear);
    }

    public void printOutput(int year, int yearsTillRetirement, int retirementYear) {
        System.out.println("You have " + yearsTillRetirement + " years left until you can retire.");
        System.out.println("It's " + year +", so you can retire in " + retirementYear);
    }

    public int getRetirementAge() {
        System.out.println("At what age would you like to retire? ");
        String retirementAgeInput = in.nextLine();
        return Integer.parseInt(retirementAgeInput);
    }

    public int getAge() {
        System.out.println("What is your current age? ");
        String ageInput = in.nextLine();
        return Integer.parseInt(ageInput);
    }

    public int getYear() {
        Calendar date = Calendar.getInstance();
        return date.get(Calendar.YEAR);
    }

}
