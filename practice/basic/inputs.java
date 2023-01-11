package practice;

import java.util.Scanner;

public class inputs {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter you name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);

//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        System.out.println("Your age is: " + age);

        System.out.print("Enter your Email Address: ");
        String email = input.nextLine();
        System.out.println("Your email address is: " + email);
    }
}
