package com.home.library.repl;

public class StringSandwich {

    public static void main(String[] args) {

        String str = "bread345breadKK";
        String between = "Nothing";

        if (str.indexOf("bread") !=-1  )  // -1 bread'i ilk karsiladiktan sonra demek.!!! Yani, ilk geldigi indexin onemi yok
                                                                                            // hangi index olursa olsun.
            if(str.lastIndexOf("bread") != str.indexOf("bread"))
                between = str.substring(str.indexOf("bread") + 5,  str.lastIndexOf("bread"));

        System.out.println(between);
    }


}
