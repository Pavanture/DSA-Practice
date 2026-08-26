package Arrays;

import static java.util.Collections.reverse;

public class RotateArray {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,8,9};
//        5,6,7,8,9,2,3,4
        int n = arr.length;
        int d=3;
        d %= n;

        int[] temp = new int[n];
        int index = 0;

        for (int i = d; i < n; i++) {
            temp[index++] = arr[i];
        }
//        9,8,7,6,5

        for (int i = 0; i < d; i++) {
            temp[index++] = arr[i];
        }
//      4,3,2,9,8,7,6,5
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
// 5,6,7,8,9,2,3,4
    }
}
