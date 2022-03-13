package com.support.admin.model;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String dept1 = "1. Technical";
        String dept2 = "2. Admin";
        String dept3 = "3. Human Resource";
        String dept4 = "4. Legal";                                                    // initialising the departments

        System.out.println("\nWelcome to TechPeople! \nThe following are the departments: ");
        System.out.println(dept1);
        System.out.println(dept2);
        System.out.println(dept3);
        System.out.println(dept4);          //displaying the departments


        Scanner input = new Scanner(System.in);          
        System.out.println("Please select your department: ");                          //taking input from the user
        byte selection = input.nextByte();


            if (selection == 1){
                System.out.println(dept1);
            }
            else if (selection == 2){
                System.out.println(dept2);
            }
            else if (selection == 3){
                System.out.println(dept3);
            }
            else if (selection == 4){
                System.out.println(dept4);
            }
            else {
                System.out.println("Please enter the correct number!!");
            }

        Scanner firstName = new Scanner(System.in);                                                     //accepting employees credentials
        System.out.println("Enter Employee First Name: ");
        Scanner lastName = new Scanner(System.in);
        System.out.println("Enter Employee Last Name: ");

        String userName = firstName.nextLine();
        String userName1= lastName.nextLine();

        System.out.println("Please find below your credentials:");
        System.out.println("Your email ID is: " + userName + userName1  + "@tech-people.com");             //generating user name

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int stringLength = 15;

        for(int i=0; i<stringLength; i++){
            int randomNum = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(randomNum);

            sb.append(randomChar);
        }
        String randomString = sb.toString();                                                        //generate password and display the credentials
        System.out.println("Password : " + randomString);

    }
}
