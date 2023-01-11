package practice.basic.questions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = input.next();
        int start = 0;
        int end = S.length() - 1;

        boolean isPalindrome = true;
        while(start<end) {
            if (S.charAt(start) != S.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Entered string is Palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }
}
