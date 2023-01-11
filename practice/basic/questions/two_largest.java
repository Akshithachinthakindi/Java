package practice.basic.questions;

import java.util.Scanner;

public class two_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        if (num1>num2) {
            System.out.println(num1 + " " + "is largest");
        } else {
            System.out.println(num2 + " " + "is largest");
        }
    }
}
