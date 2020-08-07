package com.home.library.JavaIntervew;

public class StringPassword {
    /*
	 Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
	 */
    public static void main(String[] args) {

        String passw = "WEdd345m#";
        System.out.println(Password(passw));
    }

    public static boolean Password(String str){

        boolean length = str.length()>=6;
        boolean lower = str.matches(".*[a-z].*");
        boolean upper = str.matches(".*[A-Z].*");
        boolean digit = str.matches(".*[0-9].*");
        boolean spec  = str.matches(".*[,./<>?;'#].*");

        boolean valid = length && lower && upper && digit && spec;

        if (valid){
            return true;
        }else {
            return false;
        }


    }

}
