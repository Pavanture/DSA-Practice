package Arrays;

public class SecondMaxElementOfArray {
    public static void main(String[] args) {
        int [] arr = {22,37,44,54,63,7,23,45};
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);

        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
