import java.util.Scanner;   // ADDED
public class WhatToWear {
        public static void main(String[] args){
                // put code in here
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter username");

                String userName = myObj.nextLine();  // Read user input
                System.out.println("Username is: " + userName);  // Output user input
        }
}