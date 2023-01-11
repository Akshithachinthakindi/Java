package practice.basic;

import java.util.*;

public class a2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

//        -----------------------------------------
//        SWITCH STATEMENT

        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }

//        ---------------------------------------------
//        MORE IF AND ELSE IF STATEMENT
//        int button = sc.nextInt();
//        if(button == 1){
//            System.out.println("Hello");
//        } else if (button == 2){
//            System.out.println("Namaste");
//        } else if (button == 3){
//            System.out.println("Bonjour");
//        }
//        else {
//            System.out.println("Invalid Button2");
//        }
//        ------------------------------------------------
//        IF ELSE STATEMENT

//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        if (a==b) {
//            System.out.println("a and b are equal");
//        }
//        else if(a > b) {
//                System.out.println("a is greater");
//            }
//            else{
//                System.out.println("b is greater");
//            }


    }
}