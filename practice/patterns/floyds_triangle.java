package practice.patterns;

public class floyds_triangle {
    public static void main(String args[]){
        int n = 5;
        int number = 1;
//       outer loop
        for (int i =1; i<=n; i++){
//            inner loop
            for (int j = 1; j<=i; j++){
                System.out.print(number);
                number++; //number = number + 1
            }
            System.out.println();
        }
    }
}
