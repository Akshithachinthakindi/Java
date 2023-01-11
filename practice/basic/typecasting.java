package practice;

import java.util.Scanner;

public class typecasting {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

//        TYPECASTING SYNTAX;

        int a = (int)(223.79f);
        System.out.println(a);

        int num = 'A';
        System.out.println(num); //another type of typecasting.

//        ****IMPORTANT POINT TO NOTE******

//          java is unicode language which means we can write any language. we
//        can print any language by copying and pasting it to the editor.

        System.out.println("నమస్కారం");
    }
}
