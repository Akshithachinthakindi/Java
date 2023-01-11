package practice.basic.questions;

import java.util.Scanner;

public class Currency_convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your INR currency: ");
        float Inr_amount = input.nextLong();
        float dollars = Inr_amount/83;
        System.out.println(dollars + " " + "Dollars");

    }
}
