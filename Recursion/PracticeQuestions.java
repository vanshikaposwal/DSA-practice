package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PracticeQuestions {

    static void main() {
        // factorial of n
        System.out.println(product_ofN_numbers(5));

        // Sum of numbers N to 1
        System.out.println(sumNto1(5));

        //Sum of digits of a numbers
        System.out.println(sumOfDigits(1342));

        //Product of digits of a numbers
        System.out.println(productOfDigits(4568));

        // Reverse  the number
        System.out.println(reverseTheNumber(123485));


        // Count Zeros in the givem number
        System.out.println(countZeros(100002030));

        int[] arr = {1,2,3,4,6};
        // is Array sorted
        System.out.println(sorted(arr,0));

        // searching an element in array using linear search
        int[] arr1 = {1,22,4,2,7,8,1,44,5,33,88,5,22};
        System.out.println(linearSearch(arr1, 22));
    }

    static int product_ofN_numbers(int n){
        if(n==1){
            return 1;
        }
        return n*product_ofN_numbers(n-1);
    }

    static int sumNto1(int n){
        if(n==0){
            return 0;
        }
        return n+sumNto1(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        return digit+sumOfDigits(n/10);
    }

    static int productOfDigits(int n){

        if(n%10 == n){
            return n;
        }

        return (n%10) * productOfDigits(n/10);
    }

    static int countDigits(int n){
        if(n%10 == n){
            return 1;
        }
        return 1+countDigits(n/10);
    }

    static int reverseTheNumber(int n){
        int count = countDigits(n);
        if(count == 1){
            return n%10;
        }
        return (n%10) *Math.powExact(10,count-1) + reverseTheNumber(n/10);
    }

    static int countZeros(int number){
        if(number%10 == number){
            return 0;
        }

        if (number%10==0){
            return 1 + countZeros(number/10);
        }else {
            return countZeros(number/10);
        }
    }

    static boolean isSorted(int[] arr){
        return helper(arr, 0,1);
    }

    static boolean helper(int[] arr, int i, int j){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }else {
            return helper(arr, i+1, i+2);
        }


    }

    static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }

        return arr[i] < arr[i+1] && sorted(arr,i+1);
    }

    static int linearSearch(int[] arr, int target){
        return searchHelper(arr, target, 0);
    }

    static int searchHelper(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchHelper(arr, target, index+1);
    }

    static  int linearSearchLast(int[] arr, int target){
        return searchHelper1(arr, target, arr.length-1);
    }
    static int searchHelper1(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchHelper(arr, target, index-1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){

        ArrayList<Integer> list  = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> allOftheAbove = findAllIndex(arr, target, index+1);

        list.addAll(allOftheAbove);

        return list;
    }



}