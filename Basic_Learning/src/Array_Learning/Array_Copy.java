package Array_Learning;

import java.util.Arrays;

public class Array_Copy {
   
    public static void main(String[] args) {
        int a[] = new int[]{23,52,12};

        int newarr1[] = Arrays.copyOf(a,3);
        int newarr[] = Arrays.copyOfRange(a,0,3);

        for (int i : newarr) {
            System.out.println(i);
        }
        System.out.println(" ----------- ");
        for (int i : newarr1) {
            System.out.println(i);
        }
    }
}
