/*
Given a String S, reverse the string without reversing its individual words.
Words are separated by dots.
*/

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        reverseWords(S);
    }

    static String reverseWords(String S)
    {
        String cadena = S;
        String [] arrString = cadena.split("\\.");
        String reeverseCadena = "";
        int len = arrString.length;

        //System.out.println(len);

        for (int i = len -1; i >= 0; i--){
            if(i+1 == 1){
                reeverseCadena=reeverseCadena.concat(arrString[i]);
            }else{
                reeverseCadena=reeverseCadena.concat(arrString[i])+".";
            }
        }
        //System.out.println(reeverseCadena);
        return reeverseCadena;
    }

    static String reverseString(String S)
    {
       String cadena = S;
       String reverseCadena = "";

       int len = cadena.length();

       for(int i= len-1 ; i >= 0; i --){
           reverseCadena = reverseCadena+cadena.charAt(i);
       }
        System.out.println(reverseCadena);

       return reverseCadena;

    }
}