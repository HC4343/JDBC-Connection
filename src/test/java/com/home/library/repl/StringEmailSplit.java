package com.home.library.repl;

public class StringEmailSplit {
    /*
    Write a program that will print out information about user based on email.
     Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
     */

    public static void main(String[] args) {

        String email ="goksal_cavdaro@gmail.com";

        String firstName = email.substring(0,1).toUpperCase()  +  email.substring(1,email.indexOf("_")).toLowerCase();
        String sureName  = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()  +
                           email.substring(email.indexOf("_")+2,email.indexOf("@")).toLowerCase();
        String domain    = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String levelDomain=email.substring(email.indexOf(".")+1);

        System.out.println("First name is: "+firstName+"\n");
        System.out.println("Last name is: "+ sureName+ "\n");
        System.out.println("Domainname is : "+ domain+ "\n");
        System.out.println("Level of domain is : "+ levelDomain+"\n");


    }


}
