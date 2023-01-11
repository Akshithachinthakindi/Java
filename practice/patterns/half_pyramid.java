package practice.patterns;
public class half_pyramid {
    public static void main(String args[]){
        int a = 5;
//        outer loop
        for (int i = 1; i <= a; i++){
//            inner loop
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
