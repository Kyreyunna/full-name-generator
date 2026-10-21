package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter suffix: ");
        String suffix = scanner.nextLine();

        String fullName = "";
        fullName = firstName + lastName;
        //fullName = fullName + middleName;

        String ifMiddle = "";
        ifMiddle = firstName + middleName + lastName;
        ifMiddle = "";

        String ifSuffix = "";
        ifSuffix = fullName + suffix;

        //String;

        boolean ifMiddleIsBlank = ifMiddle.isEmpty();

        if (ifMiddleIsBlank){
            System.out.println(ifMiddle);

        }



        boolean ifSuffixIsBlank = ifSuffix.isEmpty();

        if (ifSuffixIsBlank){
            System.out.println(ifSuffix);
        }


//        if (ifMiddleIsBlank){
//
//            System.out.println("your name is: " + ifMiddle);
//            String ifMiddle = firstName + middleName + lastName + suffix;
//        }
//
//        if (String = ifSuffix) {
//            String ifSuffix = firstName + middleName + lastName + suffix;
//            System.out.println("your name is: " + ifSuffix);
//        }
//        String fullName = firstName + middleName + lastName + suffix;
//        //String fullName=scanner.nextLine();
//        String fullName = fullName.trim();
//        System.out.println("[" + fullName + "]");

        System.out.println(firstName + " " + middleName + " " + lastName + " " + suffix );
    }
}
