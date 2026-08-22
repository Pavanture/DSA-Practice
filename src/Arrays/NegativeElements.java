package Arrays;

public class NegativeElements {
    public static void main(String[] args) {
        int [] arr = {1,4,9,-23,45,-54,-4,34,67,-1,7};
        int length = arr.length;
        for(int i=0; i<= length-1; i++){
            if (arr[i]<=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
