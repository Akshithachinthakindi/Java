package practice;

import java.util.Scanner;

public class TempCF {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in celcius: ");
        float TempC = input.nextFloat();
        float TempF = (TempC * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit is: " + TempF);
    }
}
