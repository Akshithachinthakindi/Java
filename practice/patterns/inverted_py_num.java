package practice.patterns;

public class inverted_py_num {
    public static void main(String args[]){
        int  n = 5;
//        ouetr loop
        for (int i =1; i <= n; i++){
//            inner loop
            for (int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
