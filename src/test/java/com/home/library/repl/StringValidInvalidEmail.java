package com.home.library.repl;

import java.util.Arrays;

public class StringValidInvalidEmail {
    /*
    Given a String variable email, write code using split method to print email id and domain in separate lines.
Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:
email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
     */
    public static void main(String[] args) {

        String email = "info@cybertekschool.com";

        String[] arr = email.split("@");

        System.out.println("Email id: "+arr[0]);
        System.out.println("Domain name : "+ arr[1]);

        int count=0;
        for (int i=0; i<email.length(); i++){
            if (email.substring(i,i+1).equalsIgnoreCase("@")){
                count ++;
            }
        }

        if (count==1 && !email.substring(email.length()-1).equalsIgnoreCase("@")){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }


    }




}
