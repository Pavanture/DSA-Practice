package Arrays;
//Problem: "The Birthday Budget"You are buying two gifts for a friend's birthday.
// You have a strict total budget of 13 dollars.Here is an array of gift prices available in the shop:
// prices = [3, 7, 2, 6, 11]
// Find the indices (positions) of the two gifts that add up exactly to your budget of 13.


public class TwoSumProblem {
    public static void main(String[] args) {
        int [] price = {3,7,2,6,11};
        int budget = 13;
        for(int i=0; i<price.length; i++){
            for(int j=i+1; j< price.length; j++){
                if(price[i]+price[j]==budget){
                    System.out.println("Gifts found at index: (" + i + ", " + j + ")");
                }
            }
        }

    }
}
