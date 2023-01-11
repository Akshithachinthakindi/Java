package practice.basic.questions;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        System.out.print("Enter c: ");
        int c = in.nextInt();

//        System.out.println("a is: " + a);
//        System.out.println("b is: " + b);
//        System.out.println("c is: " + c);

        int largest = a;

        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        } else
        System.out.println("Largest Number is: " + largest);


    }
}
