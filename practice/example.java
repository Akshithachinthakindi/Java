package practice;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Syntax of if statements:
         */
        while (true) {
            System.out.print("Enter your Age: ");
            int age = in.nextInt();
            if (age > 18) {
//                salary = salary + 5000;
                System.out.println("Voila! You're an Adult.");
            } else if (age > 50) {
                System.out.println("Oh! You're a Musalodu.");
            } else  {
//                salary = salary + 2500;
                System.out.println("Oops! You're still a Kiddo.");
            }
//            System.out.println();
        }
    }
}
