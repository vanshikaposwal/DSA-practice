package Array;

import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.TreeSet;

public class Union {
    public static void main(String[] args){
        int[] arr1 = {1,1,2,3,4,5,6};
        int[] arr2 = {1,3,5,7,9,10};
        System.out.println(findUnion(arr1,arr2));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> union = new ArrayList<>();

        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }

        for(int i: set){
            union.add(i);
        }

        return union;
    }
}
