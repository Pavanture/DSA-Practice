package Arrays;

public class MaxElementOfArray {
    public static void main(String[] args) {
        int [] arr = {10,34,24,2,55,4,56,32,3,23,3};
        int Max = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(Max<arr[i]){
                Max = arr[i];
            }

        }
        System.out.println(Max);
    }
}
