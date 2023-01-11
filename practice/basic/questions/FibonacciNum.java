package practice.basic.questions;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num to find it's fibonacci num: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The fibonacci num of is: " + b);
    }
}
