package practice.class_task;

import java.util.Arrays;

public class second_largest {

    second_largest(int a[], int n) {
        Arrays.sort(a);
        int SecondLargest = 0;
        for (int i = n - 2; i >= 0; i--)
        {
            if (a[i] != a[n - 1])
            {
                SecondLargest = a[i];
                break;
            }
        }
        return SecondLargest;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int m = a.length;

        int op = second_largest(a, m);
        System.out.println("Second largest number is: " + op);
    }
}
