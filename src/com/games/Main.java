package com.games;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MMM d, uuuu");
        String currentDate = LocalDate.now().format(myFormatter);

        boolean addDays = false;
        boolean subDays = false;

        int addedDays = 0;
        int subbedDays = 0;


        System.out.println("************************************");
        System.out.println("****  Welcome to DateConverter  ****");
        System.out.println("************************************");


        System.out.println("\nToday's date is: " + currentDate );


        while (!addDays ^ subDays) {
            System.out.println("\nIf you would like to add days, please enter a (+)" );
            System.out.println("If you would like to add days, please enter a (-)" );
            System.out.println("If you would like to do neither, please enter (skip)");
            String userResponse = scanner.nextLine();
            if (userResponse.equals("+")) {
                System.out.println("\nHow many days would you like to add?:");
                addedDays = Integer.parseInt(scanner.nextLine());
                addDays = true;
            }
            else if (userResponse.equals("-")) {
                System.out.println("\nHow many days would you like to subtract?:");
                subbedDays = Integer.parseInt(scanner.nextLine());
                subDays = true;
            }
            else if (userResponse.equalsIgnoreCase("skip")) {
                break;
            }
            else {
                System.out.println(ANSI_RED + "\n\t** Please enter a valid Response **".toUpperCase() + ANSI_RESET);
            }
        }
        if(addDays) {
            System.out.println("\n\tUser wants to add " + addedDays + " days");
        }
        else if(subDays) {
            System.out.println("\n\tUser wants to subtract " + subbedDays + " days");
        }
        else {
            System.out.println("\n\tUser wants to do nothing");
        }








    }

}
