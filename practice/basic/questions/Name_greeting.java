package practice.basic.questions;

import java.util.Scanner;

public class Name_greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        String greeting = ("Hello "+ name + "! Good morning!");
        System.out.println(greeting);
    }
}
