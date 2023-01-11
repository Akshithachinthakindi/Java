package practice.class_task;

import java.util.Scanner;

public class classtask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter m: ");
//        int m = input.nextInt();
//        System.out.print("Enter n: ");
//        int n = input.nextInt();

        for(int i = 1; i <= 16; i++) {
            if (i%3 == 0 && i%5 == 0)
                System.out.println("Fun Task");
             else if(i%3 == 0)
                System.out.println("Fun");
            else if (i%5 == 0)
                System.out.println("Task");
        }
    }
}
