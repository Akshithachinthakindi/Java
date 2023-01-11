package practice.patterns;
public class hollow_rectangle {
    public static void main(String args[]){
//        System.out.println("Hello akshitha chinthakindi");
        int a = 4;
        int b = 5;

//        outer loop
        for (int i=1;i<=a;i++){
//            inner loop
            for (int j=1;j<=b;j++){
//                cell -> (i,j)
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
