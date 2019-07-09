package Array_Learning;

import java.util.Arrays;

public class Array_Fill {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr,94);
            System.out.println(arr[i]);
        }
        int arr2[] = new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.fill(arr2,1,4,0);// 具有批量替换的效果
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
