package Arrays;

public class ProductOfElement {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7};
        int product = 1;
        for(int i=0; i<= arr.length-1; i++){
            product=product*arr[i];
        }
        System.out.println(product);
    }
}
