package practice.basic.questions;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int principal = input.nextInt();
        System.out.print("Enter time: ");
        int time = input.nextInt();
        System.out.print("Enter rate: ");
        int rate = input.nextInt();

//        int A;
        int A = (principal * rate * time)/100;
        System.out.println("Simple Interest is: " + A);
    }
}
