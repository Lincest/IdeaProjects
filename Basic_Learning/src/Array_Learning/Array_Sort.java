package Array_Learning;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        int a[] = new int[]{56,14,92,1,1234,23,41,2};

        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
