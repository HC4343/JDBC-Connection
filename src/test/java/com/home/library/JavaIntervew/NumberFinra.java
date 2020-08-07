package com.home.library.JavaIntervew;

public class NumberFinra {

    public static void main(String[] args) {


        String result = "";
        for (int i = 0; i<30; i++ ){
            if (i%5==0 && i%3==0){
                result +="FINRA  ";

            }else if(i%5==0){
                result +="RA  ";

            }else if (i%3==0){
                result +="FIN  ";
            }else {
                result +=i+" ";
            }

        }
        System.out.println(result);

    }


}
