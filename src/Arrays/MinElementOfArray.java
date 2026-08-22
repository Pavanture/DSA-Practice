package Arrays;

public class MinElementOfArray {
    public static void main(String[] args) {
        int [] arr = {10,-20,30,-40,50};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
