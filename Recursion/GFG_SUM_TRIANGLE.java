package Recursion;

import java.util.ArrayList;

public class GFG_SUM_TRIANGLE {

    static void main() {

    }

    public ArrayList<Integer> getTriangle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: arr){
            list.add(n);
        }

        return helper(list, list.size());
    }

    public static ArrayList<Integer>helper(ArrayList<Integer> list, int count){
        if(count == 0){
            return list;
        }
        
    }
}
