package practice;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class inverted_pyramid {
    public static void main(String args[]){
        int a = 4;
//        outer loop
        for (int i =a; i>=1; i--){
//            inner loop
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
