package practice.basic.questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);

       while(true) {
           System.out.print("Enter an alphabet from a to z: ");
           char ch = in.next().trim().charAt(0);
//           System.out.println(ch);
           if (ch >= 'a' && ch <= 'z') {
               System.out.println("You have entered LowerCase alphabet");
           } else {
               System.out.println("You have entered UpperCase alphabet: ");
           }
       }


//----------------------------------------------------
//        int a = 10;
//        int b = 20;

//        if (a == 10 & or || b = 20) {
//            System.out.println("Hii");
//        }
    }
}
