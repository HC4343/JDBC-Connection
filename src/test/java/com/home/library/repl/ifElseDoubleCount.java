package com.home.library.repl;

public class ifElseDoubleCount {


    public static void main(String[] args) {

        double units = 60;
        System.out.println(Price(units));

    }

    public static double Price(double units){
        double bill = 0.0;

        //your code here
        if(units>50){
            if(units>50 && units<100){
                bill=units*0.90;
            }
            if(units>100 && units<150){
                bill=units*0.90+50;
            }
            if(units>150){
                bill=units*0.90+100;
            }
        }else{
            bill=units*0.60;
        }
        //end your code here
        return bill;



    }
}
