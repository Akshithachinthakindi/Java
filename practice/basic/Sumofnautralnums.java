import java.util.*;

public class Sumofnautralnums {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum = sum + i;
            System.out.print(sum + " ");
        }
    }
}
