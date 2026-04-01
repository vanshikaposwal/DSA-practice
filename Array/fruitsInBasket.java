package Array;

import java.util.HashMap;
import java.util.HashSet;

public class fruitsInBasket {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 2, 2, 3, 3, 4, 4, 3, 4, 3};
        System.out.println(totalFruits(arr));
    }

    static int totalFruits(int[] fruits){
        int left=0, right=0;

        int basket1 = fruits[right], basket2 = -1;

        for(; right<fruits.length; right++){
            if(fruits[right]!=basket1){
                basket2 = fruits[right];
                break;
            }
        }

        int length=0, maxLength =0;

        right=1;

        for(; right<fruits.length; right++){
            if(fruits[right] == basket1 || fruits[right] == basket2){
                length = right-left+1;
            }else {
                left = right-1;
                while (left>=0 && fruits[left] == fruits[right-1]){
                    left--;
                }

                if(fruits[left] == basket1){
                    basket1 = fruits[right];
                }else {
                    basket2= fruits[right];
                }
                left++;
            }

            maxLength  = Math.max(length, maxLength);
        }
        return maxLength;
    }

}
