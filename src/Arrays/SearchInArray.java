package Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;

        for(int i=0; i<=arr.length-1; i++){
            if(target==arr[i]){
                System.out.println(i);
            }
        }
    }
}
