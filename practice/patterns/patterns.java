package practice.patterns;
import java.util.*;

public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;

//        --------------NESTED FOR LOOPS----------------
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("*");

        }
    }
}
//* * * * * *
//* * * * * *
//* * * * * *
//* * * * * *
//Process finished with exit code 0